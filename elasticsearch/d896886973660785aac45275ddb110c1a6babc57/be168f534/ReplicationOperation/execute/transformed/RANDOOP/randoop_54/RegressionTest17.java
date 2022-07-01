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
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.Index index7 = retryOnPrimaryException5.getIndex();
        java.lang.String str8 = retryOnPrimaryException5.getResourceType();
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException5.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];");
        retryOnPrimaryException10.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.Index index15 = retryOnPrimaryException13.getIndex();
        boolean boolean16 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException13);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(index15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException34.getHeader("");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray38 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        java.lang.Throwable throwable42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "hi!", throwable42);
        java.lang.Throwable throwable44 = retryOnPrimaryException43.unwrapCause();
        java.lang.String str45 = retryOnPrimaryException43.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray46 = retryOnPrimaryException43.guessRootCauses();
        java.lang.String[] strArray54 = new java.lang.String[] { "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[]", "", "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException43.addHeader("", strArray54);
        retryOnPrimaryException34.addHeader("rest.exception.cause.skip", strArray54);
        java.lang.String str57 = retryOnPrimaryException34.toString();
        java.lang.String str58 = retryOnPrimaryException34.toString();
        java.util.List<java.lang.String> strList60 = retryOnPrimaryException34.getHeader("RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];");
        org.elasticsearch.index.shard.ShardId shardId61 = retryOnPrimaryException34.getShardId();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray38);
        org.junit.Assert.assertNotNull(throwable44);
        org.junit.Assert.assertEquals(throwable44.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable44.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable44.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str45, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]" + "'", str57, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]" + "'", str58, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
        org.junit.Assert.assertNull(strList60);
        org.junit.Assert.assertNull(shardId61);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException2.getHeader("hi!");
        java.lang.Throwable throwable9 = retryOnPrimaryException2.getRootCause();
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable[] throwableArray16 = retryOnPrimaryException13.getSuppressed();
        java.lang.String str17 = retryOnPrimaryException13.toString();
        retryOnPrimaryException13.setShard("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) ' ');
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException13.getResourceId();
        java.lang.Throwable[] throwableArray23 = retryOnPrimaryException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RetryOnPrimaryException[]" + "'", str17, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String str6 = retryOnPrimaryException4.toString();
        java.lang.Throwable throwable7 = retryOnPrimaryException4.getRootCause();
        java.lang.String str8 = org.elasticsearch.ElasticsearchException.getExceptionName(throwable7);
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException(throwable7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RetryOnPrimaryException[]" + "'", str6, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "retry_on_primary_exception" + "'", str8, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", throwable8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        retryOnPrimaryException9.setShard(shardId11);
        java.lang.String str13 = retryOnPrimaryException9.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException15);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "hi!", throwable19);
        java.lang.Throwable throwable21 = retryOnPrimaryException20.unwrapCause();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException20.getIndex();
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        retryOnPrimaryException20.setShard(shardId23);
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "hi!", throwable28);
        java.lang.Throwable throwable30 = retryOnPrimaryException29.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "");
        org.elasticsearch.index.Index index35 = null;
        retryOnPrimaryException34.setIndex(index35);
        java.lang.Throwable[] throwableArray37 = retryOnPrimaryException34.getSuppressed();
        org.elasticsearch.index.Index index38 = retryOnPrimaryException34.getIndex();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException34.addHeader("hi!", strArray44);
        retryOnPrimaryException29.setResources("rest.exception.stacktrace.skip", strArray44);
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "");
        org.elasticsearch.index.Index index51 = null;
        retryOnPrimaryException50.setIndex(index51);
        java.lang.Throwable[] throwableArray53 = retryOnPrimaryException50.getSuppressed();
        org.elasticsearch.index.Index index54 = retryOnPrimaryException50.getIndex();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException50.addHeader("hi!", strArray60);
        retryOnPrimaryException29.setResources("hi!", strArray60);
        retryOnPrimaryException20.setResources("retry_on_primary_exception", strArray60);
        retryOnPrimaryException20.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (short) 10);
        java.lang.String str67 = retryOnPrimaryException20.getResourceType();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray68 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException20);
        org.elasticsearch.index.Index index69 = null;
        retryOnPrimaryException20.setIndex(index69);
        org.elasticsearch.index.Index index71 = null;
        retryOnPrimaryException20.setIndex(index71);
        java.lang.String str73 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException20);
        retryOnPrimaryException16.addSuppressed((java.lang.Throwable) retryOnPrimaryException20);
        org.elasticsearch.index.Index index75 = retryOnPrimaryException16.getIndex();
        java.lang.Throwable throwable76 = retryOnPrimaryException16.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId77 = retryOnPrimaryException16.getShardId();
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str13, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable21);
        org.junit.Assert.assertEquals(throwable21.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable21.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable21.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable30.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNull(index38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNull(index54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "retry_on_primary_exception" + "'", str67, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "retry_on_primary_exception" + "'", str73, "retry_on_primary_exception");
        org.junit.Assert.assertNull(index75);
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals(throwable76.toString(), "RetryOnPrimaryException[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNull(shardId77);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "");
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        retryOnPrimaryException7.addHeader("", (java.util.List<java.lang.String>) strList12);
        retryOnPrimaryException2.addHeader("hi!", (java.util.List<java.lang.String>) strList12);
        org.elasticsearch.rest.RestStatus restStatus16 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId18, "hi!", throwable20);
        java.lang.Throwable throwable22 = retryOnPrimaryException21.unwrapCause();
        java.lang.String str23 = retryOnPrimaryException21.toString();
        org.elasticsearch.index.shard.ShardId shardId24 = retryOnPrimaryException21.getShardId();
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException21.getResourceId();
        java.lang.Throwable[] throwableArray26 = retryOnPrimaryException21.getSuppressed();
        java.util.Set<java.lang.String> strSet27 = retryOnPrimaryException21.getHeaderKeys();
        java.lang.Throwable throwable28 = retryOnPrimaryException21.unwrapCause();
        org.elasticsearch.rest.RestStatus restStatus29 = retryOnPrimaryException21.status();
        java.util.Set<java.lang.String> strSet30 = retryOnPrimaryException21.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus31 = retryOnPrimaryException21.status();
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "rest.exception.cause.skip");
        java.util.List<java.lang.String> strList38 = retryOnPrimaryException37.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        retryOnPrimaryException37.setShard(shardId39);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException41 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException37);
        java.lang.String str42 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException41);
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "");
        org.elasticsearch.index.Index index47 = null;
        retryOnPrimaryException46.setIndex(index47);
        java.lang.Throwable throwable49 = retryOnPrimaryException46.getRootCause();
        java.util.List<java.lang.String> strList50 = retryOnPrimaryException46.getResourceId();
        java.lang.String[] strArray55 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException46.setResources("", strArray55);
        retryOnPrimaryException41.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray55);
        retryOnPrimaryException21.addHeader("RetryOnPrimaryException[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];", strArray55);
        retryOnPrimaryException2.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", strArray55);
        java.util.Set<java.lang.String> strSet60 = retryOnPrimaryException2.getHeaderKeys();
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + restStatus16 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus16.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable22);
        org.junit.Assert.assertEquals(throwable22.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable22.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable22.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str23, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId24);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus29 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus29.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + restStatus31 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus31.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "retry_on_primary_exception" + "'", str42, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable49);
        org.junit.Assert.assertEquals(throwable49.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable49.getMessage(), "");
        org.junit.Assert.assertEquals(throwable49.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = retryOnPrimaryException2.getIndex();
        java.lang.String str4 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        retryOnPrimaryException2.setShard(shardId5);
        java.lang.String str7 = retryOnPrimaryException2.toString();
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException2.getHeader("[RetryOnPrimaryException[]][[RetryOnPrimaryException[]][0]] RetryOnPrimaryException[hi!]");
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNull(index3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str4, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[]" + "'", str7, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException5.setShard(shardId7);
        java.lang.String str9 = retryOnPrimaryException5.toString();
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        java.lang.Throwable throwable11 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        retryOnPrimaryException5.setShard(shardId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        retryOnPrimaryException5.setShard(shardId15);
        retryOnPrimaryException5.setShard("[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]", (int) ' ');
        java.lang.Throwable throwable20 = retryOnPrimaryException5.getRootCause();
        java.lang.String str21 = retryOnPrimaryException5.toString();
        retryOnPrimaryException5.setIndex("[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]");
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException5.getResourceId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException5.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]][[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]][[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][32]] RetryOnPrimaryException[hi!]" + "'", str21, "[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][32]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList24);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException3.setShard(shardId6);
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException3.setIndex(index9);
        java.lang.String str11 = retryOnPrimaryException3.getResourceType();
        java.lang.String str12 = retryOnPrimaryException3.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException elasticsearchException14 = org.elasticsearch.ElasticsearchException.readStackTrace((org.elasticsearch.ElasticsearchException) retryOnPrimaryException3, streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str12, "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.index.shard.ShardId shardId36 = retryOnPrimaryException34.getShardId();
        retryOnPrimaryException34.setShard("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[rest.exception.cause.skip];", (int) (short) -1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(shardId36);
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.index.Index index7 = null;
        retryOnPrimaryException6.setIndex(index7);
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException6.getSuppressed();
        org.elasticsearch.index.Index index10 = retryOnPrimaryException6.getIndex();
        java.lang.String str11 = retryOnPrimaryException6.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "hi!", throwable15);
        java.lang.Throwable throwable17 = retryOnPrimaryException16.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "");
        org.elasticsearch.index.Index index22 = null;
        retryOnPrimaryException21.setIndex(index22);
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException21.getSuppressed();
        org.elasticsearch.index.Index index25 = retryOnPrimaryException21.getIndex();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException21.addHeader("hi!", strArray31);
        retryOnPrimaryException16.setResources("rest.exception.stacktrace.skip", strArray31);
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "");
        org.elasticsearch.index.Index index38 = null;
        retryOnPrimaryException37.setIndex(index38);
        java.lang.Throwable[] throwableArray40 = retryOnPrimaryException37.getSuppressed();
        org.elasticsearch.index.Index index41 = retryOnPrimaryException37.getIndex();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException37.addHeader("hi!", strArray47);
        retryOnPrimaryException16.setResources("hi!", strArray47);
        retryOnPrimaryException6.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray47);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[hi!]", strArray47);
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.lang.String str54 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("[retry_on_primary_exception] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str11, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNull(index25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNull(index41);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip" + "'", str54, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip");
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray6 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.index.Index index7 = retryOnPrimaryException3.getIndex();
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException3.getHeader("");
        retryOnPrimaryException3.setShard("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", 10);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray6);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(strList9);
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException2.setShard(shardId20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        retryOnPrimaryException2.setShard(shardId25);
        java.util.List<java.lang.String> strList28 = retryOnPrimaryException2.getHeader("[] RetryOnPrimaryException[]");
        org.elasticsearch.index.shard.ShardId shardId29 = retryOnPrimaryException2.getShardId();
        java.util.Set<java.lang.String> strSet30 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        org.elasticsearch.index.Index index37 = null;
        retryOnPrimaryException36.setIndex(index37);
        java.lang.Throwable[] throwableArray39 = retryOnPrimaryException36.getSuppressed();
        org.elasticsearch.index.Index index40 = retryOnPrimaryException36.getIndex();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException36.addHeader("hi!", strArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        retryOnPrimaryException36.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList52);
        org.elasticsearch.index.shard.ShardId shardId55 = null;
        retryOnPrimaryException36.setShard(shardId55);
        java.util.List<java.lang.String> strList57 = retryOnPrimaryException36.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException58 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "", (java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        java.lang.Throwable throwable62 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException63 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId60, "hi!", throwable62);
        java.lang.Throwable throwable64 = retryOnPrimaryException63.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId66 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException68 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId66, "");
        org.elasticsearch.index.Index index69 = null;
        retryOnPrimaryException68.setIndex(index69);
        java.lang.Throwable[] throwableArray71 = retryOnPrimaryException68.getSuppressed();
        org.elasticsearch.index.Index index72 = retryOnPrimaryException68.getIndex();
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException68.addHeader("hi!", strArray78);
        retryOnPrimaryException63.setResources("rest.exception.stacktrace.skip", strArray78);
        retryOnPrimaryException58.setResources("RetryOnPrimaryException[]", strArray78);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!];", strArray78);
        java.util.List<java.lang.String> strList84 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNull(shardId29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNull(index40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(strList57);
        org.junit.Assert.assertNotNull(throwable64);
        org.junit.Assert.assertEquals(throwable64.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable64.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable64.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNull(index72);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNull(strList84);
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        org.elasticsearch.rest.RestStatus restStatus32 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        retryOnPrimaryException2.setShard(shardId33);
        java.util.List<java.lang.String> strList36 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[]");
        retryOnPrimaryException2.setIndex("");
        java.lang.Throwable[] throwableArray39 = retryOnPrimaryException2.getSuppressed();
        retryOnPrimaryException2.setShard("[] RetryOnPrimaryException[]", (int) (short) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable44 = org.elasticsearch.ElasticsearchException.writeStackTraces((java.lang.Throwable) retryOnPrimaryException2, streamOutput43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + restStatus32 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus32.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "hi!", throwable10);
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.Throwable throwable13 = retryOnPrimaryException11.unwrapCause();
        java.lang.Throwable throwable14 = retryOnPrimaryException11.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException18.getHeaderKeys();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        retryOnPrimaryException18.addHeader("", (java.util.List<java.lang.String>) strList23);
        retryOnPrimaryException11.addHeader("RetryOnPrimaryException[hi!]", (java.util.List<java.lang.String>) strList23);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "");
        java.util.Set<java.lang.String> strSet31 = retryOnPrimaryException30.getHeaderKeys();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        retryOnPrimaryException30.addHeader("", (java.util.List<java.lang.String>) strList35);
        retryOnPrimaryException30.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId40 = retryOnPrimaryException30.getShardId();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!", throwable44);
        java.lang.Throwable throwable46 = retryOnPrimaryException45.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "");
        org.elasticsearch.index.Index index51 = null;
        retryOnPrimaryException50.setIndex(index51);
        java.lang.Throwable[] throwableArray53 = retryOnPrimaryException50.getSuppressed();
        org.elasticsearch.index.Index index54 = retryOnPrimaryException50.getIndex();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException50.addHeader("hi!", strArray60);
        retryOnPrimaryException45.setResources("rest.exception.stacktrace.skip", strArray60);
        org.elasticsearch.index.shard.ShardId shardId64 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException66 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId64, "");
        org.elasticsearch.index.Index index67 = null;
        retryOnPrimaryException66.setIndex(index67);
        java.lang.Throwable[] throwableArray69 = retryOnPrimaryException66.getSuppressed();
        org.elasticsearch.index.Index index70 = retryOnPrimaryException66.getIndex();
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException66.addHeader("hi!", strArray76);
        retryOnPrimaryException45.setResources("hi!", strArray76);
        retryOnPrimaryException30.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray76);
        retryOnPrimaryException11.addHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray76);
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray76);
        java.util.List<java.lang.String> strList82 = retryOnPrimaryException2.getResourceId();
        java.lang.String str83 = retryOnPrimaryException2.getResourceType();
        retryOnPrimaryException2.setShard("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]", 0);
        retryOnPrimaryException2.setShard("RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];", (int) (short) 10);
        java.lang.Throwable throwable90 = retryOnPrimaryException2.getRootCause();
        boolean boolean91 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException(throwable90);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(shardId40);
        org.junit.Assert.assertNotNull(throwable46);
        org.junit.Assert.assertEquals(throwable46.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNull(index54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNull(index70);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str83, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(throwable90);
        org.junit.Assert.assertEquals(throwable90.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable90.getMessage(), "");
        org.junit.Assert.assertEquals(throwable90.toString(), "[RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];][10]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray6 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException3.getHeader("RetryOnPrimaryException[]");
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "hi!", throwable12);
        java.lang.Throwable throwable14 = retryOnPrimaryException13.unwrapCause();
        java.lang.String str15 = retryOnPrimaryException13.toString();
        org.elasticsearch.index.shard.ShardId shardId16 = retryOnPrimaryException13.getShardId();
        org.elasticsearch.index.shard.ShardId shardId17 = retryOnPrimaryException13.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        java.lang.String str19 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable throwable20 = retryOnPrimaryException3.getRootCause();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray6);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str15, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "retry_on_primary_exception" + "'", str19, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        retryOnPrimaryException11.addHeader("", (java.util.List<java.lang.String>) strList16);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList16);
        java.util.List<java.lang.String> strList20 = retryOnPrimaryException4.getResourceId();
        java.util.Set<java.lang.String> strSet21 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        retryOnPrimaryException4.setShard(shardId22);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        retryOnPrimaryException4.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray25);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        retryOnPrimaryException4.setShard(shardId27);
        retryOnPrimaryException4.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", 1);
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException4.getHeader("");
        java.util.List<java.lang.String> strList35 = retryOnPrimaryException4.getHeader("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]");
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException4.getHeader("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = retryOnPrimaryException3.getShardId();
        java.lang.String str8 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId9 = retryOnPrimaryException3.getShardId();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        retryOnPrimaryException3.setShard(shardId10);
        boolean boolean12 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId13 = retryOnPrimaryException3.getShardId();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "retry_on_primary_exception" + "'", str8, "retry_on_primary_exception");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String str6 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException4.getIndex();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId9 = retryOnPrimaryException4.getShardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "retry_on_primary_exception" + "'", str6, "retry_on_primary_exception");
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(shardId9);
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = retryOnPrimaryException2.getShardId();
        java.util.List<java.lang.String> strList13 = retryOnPrimaryException2.getResourceId();
        java.lang.String str14 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId15 = retryOnPrimaryException2.getShardId();
        retryOnPrimaryException2.setIndex("[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(shardId12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(shardId15);
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "");
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException12.getHeaderKeys();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        retryOnPrimaryException12.addHeader("", (java.util.List<java.lang.String>) strList17);
        retryOnPrimaryException12.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId22 = retryOnPrimaryException12.getShardId();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        java.lang.Throwable throwable26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "hi!", throwable26);
        java.lang.Throwable throwable28 = retryOnPrimaryException27.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "");
        org.elasticsearch.index.Index index33 = null;
        retryOnPrimaryException32.setIndex(index33);
        java.lang.Throwable[] throwableArray35 = retryOnPrimaryException32.getSuppressed();
        org.elasticsearch.index.Index index36 = retryOnPrimaryException32.getIndex();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException32.addHeader("hi!", strArray42);
        retryOnPrimaryException27.setResources("rest.exception.stacktrace.skip", strArray42);
        org.elasticsearch.index.shard.ShardId shardId46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId46, "");
        org.elasticsearch.index.Index index49 = null;
        retryOnPrimaryException48.setIndex(index49);
        java.lang.Throwable[] throwableArray51 = retryOnPrimaryException48.getSuppressed();
        org.elasticsearch.index.Index index52 = retryOnPrimaryException48.getIndex();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException48.addHeader("hi!", strArray58);
        retryOnPrimaryException27.setResources("hi!", strArray58);
        retryOnPrimaryException12.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray58);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", strArray58);
        java.lang.Throwable throwable63 = retryOnPrimaryException2.getRootCause();
        java.lang.Throwable[] throwableArray64 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId65 = retryOnPrimaryException2.getShardId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray66 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus67 = retryOnPrimaryException2.status();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNull(index52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(throwable63);
        org.junit.Assert.assertEquals(throwable63.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable63.getMessage(), "");
        org.junit.Assert.assertEquals(throwable63.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNull(shardId65);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray66);
        org.junit.Assert.assertTrue("'" + restStatus67 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus67.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = retryOnPrimaryException4.getShardId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[RetryOnPrimaryException[hi!]]", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "");
        java.util.Set<java.lang.String> strSet20 = retryOnPrimaryException19.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        java.lang.Throwable throwable24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "hi!", throwable24);
        java.lang.Throwable throwable26 = retryOnPrimaryException25.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "");
        org.elasticsearch.index.Index index31 = null;
        retryOnPrimaryException30.setIndex(index31);
        java.lang.Throwable[] throwableArray33 = retryOnPrimaryException30.getSuppressed();
        org.elasticsearch.index.Index index34 = retryOnPrimaryException30.getIndex();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException30.addHeader("hi!", strArray40);
        retryOnPrimaryException25.setResources("rest.exception.stacktrace.skip", strArray40);
        retryOnPrimaryException19.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray44 = retryOnPrimaryException19.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId46, "");
        org.elasticsearch.index.Index index49 = retryOnPrimaryException48.getIndex();
        java.lang.String str50 = retryOnPrimaryException48.getDetailedMessage();
        java.lang.String str51 = retryOnPrimaryException48.toString();
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        org.elasticsearch.index.Index index56 = null;
        retryOnPrimaryException55.setIndex(index56);
        java.lang.Throwable throwable58 = retryOnPrimaryException55.getRootCause();
        java.util.List<java.lang.String> strList59 = retryOnPrimaryException55.getResourceId();
        java.lang.String[] strArray64 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException55.setResources("", strArray64);
        retryOnPrimaryException48.setResources("", strArray64);
        retryOnPrimaryException19.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: retry_on_primary_exception", strArray64);
        retryOnPrimaryException4.setResources("RetryOnPrimaryException[[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][10]] RetryOnPrimaryException[hi!]] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];]", strArray64);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNull(index34);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray44);
        org.junit.Assert.assertNull(index49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str50, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "RetryOnPrimaryException[]" + "'", str51, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable58);
        org.junit.Assert.assertEquals(throwable58.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable58.getMessage(), "");
        org.junit.Assert.assertEquals(throwable58.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList59);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException2.getHeader("hi!");
        java.lang.Throwable throwable9 = retryOnPrimaryException2.getRootCause();
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.index.Index index11 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "hi!", throwable15);
        java.lang.Throwable throwable17 = retryOnPrimaryException16.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "");
        org.elasticsearch.index.Index index22 = null;
        retryOnPrimaryException21.setIndex(index22);
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException21.getSuppressed();
        org.elasticsearch.index.Index index25 = retryOnPrimaryException21.getIndex();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException21.addHeader("hi!", strArray31);
        retryOnPrimaryException16.setResources("rest.exception.stacktrace.skip", strArray31);
        retryOnPrimaryException2.setResources("[rest.exception.cause.skip] RetryOnPrimaryException[]", strArray31);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray35 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNotNull(throwable17);
        org.junit.Assert.assertEquals(throwable17.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable17.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNull(index25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray35);
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        java.lang.String[] strArray32 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException4.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray32);
        org.elasticsearch.rest.RestStatus restStatus34 = retryOnPrimaryException4.status();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        retryOnPrimaryException4.setShard(shardId35);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId38 = retryOnPrimaryException37.getShardId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray39 = retryOnPrimaryException37.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus40 = retryOnPrimaryException37.status();
        java.util.List<java.lang.String> strList42 = retryOnPrimaryException37.getHeader("[[RetryOnPrimaryException[]] RetryOnPrimaryException[]][[[RetryOnPrimaryException[]] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + restStatus34 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus34.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(shardId38);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray39);
        org.junit.Assert.assertTrue("'" + restStatus40 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus40.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "");
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException5.setIndex(index6);
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException5.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.Index index10 = retryOnPrimaryException5.getIndex();
        java.lang.String str11 = retryOnPrimaryException5.getResourceType();
        java.lang.String str12 = retryOnPrimaryException5.getDetailedMessage();
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException5);
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str12, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.index.Index index11 = retryOnPrimaryException10.getIndex();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        java.util.Set<java.lang.String> strSet16 = retryOnPrimaryException15.getHeaderKeys();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException15.addHeader("", (java.util.List<java.lang.String>) strList20);
        retryOnPrimaryException10.addHeader("hi!", (java.util.List<java.lang.String>) strList20);
        retryOnPrimaryException2.addHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];", (java.util.List<java.lang.String>) strList20);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray25 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        java.util.List<java.lang.String> strList27 = retryOnPrimaryException2.getHeader("[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];");
        java.lang.Throwable throwable30 = retryOnPrimaryException2.getRootCause();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray25);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "");
        org.junit.Assert.assertEquals(throwable30.toString(), "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];] RetryOnPrimaryException[]");
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip");
        java.util.List<java.lang.String> strList3 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        retryOnPrimaryException2.setShard(shardId4);
        java.lang.Throwable[] throwableArray6 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException2.getHeaderKeys();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray14 = retryOnPrimaryException2.guessRootCauses();
        java.lang.Throwable throwable15 = retryOnPrimaryException2.unwrapCause();
        java.lang.Throwable[] throwableArray16 = retryOnPrimaryException2.getSuppressed();
        java.lang.Class<?> wildcardClass17 = retryOnPrimaryException2.getClass();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray14);
        org.junit.Assert.assertNotNull(throwable15);
        org.junit.Assert.assertEquals(throwable15.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable15.getMessage(), "");
        org.junit.Assert.assertEquals(throwable15.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray12 = retryOnPrimaryException2.guessRootCauses();
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable throwable14 = retryOnPrimaryException2.unwrapCause();
        boolean boolean15 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException(throwable14);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        retryOnPrimaryException2.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.Index index10 = null;
        retryOnPrimaryException2.setIndex(index10);
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "hi!", throwable15);
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.Throwable throwable18 = retryOnPrimaryException16.unwrapCause();
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException16.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        java.lang.Throwable throwable22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId20, "hi!", throwable22);
        java.lang.Throwable throwable24 = retryOnPrimaryException23.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        org.elasticsearch.index.Index index29 = null;
        retryOnPrimaryException28.setIndex(index29);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException28.getSuppressed();
        org.elasticsearch.index.Index index32 = retryOnPrimaryException28.getIndex();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException28.addHeader("hi!", strArray38);
        retryOnPrimaryException23.setResources("rest.exception.stacktrace.skip", strArray38);
        retryOnPrimaryException16.addSuppressed((java.lang.Throwable) retryOnPrimaryException23);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        boolean boolean43 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        retryOnPrimaryException2.setIndex("[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]");
        java.util.List<java.lang.String> strList46 = retryOnPrimaryException2.getResourceId();
        java.lang.String str47 = retryOnPrimaryException2.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(throwable18);
        org.junit.Assert.assertEquals(throwable18.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable18.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(throwable24);
        org.junit.Assert.assertEquals(throwable24.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable24.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable24.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNull(index32);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(strList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][[[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]" + "'", str47, "[[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][[[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]");
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException3.setIndex(index6);
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        java.lang.Throwable throwable9 = retryOnPrimaryException3.getRootCause();
        boolean boolean10 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException(throwable9);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray11 = org.elasticsearch.ElasticsearchException.guessRootCauses(throwable9);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray11);
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException3.getIndex();
        java.lang.String str7 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable throwable8 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str9 = retryOnPrimaryException3.toString();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "retry_on_primary_exception" + "'", str7, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.lang.Throwable throwable8 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId9 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable throwable16 = retryOnPrimaryException13.getRootCause();
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException13.getResourceId();
        java.lang.String[] strArray22 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException13.setResources("", strArray22);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray22);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException5);
        boolean boolean26 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException5.status();
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        boolean boolean30 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException5.getSuppressed();
        retryOnPrimaryException5.setIndex("[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable throwable35 = org.elasticsearch.ElasticsearchException.writeStackTraces((java.lang.Throwable) retryOnPrimaryException5, streamOutput34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "");
        org.junit.Assert.assertEquals(throwable16.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException2.addHeader("hi!", strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException2.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList18);
        retryOnPrimaryException2.setShard("", (int) (byte) 10);
        java.lang.String str24 = retryOnPrimaryException2.getDetailedMessage();
        java.lang.Throwable throwable25 = retryOnPrimaryException2.getRootCause();
        org.elasticsearch.rest.RestStatus restStatus26 = retryOnPrimaryException2.status();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str24, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "");
        org.junit.Assert.assertEquals(throwable25.toString(), "[][[][10]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + restStatus26 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus26.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException12.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        retryOnPrimaryException12.setShard(shardId14);
        java.lang.String str16 = retryOnPrimaryException12.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        java.lang.String str19 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException2.setShard(shardId20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "");
        org.elasticsearch.index.Index index26 = null;
        retryOnPrimaryException25.setIndex(index26);
        java.lang.Throwable[] throwableArray28 = retryOnPrimaryException25.getSuppressed();
        java.util.Set<java.lang.String> strSet29 = retryOnPrimaryException25.getHeaderKeys();
        retryOnPrimaryException25.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.Index index33 = null;
        retryOnPrimaryException25.setIndex(index33);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "");
        org.elasticsearch.index.Index index41 = null;
        retryOnPrimaryException40.setIndex(index41);
        java.lang.Throwable[] throwableArray43 = retryOnPrimaryException40.getSuppressed();
        org.elasticsearch.index.Index index44 = retryOnPrimaryException40.getIndex();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException40.addHeader("hi!", strArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        retryOnPrimaryException40.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList56);
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        retryOnPrimaryException40.setShard(shardId59);
        java.util.List<java.lang.String> strList61 = retryOnPrimaryException40.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "", (java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.index.shard.ShardId shardId64 = null;
        java.lang.Throwable throwable66 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException67 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId64, "hi!", throwable66);
        java.lang.Throwable throwable68 = retryOnPrimaryException67.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId70 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException72 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId70, "");
        org.elasticsearch.index.Index index73 = null;
        retryOnPrimaryException72.setIndex(index73);
        java.lang.Throwable[] throwableArray75 = retryOnPrimaryException72.getSuppressed();
        org.elasticsearch.index.Index index76 = retryOnPrimaryException72.getIndex();
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException72.addHeader("hi!", strArray82);
        retryOnPrimaryException67.setResources("rest.exception.stacktrace.skip", strArray82);
        retryOnPrimaryException62.setResources("RetryOnPrimaryException[]", strArray82);
        retryOnPrimaryException25.addHeader("", strArray82);
        retryOnPrimaryException2.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray82);
        java.util.List<java.lang.String> strList89 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        java.lang.Throwable[] throwableArray90 = retryOnPrimaryException2.getSuppressed();
        java.lang.Throwable throwable91 = retryOnPrimaryException2.getRootCause();
        java.lang.Throwable throwable92 = retryOnPrimaryException2.getRootCause();
        java.lang.String str93 = org.elasticsearch.ElasticsearchException.getExceptionName(throwable92);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str16, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNull(index44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(strList61);
        org.junit.Assert.assertNotNull(throwable68);
        org.junit.Assert.assertEquals(throwable68.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable68.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable68.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNull(index76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNull(strList89);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwable91);
        org.junit.Assert.assertEquals(throwable91.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable91.getMessage(), "");
        org.junit.Assert.assertEquals(throwable91.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable92);
        org.junit.Assert.assertEquals(throwable92.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable92.getMessage(), "");
        org.junit.Assert.assertEquals(throwable92.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "retry_on_primary_exception" + "'", str93, "retry_on_primary_exception");
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        org.elasticsearch.rest.RestStatus restStatus7 = retryOnPrimaryException3.status();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.Index index10 = retryOnPrimaryException3.getIndex();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException3.getHeaderKeys();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + restStatus7 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus7.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException12.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        retryOnPrimaryException12.setShard(shardId14);
        java.lang.String str16 = retryOnPrimaryException12.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        java.lang.String str19 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException2.setShard(shardId20);
        java.util.List<java.lang.String> strList23 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.index.Index index24 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = retryOnPrimaryException2.toXContent(xContentBuilder25, params26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str16, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(index24);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = retryOnPrimaryException2.toString();
        boolean boolean5 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        boolean boolean6 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException2.getSuppressed();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable throwable9 = retryOnPrimaryException2.getRootCause();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RetryOnPrimaryException[]" + "'", str4, "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.String str5 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str6 = retryOnPrimaryException3.toString();
        java.lang.String str7 = retryOnPrimaryException3.getResourceType();
        java.lang.Throwable throwable8 = retryOnPrimaryException3.unwrapCause();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "retry_on_primary_exception" + "'", str5, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str6, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.setResources("hi!", strArray34);
        org.elasticsearch.index.Index index37 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.Index index38 = retryOnPrimaryException3.getIndex();
        java.lang.String str39 = retryOnPrimaryException3.getResourceType();
        java.lang.String str40 = retryOnPrimaryException3.getDetailedMessage();
        java.util.List<java.lang.String> strList41 = retryOnPrimaryException3.getResourceId();
        java.lang.String str42 = retryOnPrimaryException3.getDetailedMessage();
        org.elasticsearch.rest.RestStatus restStatus43 = retryOnPrimaryException3.status();
        org.elasticsearch.index.Index index44 = retryOnPrimaryException3.getIndex();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNull(index38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str40, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str42, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertTrue("'" + restStatus43 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus43.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(index44);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", throwable2);
        retryOnPrimaryException3.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException3.getHeaderKeys();
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException4.addHeader("hi!", strArray14);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "hi!", throwable18);
        java.lang.Throwable throwable20 = retryOnPrimaryException19.unwrapCause();
        java.lang.String str21 = retryOnPrimaryException19.toString();
        org.elasticsearch.index.shard.ShardId shardId22 = retryOnPrimaryException19.getShardId();
        java.util.List<java.lang.String> strList23 = retryOnPrimaryException19.getResourceId();
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException19.getSuppressed();
        java.util.Set<java.lang.String> strSet25 = retryOnPrimaryException19.getHeaderKeys();
        java.lang.Throwable throwable26 = retryOnPrimaryException19.getRootCause();
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException19.status();
        boolean boolean28 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException19);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException19);
        java.util.Set<java.lang.String> strSet30 = retryOnPrimaryException19.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus31 = retryOnPrimaryException19.status();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str21, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + restStatus31 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus31.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "");
        java.util.Set<java.lang.String> strSet22 = retryOnPrimaryException21.getHeaderKeys();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        retryOnPrimaryException21.addHeader("", (java.util.List<java.lang.String>) strList26);
        retryOnPrimaryException21.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        java.util.Set<java.lang.String> strSet34 = retryOnPrimaryException33.getHeaderKeys();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        retryOnPrimaryException33.addHeader("", (java.util.List<java.lang.String>) strList38);
        java.util.List<java.lang.String> strList41 = retryOnPrimaryException33.getResourceId();
        retryOnPrimaryException21.addSuppressed((java.lang.Throwable) retryOnPrimaryException33);
        java.lang.String[] strArray49 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException21.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray49);
        boolean boolean51 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException21);
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        java.util.Set<java.lang.String> strSet56 = retryOnPrimaryException55.getHeaderKeys();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        retryOnPrimaryException55.addHeader("", (java.util.List<java.lang.String>) strList60);
        java.util.List<java.lang.String> strList63 = retryOnPrimaryException55.getResourceId();
        java.util.Set<java.lang.String> strSet64 = retryOnPrimaryException55.getHeaderKeys();
        java.util.List<java.lang.String> strList65 = retryOnPrimaryException55.getResourceId();
        org.elasticsearch.index.Index index66 = null;
        retryOnPrimaryException55.setIndex(index66);
        org.elasticsearch.index.shard.ShardId shardId69 = null;
        java.lang.Throwable throwable71 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException72 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId69, "hi!", throwable71);
        java.lang.Throwable throwable73 = retryOnPrimaryException72.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId75 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException77 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId75, "");
        org.elasticsearch.index.Index index78 = null;
        retryOnPrimaryException77.setIndex(index78);
        java.lang.Throwable[] throwableArray80 = retryOnPrimaryException77.getSuppressed();
        org.elasticsearch.index.Index index81 = retryOnPrimaryException77.getIndex();
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException77.addHeader("hi!", strArray87);
        retryOnPrimaryException72.setResources("rest.exception.stacktrace.skip", strArray87);
        retryOnPrimaryException55.addHeader("rest.exception.cause.skip", strArray87);
        retryOnPrimaryException21.setResources("RetryOnPrimaryException[hi!]", strArray87);
        retryOnPrimaryException2.addHeader("", strArray87);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray93 = retryOnPrimaryException2.guessRootCauses();
        java.lang.String str94 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(strList41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(strList65);
        org.junit.Assert.assertNotNull(throwable73);
        org.junit.Assert.assertEquals(throwable73.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable73.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable73.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNull(index81);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "retry_on_primary_exception" + "'", str94, "retry_on_primary_exception");
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.lang.Throwable throwable8 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId9 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable throwable16 = retryOnPrimaryException13.getRootCause();
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException13.getResourceId();
        java.lang.String[] strArray22 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException13.setResources("", strArray22);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray22);
        java.util.List<java.lang.String> strList26 = retryOnPrimaryException5.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException5);
        java.lang.String str28 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray29 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.String str30 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.common.io.stream.StreamInput streamInput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Exception exception32 = org.elasticsearch.ElasticsearchException.readStackTrace((java.lang.Exception) retryOnPrimaryException5, streamInput31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "");
        org.junit.Assert.assertEquals(throwable16.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(strList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "retry_on_primary_exception" + "'", str28, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "retry_on_primary_exception" + "'", str30, "retry_on_primary_exception");
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        java.util.Set<java.lang.String> strSet7 = retryOnPrimaryException6.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        retryOnPrimaryException6.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray27);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException6.getSuppressed();
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException6.getHeader("rest.exception.stacktrace.skip");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException34);
        java.util.List<java.lang.String> strList36 = retryOnPrimaryException35.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray37 = retryOnPrimaryException35.guessRootCauses();
        java.lang.Throwable throwable38 = retryOnPrimaryException35.getRootCause();
        boolean boolean39 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException35);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNull(strList36);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray37);
        org.junit.Assert.assertNotNull(throwable38);
        org.junit.Assert.assertEquals(throwable38.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable38.getMessage(), "");
        org.junit.Assert.assertEquals(throwable38.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        retryOnPrimaryException11.addHeader("", (java.util.List<java.lang.String>) strList16);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList16);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException4.setShard(shardId20);
        boolean boolean22 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str24 = retryOnPrimaryException23.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException23.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];" + "'", str24, "RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.Throwable throwable12 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        retryOnPrimaryException2.setShard(shardId13);
        retryOnPrimaryException2.setIndex("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][1]] RetryOnPrimaryException[]");
        java.lang.String str17 = retryOnPrimaryException2.getDetailedMessage();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "");
        org.junit.Assert.assertEquals(throwable12.toString(), "[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][1]] RetryOnPrimaryException[]] RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str17, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray45 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus46 = retryOnPrimaryException3.status();
        boolean boolean47 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str48 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        boolean boolean49 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.Index index50 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId51 = retryOnPrimaryException3.getShardId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray45);
        org.junit.Assert.assertTrue("'" + restStatus46 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus46.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "retry_on_primary_exception" + "'", str48, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(index50);
        org.junit.Assert.assertNull(shardId51);
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException3.setShard(shardId9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException3.getSuppressed();
        java.util.List<java.lang.String> strList13 = null;
        retryOnPrimaryException3.addHeader("RetryOnPrimaryException[]", strList13);
        org.elasticsearch.index.Index index15 = null;
        retryOnPrimaryException3.setIndex(index15);
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException3.getHeader("RetryOnPrimaryException[[hi!] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.util.List<java.lang.String> strList20 = retryOnPrimaryException3.getHeader("[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNull(strList20);
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.index.Index index19 = null;
        retryOnPrimaryException18.setIndex(index19);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException18.getIndex();
        java.lang.String str23 = retryOnPrimaryException18.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!", throwable27);
        java.lang.Throwable throwable29 = retryOnPrimaryException28.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException28.setResources("rest.exception.stacktrace.skip", strArray43);
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId47, "");
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException49.setIndex(index50);
        java.lang.Throwable[] throwableArray52 = retryOnPrimaryException49.getSuppressed();
        org.elasticsearch.index.Index index53 = retryOnPrimaryException49.getIndex();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException49.addHeader("hi!", strArray59);
        retryOnPrimaryException28.setResources("hi!", strArray59);
        retryOnPrimaryException18.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        retryOnPrimaryException14.setResources("RetryOnPrimaryException[hi!]", strArray59);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.util.List<java.lang.String> strList66 = retryOnPrimaryException14.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.Index index67 = null;
        retryOnPrimaryException14.setIndex(index67);
        java.util.List<java.lang.String> strList70 = retryOnPrimaryException14.getHeader("[[] RetryOnPrimaryException[]][[[] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str23, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNull(index53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNull(strList66);
        org.junit.Assert.assertNull(strList70);
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        java.util.Set<java.lang.String> strSet7 = retryOnPrimaryException6.getHeaderKeys();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        retryOnPrimaryException6.addHeader("", (java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException6.getResourceId();
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException6.getHeaderKeys();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray16 = retryOnPrimaryException6.guessRootCauses();
        retryOnPrimaryException6.setIndex("RetryOnPrimaryException[hi!]");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException19);
        java.lang.String str21 = retryOnPrimaryException19.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException19.writeTo(streamOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]]; nested: RetryOnPrimaryException[];" + "'", str21, "RetryOnPrimaryException[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.index.Index index11 = null;
        retryOnPrimaryException10.setIndex(index11);
        java.lang.Throwable[] throwableArray13 = retryOnPrimaryException10.getSuppressed();
        org.elasticsearch.index.Index index14 = retryOnPrimaryException10.getIndex();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException10.addHeader("hi!", strArray20);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray20);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "");
        org.elasticsearch.index.Index index27 = null;
        retryOnPrimaryException26.setIndex(index27);
        java.lang.Throwable[] throwableArray29 = retryOnPrimaryException26.getSuppressed();
        org.elasticsearch.index.Index index30 = retryOnPrimaryException26.getIndex();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException26.addHeader("hi!", strArray36);
        retryOnPrimaryException5.addHeader("hi!", strArray36);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        java.lang.Throwable throwable41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException42 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId39, "hi!", throwable41);
        java.lang.Throwable throwable43 = retryOnPrimaryException42.unwrapCause();
        java.lang.String str44 = retryOnPrimaryException42.toString();
        org.elasticsearch.index.shard.ShardId shardId45 = retryOnPrimaryException42.getShardId();
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException42);
        java.lang.String str47 = retryOnPrimaryException5.getResourceType();
        java.lang.Throwable throwable48 = retryOnPrimaryException5.getRootCause();
        java.util.Set<java.lang.String> strSet49 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus50 = retryOnPrimaryException5.status();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(index30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(throwable43);
        org.junit.Assert.assertEquals(throwable43.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable43.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable43.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str44, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "rest.exception.stacktrace.skip" + "'", str47, "rest.exception.stacktrace.skip");
        org.junit.Assert.assertNotNull(throwable48);
        org.junit.Assert.assertEquals(throwable48.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + restStatus50 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus50.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "");
        org.elasticsearch.index.Index index36 = retryOnPrimaryException35.getIndex();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException35);
        java.util.List<java.lang.String> strList39 = retryOnPrimaryException35.getHeader("rest.exception.stacktrace.skip");
        java.lang.String str40 = retryOnPrimaryException35.getResourceType();
        java.lang.String str41 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException35);
        boolean boolean42 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException35);
        org.elasticsearch.index.Index index43 = retryOnPrimaryException35.getIndex();
        java.lang.String str44 = retryOnPrimaryException35.getResourceType();
        java.util.List<java.lang.String> strList45 = retryOnPrimaryException35.getResourceId();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "retry_on_primary_exception" + "'", str41, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(index43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(strList45);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        boolean boolean32 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        java.util.Set<java.lang.String> strSet37 = retryOnPrimaryException36.getHeaderKeys();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        retryOnPrimaryException36.addHeader("", (java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = retryOnPrimaryException36.getResourceId();
        java.util.Set<java.lang.String> strSet45 = retryOnPrimaryException36.getHeaderKeys();
        java.util.List<java.lang.String> strList46 = retryOnPrimaryException36.getResourceId();
        org.elasticsearch.index.Index index47 = null;
        retryOnPrimaryException36.setIndex(index47);
        org.elasticsearch.index.shard.ShardId shardId50 = null;
        java.lang.Throwable throwable52 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException53 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId50, "hi!", throwable52);
        java.lang.Throwable throwable54 = retryOnPrimaryException53.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId56 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException58 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId56, "");
        org.elasticsearch.index.Index index59 = null;
        retryOnPrimaryException58.setIndex(index59);
        java.lang.Throwable[] throwableArray61 = retryOnPrimaryException58.getSuppressed();
        org.elasticsearch.index.Index index62 = retryOnPrimaryException58.getIndex();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException58.addHeader("hi!", strArray68);
        retryOnPrimaryException53.setResources("rest.exception.stacktrace.skip", strArray68);
        retryOnPrimaryException36.addHeader("rest.exception.cause.skip", strArray68);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[hi!]", strArray68);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray73 = retryOnPrimaryException2.guessRootCauses();
        java.lang.String str74 = retryOnPrimaryException2.toString();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(strList46);
        org.junit.Assert.assertNotNull(throwable54);
        org.junit.Assert.assertEquals(throwable54.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNull(index62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "[hi!] RetryOnPrimaryException[]" + "'", str74, "[hi!] RetryOnPrimaryException[]");
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = retryOnPrimaryException2.toString();
        java.util.List<java.lang.String> strList5 = retryOnPrimaryException2.getResourceId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[];");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str10 = retryOnPrimaryException2.getResourceType();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RetryOnPrimaryException[]" + "'", str4, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.index.Index index45 = null;
        retryOnPrimaryException3.setIndex(index45);
        java.util.List<java.lang.String> strList47 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray48 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable[] throwableArray49 = retryOnPrimaryException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray24 = retryOnPrimaryException2.guessRootCauses();
        java.lang.Throwable[] throwableArray25 = retryOnPrimaryException2.getSuppressed();
        java.lang.String str26 = retryOnPrimaryException2.getDetailedMessage();
        java.util.Set<java.lang.String> strSet27 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId28 = retryOnPrimaryException2.getShardId();
        retryOnPrimaryException2.setShard("retry_on_primary_exception", (int) (byte) 0);
        boolean boolean32 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str26, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(shardId28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException5.setShard(shardId7);
        java.lang.String str9 = retryOnPrimaryException5.toString();
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray11 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable throwable12 = retryOnPrimaryException5.getRootCause();
        retryOnPrimaryException5.setShard("rest.exception.cause.skip", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray11);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.toString(), "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException3.setShard(shardId6);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException12.setResources("hi!", strArray43);
        retryOnPrimaryException3.setResources("retry_on_primary_exception", strArray43);
        retryOnPrimaryException3.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (short) 10);
        java.lang.String str50 = retryOnPrimaryException3.getResourceType();
        java.util.Set<java.lang.String> strSet51 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder52 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params53 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder54 = retryOnPrimaryException3.toXContent(xContentBuilder52, params53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "retry_on_primary_exception" + "'", str50, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(params53);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException4.addHeader("hi!", strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException4.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        retryOnPrimaryException4.setShard(shardId23);
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.util.Set<java.lang.String> strSet27 = retryOnPrimaryException4.getHeaderKeys();
        boolean boolean28 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        retryOnPrimaryException4.setShard(shardId29);
        java.lang.String str31 = retryOnPrimaryException4.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId32 = retryOnPrimaryException4.getShardId();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(shardId32);
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        java.util.List<java.lang.String> strList6 = retryOnPrimaryException2.getResourceId();
        java.lang.String str7 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        retryOnPrimaryException11.addHeader("", (java.util.List<java.lang.String>) strList16);
        retryOnPrimaryException11.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "");
        java.util.Set<java.lang.String> strSet24 = retryOnPrimaryException23.getHeaderKeys();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        retryOnPrimaryException23.addHeader("", (java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList31 = retryOnPrimaryException23.getResourceId();
        retryOnPrimaryException11.addSuppressed((java.lang.Throwable) retryOnPrimaryException23);
        java.lang.String[] strArray39 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException11.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray39);
        org.elasticsearch.rest.RestStatus restStatus41 = retryOnPrimaryException11.status();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        retryOnPrimaryException11.setShard(shardId42);
        java.util.List<java.lang.String> strList45 = retryOnPrimaryException11.getHeader("RetryOnPrimaryException[]");
        retryOnPrimaryException11.setIndex("");
        java.lang.Throwable[] throwableArray48 = retryOnPrimaryException11.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId50 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException52 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId50, "");
        java.util.Set<java.lang.String> strSet53 = retryOnPrimaryException52.getHeaderKeys();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        retryOnPrimaryException52.addHeader("", (java.util.List<java.lang.String>) strList57);
        retryOnPrimaryException52.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId62 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId62, "");
        java.util.Set<java.lang.String> strSet65 = retryOnPrimaryException64.getHeaderKeys();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        retryOnPrimaryException64.addHeader("", (java.util.List<java.lang.String>) strList69);
        java.util.List<java.lang.String> strList72 = retryOnPrimaryException64.getResourceId();
        retryOnPrimaryException52.addSuppressed((java.lang.Throwable) retryOnPrimaryException64);
        java.lang.String[] strArray80 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException52.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray80);
        retryOnPrimaryException11.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray80);
        retryOnPrimaryException2.setResources("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[]", strArray80);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "retry_on_primary_exception" + "'", str4, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + restStatus41 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus41.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(strList72);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str10 = retryOnPrimaryException3.getDetailedMessage();
        java.lang.String str11 = retryOnPrimaryException3.getResourceType();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException3.getResourceId();
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable14 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str15 = retryOnPrimaryException3.getDetailedMessage();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str10, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str15, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!");
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
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray4 = retryOnPrimaryException3.guessRootCauses();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        java.util.List<java.lang.String> strList6 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = retryOnPrimaryException3.guessRootCauses();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException4.addHeader("hi!", strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException4.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        retryOnPrimaryException4.setShard(shardId23);
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str27 = retryOnPrimaryException4.toString();
        retryOnPrimaryException4.setShard("rest.exception.cause.skip", (int) (byte) 10);
        retryOnPrimaryException4.setShard("[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (int) (short) 10);
        java.lang.Throwable throwable34 = retryOnPrimaryException4.getRootCause();
        boolean boolean35 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RetryOnPrimaryException[]" + "'", str27, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "");
        org.junit.Assert.assertEquals(throwable34.toString(), "[[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][10]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable[] throwableArray10 = retryOnPrimaryException9.getSuppressed();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray11 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException9);
        java.lang.Throwable throwable12 = retryOnPrimaryException9.unwrapCause();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray11);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "");
        org.junit.Assert.assertEquals(throwable12.toString(), "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "hi!", throwable9);
        java.lang.Throwable throwable11 = retryOnPrimaryException10.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        org.elasticsearch.index.Index index16 = null;
        retryOnPrimaryException15.setIndex(index16);
        java.lang.Throwable[] throwableArray18 = retryOnPrimaryException15.getSuppressed();
        org.elasticsearch.index.Index index19 = retryOnPrimaryException15.getIndex();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException15.addHeader("hi!", strArray25);
        retryOnPrimaryException10.setResources("rest.exception.stacktrace.skip", strArray25);
        retryOnPrimaryException4.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray25);
        java.lang.Throwable[] throwableArray29 = retryOnPrimaryException4.getSuppressed();
        java.util.List<java.lang.String> strList31 = retryOnPrimaryException4.getHeader("rest.exception.stacktrace.skip");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.Index index33 = retryOnPrimaryException4.getIndex();
        java.util.Set<java.lang.String> strSet34 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.Index index35 = retryOnPrimaryException4.getIndex();
        java.lang.Throwable throwable36 = retryOnPrimaryException4.unwrapCause();
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException4.getResourceId();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertNull(index33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(index35);
        org.junit.Assert.assertNotNull(throwable36);
        org.junit.Assert.assertEquals(throwable36.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable36.getMessage(), "");
        org.junit.Assert.assertEquals(throwable36.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException3.setShard(shardId9);
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException3.getHeaderKeys();
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId13 = retryOnPrimaryException3.getShardId();
        org.elasticsearch.rest.RestStatus restStatus14 = retryOnPrimaryException3.status();
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertTrue("'" + restStatus14 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus14.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.lang.Throwable throwable10 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        java.util.Set<java.lang.String> strSet14 = retryOnPrimaryException13.getHeaderKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException13.addHeader("", (java.util.List<java.lang.String>) strList18);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        retryOnPrimaryException13.setShard(shardId21);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        retryOnPrimaryException13.setShard(shardId24);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        java.lang.Throwable throwable29 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId27, "hi!", throwable29);
        java.util.Set<java.lang.String> strSet31 = retryOnPrimaryException30.getHeaderKeys();
        java.lang.Throwable throwable32 = retryOnPrimaryException30.unwrapCause();
        org.elasticsearch.rest.RestStatus restStatus33 = retryOnPrimaryException30.status();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException41 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId39, "");
        org.elasticsearch.index.Index index42 = null;
        retryOnPrimaryException41.setIndex(index42);
        java.lang.Throwable[] throwableArray44 = retryOnPrimaryException41.getSuppressed();
        org.elasticsearch.index.Index index45 = retryOnPrimaryException41.getIndex();
        java.lang.String str46 = retryOnPrimaryException41.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        java.lang.Throwable throwable50 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "hi!", throwable50);
        java.lang.Throwable throwable52 = retryOnPrimaryException51.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException56 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId54, "");
        org.elasticsearch.index.Index index57 = null;
        retryOnPrimaryException56.setIndex(index57);
        java.lang.Throwable[] throwableArray59 = retryOnPrimaryException56.getSuppressed();
        org.elasticsearch.index.Index index60 = retryOnPrimaryException56.getIndex();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException56.addHeader("hi!", strArray66);
        retryOnPrimaryException51.setResources("rest.exception.stacktrace.skip", strArray66);
        org.elasticsearch.index.shard.ShardId shardId70 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException72 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId70, "");
        org.elasticsearch.index.Index index73 = null;
        retryOnPrimaryException72.setIndex(index73);
        java.lang.Throwable[] throwableArray75 = retryOnPrimaryException72.getSuppressed();
        org.elasticsearch.index.Index index76 = retryOnPrimaryException72.getIndex();
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException72.addHeader("hi!", strArray82);
        retryOnPrimaryException51.setResources("hi!", strArray82);
        retryOnPrimaryException41.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray82);
        retryOnPrimaryException37.setResources("RetryOnPrimaryException[hi!]", strArray82);
        retryOnPrimaryException30.addHeader("RetryOnPrimaryException[hi!]", strArray82);
        retryOnPrimaryException13.setResources("[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", strArray82);
        java.lang.String str89 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException13);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(throwable32);
        org.junit.Assert.assertEquals(throwable32.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus33 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus33.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNull(index45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str46, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable52);
        org.junit.Assert.assertEquals(throwable52.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable52.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable52.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNull(index60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNull(index76);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "retry_on_primary_exception" + "'", str89, "retry_on_primary_exception");
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "hi!", throwable9);
        java.lang.Throwable throwable11 = retryOnPrimaryException10.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        org.elasticsearch.index.Index index16 = null;
        retryOnPrimaryException15.setIndex(index16);
        java.lang.Throwable[] throwableArray18 = retryOnPrimaryException15.getSuppressed();
        org.elasticsearch.index.Index index19 = retryOnPrimaryException15.getIndex();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException15.addHeader("hi!", strArray25);
        retryOnPrimaryException10.setResources("rest.exception.stacktrace.skip", strArray25);
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException10);
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[]");
        boolean boolean31 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        java.util.Set<java.lang.String> strSet40 = retryOnPrimaryException39.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!", throwable44);
        java.lang.Throwable throwable46 = retryOnPrimaryException45.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "");
        org.elasticsearch.index.Index index51 = null;
        retryOnPrimaryException50.setIndex(index51);
        java.lang.Throwable[] throwableArray53 = retryOnPrimaryException50.getSuppressed();
        org.elasticsearch.index.Index index54 = retryOnPrimaryException50.getIndex();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException50.addHeader("hi!", strArray60);
        retryOnPrimaryException45.setResources("rest.exception.stacktrace.skip", strArray60);
        retryOnPrimaryException39.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray60);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException39);
        retryOnPrimaryException34.addSuppressed((java.lang.Throwable) retryOnPrimaryException39);
        java.lang.String str66 = retryOnPrimaryException34.getResourceType();
        java.util.List<java.lang.String> strList67 = retryOnPrimaryException34.getResourceId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.index.shard.ShardId shardId70 = null;
        java.lang.Throwable throwable72 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException73 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId70, "hi!", throwable72);
        java.util.Set<java.lang.String> strSet74 = retryOnPrimaryException73.getHeaderKeys();
        java.lang.Throwable throwable75 = retryOnPrimaryException73.unwrapCause();
        java.lang.Throwable throwable76 = retryOnPrimaryException73.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId78 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException80 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId78, "");
        java.util.Set<java.lang.String> strSet81 = retryOnPrimaryException80.getHeaderKeys();
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        retryOnPrimaryException80.addHeader("", (java.util.List<java.lang.String>) strList85);
        retryOnPrimaryException73.addHeader("RetryOnPrimaryException[hi!]", (java.util.List<java.lang.String>) strList85);
        retryOnPrimaryException3.addHeader("[] RetryOnPrimaryException[]", (java.util.List<java.lang.String>) strList85);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray90 = retryOnPrimaryException3.guessRootCauses();
        java.lang.Throwable[] throwableArray91 = retryOnPrimaryException3.getSuppressed();
        java.lang.Throwable[] throwableArray92 = retryOnPrimaryException3.getSuppressed();
        retryOnPrimaryException3.setIndex("[rest.exception.cause.skip][[rest.exception.cause.skip][-1]] RetryOnPrimaryException[]");
        java.lang.Throwable throwable95 = retryOnPrimaryException3.getRootCause();
        java.lang.Throwable[] throwableArray96 = throwable95.getSuppressed();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "[[rest.exception.cause.skip][[rest.exception.cause.skip][-1]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(throwable46);
        org.junit.Assert.assertEquals(throwable46.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNull(index54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(strList67);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(throwable75);
        org.junit.Assert.assertEquals(throwable75.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable75.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable75.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray90);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray92);
        org.junit.Assert.assertNotNull(throwable95);
        org.junit.Assert.assertEquals(throwable95.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable95.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable95.toString(), "[[rest.exception.cause.skip][[rest.exception.cause.skip][-1]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray96);
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        java.lang.String[] strArray32 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException4.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray32);
        org.elasticsearch.rest.RestStatus restStatus34 = retryOnPrimaryException4.status();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        retryOnPrimaryException4.setShard(shardId35);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId38 = retryOnPrimaryException37.getShardId();
        boolean boolean39 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException37);
        retryOnPrimaryException37.setShard("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];", (int) (byte) 100);
        java.lang.String str43 = retryOnPrimaryException37.getDetailedMessage();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + restStatus34 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus34.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(shardId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];][100]] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str43, "[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];][100]] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray26 = retryOnPrimaryException4.guessRootCauses();
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        java.lang.Throwable throwable32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", throwable32);
        java.lang.Throwable throwable34 = retryOnPrimaryException33.unwrapCause();
        java.lang.String str35 = retryOnPrimaryException33.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray36 = retryOnPrimaryException33.guessRootCauses();
        java.lang.String[] strArray44 = new java.lang.String[] { "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[]", "", "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException33.addHeader("", strArray44);
        retryOnPrimaryException28.setResources("rest.exception.cause.skip", strArray44);
        java.util.List<java.lang.String> strList48 = retryOnPrimaryException28.getHeader("[RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str35, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(strList48);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.setResources("hi!", strArray34);
        org.elasticsearch.index.Index index37 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        java.lang.Throwable throwable40 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException41 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "hi!", throwable40);
        java.lang.Throwable throwable42 = retryOnPrimaryException41.unwrapCause();
        java.lang.String str43 = retryOnPrimaryException41.toString();
        org.elasticsearch.index.shard.ShardId shardId44 = retryOnPrimaryException41.getShardId();
        org.elasticsearch.rest.RestStatus restStatus45 = retryOnPrimaryException41.status();
        java.lang.Throwable throwable46 = retryOnPrimaryException41.getRootCause();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException41);
        java.lang.Throwable throwable48 = retryOnPrimaryException3.unwrapCause();
        java.lang.Throwable throwable49 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str50 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable throwable51 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index52 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray53 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray54 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId55 = null;
        org.elasticsearch.index.shard.ShardId shardId57 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException59 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId57, "");
        org.elasticsearch.index.Index index60 = null;
        retryOnPrimaryException59.setIndex(index60);
        java.lang.Throwable[] throwableArray62 = retryOnPrimaryException59.getSuppressed();
        org.elasticsearch.index.Index index63 = retryOnPrimaryException59.getIndex();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException59.addHeader("hi!", strArray69);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        retryOnPrimaryException59.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList75);
        org.elasticsearch.index.shard.ShardId shardId78 = null;
        retryOnPrimaryException59.setShard(shardId78);
        java.util.List<java.lang.String> strList80 = retryOnPrimaryException59.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException81 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId55, "", (java.lang.Throwable) retryOnPrimaryException59);
        java.util.Set<java.lang.String> strSet82 = retryOnPrimaryException59.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus83 = retryOnPrimaryException59.status();
        boolean boolean84 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException59);
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException59);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str43, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId44);
        org.junit.Assert.assertTrue("'" + restStatus45 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus45.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable46);
        org.junit.Assert.assertEquals(throwable46.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable48);
        org.junit.Assert.assertEquals(throwable48.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable49);
        org.junit.Assert.assertEquals(throwable49.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable49.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable49.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "retry_on_primary_exception" + "'", str50, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable51);
        org.junit.Assert.assertEquals(throwable51.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable51.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable51.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index52);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray53);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray54);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNull(index63);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(strList80);
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertTrue("'" + restStatus83 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus83.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException2.setShard(shardId6);
        java.lang.Throwable throwable8 = retryOnPrimaryException2.getRootCause();
        java.lang.String str9 = retryOnPrimaryException2.toString();
        java.lang.Throwable[] throwableArray10 = retryOnPrimaryException2.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "retry_on_primary_exception" + "'", str4, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[]" + "'", str9, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException5.setShard(shardId7);
        java.lang.String str9 = retryOnPrimaryException5.toString();
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        java.lang.Throwable throwable11 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index13 = null;
        retryOnPrimaryException5.setIndex(index13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable throwable20 = retryOnPrimaryException17.getRootCause();
        java.util.List<java.lang.String> strList21 = retryOnPrimaryException17.getResourceId();
        java.lang.String[] strArray26 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException17.setResources("", strArray26);
        org.elasticsearch.index.Index index28 = retryOnPrimaryException17.getIndex();
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        retryOnPrimaryException17.setShard("[rest.exception.cause.skip] RetryOnPrimaryException[]", (int) '4');
        java.lang.Throwable throwable33 = retryOnPrimaryException17.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        java.util.Set<java.lang.String> strSet37 = retryOnPrimaryException36.getHeaderKeys();
        java.lang.String str38 = retryOnPrimaryException36.toString();
        boolean boolean39 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException36);
        boolean boolean40 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException36);
        java.lang.String str41 = retryOnPrimaryException36.getDetailedMessage();
        java.lang.Throwable throwable42 = retryOnPrimaryException36.unwrapCause();
        retryOnPrimaryException17.addSuppressed((java.lang.Throwable) retryOnPrimaryException36);
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException47 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId45, "");
        java.util.Set<java.lang.String> strSet48 = retryOnPrimaryException47.getHeaderKeys();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        retryOnPrimaryException47.addHeader("", (java.util.List<java.lang.String>) strList52);
        retryOnPrimaryException47.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId57 = retryOnPrimaryException47.getShardId();
        org.elasticsearch.index.shard.ShardId shardId59 = null;
        java.lang.Throwable throwable61 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId59, "hi!", throwable61);
        java.lang.Throwable throwable63 = retryOnPrimaryException62.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId65 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException67 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId65, "");
        org.elasticsearch.index.Index index68 = null;
        retryOnPrimaryException67.setIndex(index68);
        java.lang.Throwable[] throwableArray70 = retryOnPrimaryException67.getSuppressed();
        org.elasticsearch.index.Index index71 = retryOnPrimaryException67.getIndex();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException67.addHeader("hi!", strArray77);
        retryOnPrimaryException62.setResources("rest.exception.stacktrace.skip", strArray77);
        org.elasticsearch.index.shard.ShardId shardId81 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException83 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId81, "");
        org.elasticsearch.index.Index index84 = null;
        retryOnPrimaryException83.setIndex(index84);
        java.lang.Throwable[] throwableArray86 = retryOnPrimaryException83.getSuppressed();
        org.elasticsearch.index.Index index87 = retryOnPrimaryException83.getIndex();
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException83.addHeader("hi!", strArray93);
        retryOnPrimaryException62.setResources("hi!", strArray93);
        retryOnPrimaryException47.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray93);
        retryOnPrimaryException36.setResources("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!];", strArray93);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "");
        org.junit.Assert.assertEquals(throwable20.toString(), "[[rest.exception.cause.skip] RetryOnPrimaryException[]][[[rest.exception.cause.skip] RetryOnPrimaryException[]][52]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(throwable33);
        org.junit.Assert.assertEquals(throwable33.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable33.getMessage(), "");
        org.junit.Assert.assertEquals(throwable33.toString(), "[[rest.exception.cause.skip] RetryOnPrimaryException[]][[[rest.exception.cause.skip] RetryOnPrimaryException[]][52]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RetryOnPrimaryException[]" + "'", str38, "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str41, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "");
        org.junit.Assert.assertEquals(throwable42.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(shardId57);
        org.junit.Assert.assertNotNull(throwable63);
        org.junit.Assert.assertEquals(throwable63.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable63.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable63.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNull(index71);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNull(index87);
        org.junit.Assert.assertNotNull(strArray93);
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException4.getResourceId();
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException4.getHeaderKeys();
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException4.getResourceId();
        retryOnPrimaryException4.setIndex("");
        boolean boolean17 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException4);
        java.util.List<java.lang.String> strList19 = retryOnPrimaryException4.getHeader("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray20 = retryOnPrimaryException4.guessRootCauses();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray20);
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException2.getHeaderKeys();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray13 = retryOnPrimaryException2.guessRootCauses();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray13);
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException2.addHeader("hi!", strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException2.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList18);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        retryOnPrimaryException2.setShard(shardId21);
        java.util.List<java.lang.String> strList23 = retryOnPrimaryException2.getResourceId();
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException2.getHeader("");
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        java.lang.Throwable throwable28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "hi!", throwable28);
        java.util.Set<java.lang.String> strSet30 = retryOnPrimaryException29.getHeaderKeys();
        java.lang.Throwable throwable31 = retryOnPrimaryException29.unwrapCause();
        java.lang.Throwable throwable32 = retryOnPrimaryException29.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId33 = retryOnPrimaryException29.getShardId();
        java.lang.String str34 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException29);
        boolean boolean35 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException29);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException29);
        java.lang.String str37 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        java.lang.Throwable throwable40 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException41 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "hi!", throwable40);
        java.lang.Throwable throwable42 = retryOnPrimaryException41.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException46 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "");
        org.elasticsearch.index.Index index47 = null;
        retryOnPrimaryException46.setIndex(index47);
        java.lang.Throwable[] throwableArray49 = retryOnPrimaryException46.getSuppressed();
        org.elasticsearch.index.Index index50 = retryOnPrimaryException46.getIndex();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException46.addHeader("hi!", strArray56);
        retryOnPrimaryException41.setResources("rest.exception.stacktrace.skip", strArray56);
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId60, "");
        org.elasticsearch.index.Index index63 = null;
        retryOnPrimaryException62.setIndex(index63);
        java.lang.Throwable[] throwableArray65 = retryOnPrimaryException62.getSuppressed();
        org.elasticsearch.index.Index index66 = retryOnPrimaryException62.getIndex();
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException62.addHeader("hi!", strArray72);
        retryOnPrimaryException41.addHeader("hi!", strArray72);
        boolean boolean75 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException41);
        java.lang.String[] strArray77 = new java.lang.String[] {};
        retryOnPrimaryException41.addHeader("rest.exception.cause.skip", strArray77);
        java.lang.String str79 = retryOnPrimaryException41.toString();
        java.lang.String str80 = retryOnPrimaryException41.getDetailedMessage();
        java.util.Set<java.lang.String> strSet81 = retryOnPrimaryException41.getHeaderKeys();
        retryOnPrimaryException41.setIndex("[[] RetryOnPrimaryException[]][[[] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        retryOnPrimaryException41.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException41);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray87 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException41);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strList23);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable31.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable32);
        org.junit.Assert.assertEquals(throwable32.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable32.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "retry_on_primary_exception" + "'", str34, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "retry_on_primary_exception" + "'", str37, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable42.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNull(index50);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNull(index66);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str79, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str80, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray87);
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.index.Index index19 = null;
        retryOnPrimaryException18.setIndex(index19);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException18.getIndex();
        java.lang.String str23 = retryOnPrimaryException18.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!", throwable27);
        java.lang.Throwable throwable29 = retryOnPrimaryException28.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException28.setResources("rest.exception.stacktrace.skip", strArray43);
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId47, "");
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException49.setIndex(index50);
        java.lang.Throwable[] throwableArray52 = retryOnPrimaryException49.getSuppressed();
        org.elasticsearch.index.Index index53 = retryOnPrimaryException49.getIndex();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException49.addHeader("hi!", strArray59);
        retryOnPrimaryException28.setResources("hi!", strArray59);
        retryOnPrimaryException18.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        retryOnPrimaryException14.setResources("RetryOnPrimaryException[hi!]", strArray59);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.rest.RestStatus restStatus65 = retryOnPrimaryException14.status();
        java.lang.String str66 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException14);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str23, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNull(index53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + restStatus65 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus65.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "retry_on_primary_exception" + "'", str66, "retry_on_primary_exception");
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        java.lang.String str25 = retryOnPrimaryException16.toString();
        java.lang.Throwable throwable26 = retryOnPrimaryException16.unwrapCause();
        boolean boolean27 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException16);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RetryOnPrimaryException[]" + "'", str25, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        retryOnPrimaryException2.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        retryOnPrimaryException2.setShard(shardId10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        retryOnPrimaryException2.setShard(shardId12);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        java.util.Set<java.lang.String> strSet18 = retryOnPrimaryException17.getHeaderKeys();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        retryOnPrimaryException17.addHeader("", (java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException17.getResourceId();
        java.util.Set<java.lang.String> strSet26 = retryOnPrimaryException17.getHeaderKeys();
        java.util.List<java.lang.String> strList27 = retryOnPrimaryException17.getResourceId();
        org.elasticsearch.index.Index index28 = null;
        retryOnPrimaryException17.setIndex(index28);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "hi!", throwable33);
        java.lang.Throwable throwable35 = retryOnPrimaryException34.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        org.elasticsearch.index.Index index40 = null;
        retryOnPrimaryException39.setIndex(index40);
        java.lang.Throwable[] throwableArray42 = retryOnPrimaryException39.getSuppressed();
        org.elasticsearch.index.Index index43 = retryOnPrimaryException39.getIndex();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException39.addHeader("hi!", strArray49);
        retryOnPrimaryException34.setResources("rest.exception.stacktrace.skip", strArray49);
        retryOnPrimaryException17.addHeader("rest.exception.cause.skip", strArray49);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[hi!]", strArray49);
        org.elasticsearch.index.Index index54 = null;
        retryOnPrimaryException2.setIndex(index54);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput56 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException2.writeTo(streamOutput56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNull(index43);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException7.setShard(shardId9);
        java.lang.String str11 = retryOnPrimaryException7.toString();
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException7.status();
        java.lang.Throwable throwable13 = retryOnPrimaryException7.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.Index index15 = null;
        retryOnPrimaryException7.setIndex(index15);
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]", (java.lang.Throwable) retryOnPrimaryException7);
        java.lang.String[] strArray25 = new java.lang.String[] { "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][1]] RetryOnPrimaryException[]", "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];", "[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]", "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]", "[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException7.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: retry_on_primary_exception", strArray25);
        java.lang.String str27 = retryOnPrimaryException7.getResourceType();
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        java.lang.String str7 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.Index index8 = null;
        retryOnPrimaryException2.setIndex(index8);
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.lang.Throwable throwable12 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.index.Index index13 = retryOnPrimaryException2.getIndex();
        java.lang.Throwable[] throwableArray14 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str7, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "");
        org.junit.Assert.assertEquals(throwable12.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        java.util.Set<java.lang.String> strSet9 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable10 = retryOnPrimaryException3.getRootCause();
        org.elasticsearch.rest.RestStatus restStatus11 = retryOnPrimaryException3.status();
        java.lang.Throwable throwable12 = retryOnPrimaryException3.getRootCause();
        java.lang.String str13 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException3.getResourceId();
        java.lang.String str15 = retryOnPrimaryException3.toString();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus11 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus11.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "retry_on_primary_exception" + "'", str13, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str15, "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.String str13 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.rest.RestStatus restStatus14 = retryOnPrimaryException11.status();
        java.util.List<java.lang.String> strList15 = retryOnPrimaryException11.getResourceId();
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException11.getHeader("retry_on_primary_exception");
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        retryOnPrimaryException11.setShard(shardId18);
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        java.lang.String str21 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        java.lang.Throwable throwable25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "hi!", throwable25);
        java.lang.Throwable throwable27 = retryOnPrimaryException26.unwrapCause();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException26.getIndex();
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        retryOnPrimaryException26.setShard(shardId29);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        java.lang.Throwable throwable34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "hi!", throwable34);
        java.lang.Throwable throwable36 = retryOnPrimaryException35.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId38, "");
        org.elasticsearch.index.Index index41 = null;
        retryOnPrimaryException40.setIndex(index41);
        java.lang.Throwable[] throwableArray43 = retryOnPrimaryException40.getSuppressed();
        org.elasticsearch.index.Index index44 = retryOnPrimaryException40.getIndex();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException40.addHeader("hi!", strArray50);
        retryOnPrimaryException35.setResources("rest.exception.stacktrace.skip", strArray50);
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException56 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId54, "");
        org.elasticsearch.index.Index index57 = null;
        retryOnPrimaryException56.setIndex(index57);
        java.lang.Throwable[] throwableArray59 = retryOnPrimaryException56.getSuppressed();
        org.elasticsearch.index.Index index60 = retryOnPrimaryException56.getIndex();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException56.addHeader("hi!", strArray66);
        retryOnPrimaryException35.setResources("hi!", strArray66);
        retryOnPrimaryException26.setResources("retry_on_primary_exception", strArray66);
        retryOnPrimaryException3.setResources("[] RetryOnPrimaryException[]", strArray66);
        org.elasticsearch.index.Index index71 = null;
        retryOnPrimaryException3.setIndex(index71);
        java.lang.String str73 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.util.Set<java.lang.String> strSet74 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId75 = retryOnPrimaryException3.getShardId();
        java.lang.Throwable throwable76 = retryOnPrimaryException3.getRootCause();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "retry_on_primary_exception" + "'", str13, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus14 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus14.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str21, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable27.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(throwable36);
        org.junit.Assert.assertEquals(throwable36.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable36.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable36.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNull(index44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNull(index60);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "retry_on_primary_exception" + "'", str73, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNull(shardId75);
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        java.util.Set<java.lang.String> strSet7 = retryOnPrimaryException6.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        retryOnPrimaryException6.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray27);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException6.getSuppressed();
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException6.getHeader("rest.exception.stacktrace.skip");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException34);
        java.lang.Throwable throwable36 = retryOnPrimaryException34.getRootCause();
        retryOnPrimaryException34.setShard("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]", (-1));
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray40 = retryOnPrimaryException34.guessRootCauses();
        retryOnPrimaryException34.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.cause.skip", (int) (byte) 1);
        java.lang.String str44 = retryOnPrimaryException34.getDetailedMessage();
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(throwable36);
        org.junit.Assert.assertEquals(throwable36.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable36.getMessage(), "");
        org.junit.Assert.assertEquals(throwable36.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.cause.skip][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.cause.skip][1]] RetryOnPrimaryException[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str44, "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.cause.skip][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.cause.skip][1]] RetryOnPrimaryException[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.lang.Throwable throwable10 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        java.util.Set<java.lang.String> strSet14 = retryOnPrimaryException13.getHeaderKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException13.addHeader("", (java.util.List<java.lang.String>) strList18);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        retryOnPrimaryException13.setShard(shardId21);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        java.util.Set<java.lang.String> strSet24 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str25 = retryOnPrimaryException2.getDetailedMessage();
        java.lang.Throwable throwable26 = retryOnPrimaryException2.unwrapCause();
        java.util.List<java.lang.String> strList27 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.rest.RestStatus restStatus28 = retryOnPrimaryException2.status();
        java.lang.Throwable[] throwableArray29 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        java.lang.Throwable throwable32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", throwable32);
        java.util.Set<java.lang.String> strSet34 = retryOnPrimaryException33.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        retryOnPrimaryException33.setShard(shardId35);
        java.lang.String str37 = retryOnPrimaryException33.toString();
        org.elasticsearch.rest.RestStatus restStatus38 = retryOnPrimaryException33.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray39 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException33);
        java.lang.Throwable throwable40 = retryOnPrimaryException33.getRootCause();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException33);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str25, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "");
        org.junit.Assert.assertEquals(throwable26.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertTrue("'" + restStatus28 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus28.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str37, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus38 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus38.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray39);
        org.junit.Assert.assertNotNull(throwable40);
        org.junit.Assert.assertEquals(throwable40.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable40.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable40.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = retryOnPrimaryException2.toString();
        java.lang.String str5 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException2.setIndex(index6);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[]");
        org.elasticsearch.rest.RestStatus restStatus11 = retryOnPrimaryException2.status();
        java.lang.String str12 = retryOnPrimaryException2.toString();
        java.lang.Throwable throwable13 = retryOnPrimaryException2.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        java.lang.Throwable throwable16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "hi!", throwable16);
        java.util.Set<java.lang.String> strSet18 = retryOnPrimaryException17.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        retryOnPrimaryException17.setShard(shardId19);
        java.lang.String str21 = retryOnPrimaryException17.toString();
        org.elasticsearch.rest.RestStatus restStatus22 = retryOnPrimaryException17.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray23 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException17);
        retryOnPrimaryException17.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (int) (byte) 100);
        boolean boolean27 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException17);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray28 = retryOnPrimaryException17.guessRootCauses();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RetryOnPrimaryException[]" + "'", str4, "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str5, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertTrue("'" + restStatus11 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus11.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RetryOnPrimaryException[]" + "'", str12, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str21, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus22 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus22.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray28);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException4.getResourceId();
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException4.getHeaderKeys();
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.index.Index index15 = null;
        retryOnPrimaryException4.setIndex(index15);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        java.lang.Throwable throwable20 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId18, "hi!", throwable20);
        java.lang.Throwable throwable22 = retryOnPrimaryException21.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "");
        org.elasticsearch.index.Index index27 = null;
        retryOnPrimaryException26.setIndex(index27);
        java.lang.Throwable[] throwableArray29 = retryOnPrimaryException26.getSuppressed();
        org.elasticsearch.index.Index index30 = retryOnPrimaryException26.getIndex();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException26.addHeader("hi!", strArray36);
        retryOnPrimaryException21.setResources("rest.exception.stacktrace.skip", strArray36);
        retryOnPrimaryException4.addHeader("rest.exception.cause.skip", strArray36);
        java.lang.Throwable throwable40 = retryOnPrimaryException4.getRootCause();
        org.elasticsearch.index.Index index41 = retryOnPrimaryException4.getIndex();
        java.lang.String str42 = retryOnPrimaryException4.getDetailedMessage();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput44 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException43.writeTo(streamOutput44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNotNull(throwable22);
        org.junit.Assert.assertEquals(throwable22.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable22.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable22.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(index30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(throwable40);
        org.junit.Assert.assertEquals(throwable40.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable40.getMessage(), "");
        org.junit.Assert.assertEquals(throwable40.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(index41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str42, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.lang.Throwable throwable10 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        java.util.Set<java.lang.String> strSet14 = retryOnPrimaryException13.getHeaderKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException13.addHeader("", (java.util.List<java.lang.String>) strList18);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        retryOnPrimaryException13.setShard(shardId21);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException13);
        java.util.Set<java.lang.String> strSet24 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str25 = retryOnPrimaryException2.getDetailedMessage();
        boolean boolean26 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.util.List<java.lang.String> strList27 = retryOnPrimaryException2.getResourceId();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str25, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strList27);
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.index.Index index8 = null;
        retryOnPrimaryException3.setIndex(index8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable11 = retryOnPrimaryException3.getRootCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray12 = retryOnPrimaryException3.guessRootCauses();
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        retryOnPrimaryException3.setIndex("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException2.setShard(shardId20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        retryOnPrimaryException2.setShard(shardId25);
        retryOnPrimaryException2.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", 1);
        java.util.List<java.lang.String> strList31 = retryOnPrimaryException2.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.lang.String str32 = retryOnPrimaryException2.toString();
        java.lang.String str33 = retryOnPrimaryException2.getDetailedMessage();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(strList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][1]] RetryOnPrimaryException[]" + "'", str32, "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][1]] RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str33, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.lang.Throwable throwable8 = retryOnPrimaryException7.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "");
        org.elasticsearch.index.Index index13 = null;
        retryOnPrimaryException12.setIndex(index13);
        java.lang.Throwable[] throwableArray15 = retryOnPrimaryException12.getSuppressed();
        org.elasticsearch.index.Index index16 = retryOnPrimaryException12.getIndex();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException12.addHeader("hi!", strArray22);
        retryOnPrimaryException7.setResources("rest.exception.stacktrace.skip", strArray22);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.shard.ShardId shardId26 = retryOnPrimaryException25.getShardId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException25);
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId29, "");
        java.util.Set<java.lang.String> strSet32 = retryOnPrimaryException31.getHeaderKeys();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        retryOnPrimaryException31.addHeader("", (java.util.List<java.lang.String>) strList36);
        retryOnPrimaryException31.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        java.util.Set<java.lang.String> strSet44 = retryOnPrimaryException43.getHeaderKeys();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        retryOnPrimaryException43.addHeader("", (java.util.List<java.lang.String>) strList48);
        java.util.List<java.lang.String> strList51 = retryOnPrimaryException43.getResourceId();
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException43);
        java.lang.String[] strArray59 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException31.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        java.lang.Throwable[] throwableArray61 = retryOnPrimaryException31.getSuppressed();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray62 = retryOnPrimaryException31.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId64 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException66 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId64, "");
        org.elasticsearch.index.Index index67 = null;
        retryOnPrimaryException66.setIndex(index67);
        java.lang.Throwable[] throwableArray69 = retryOnPrimaryException66.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId71 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException73 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId71, "");
        java.util.Set<java.lang.String> strSet74 = retryOnPrimaryException73.getHeaderKeys();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        retryOnPrimaryException73.addHeader("", (java.util.List<java.lang.String>) strList78);
        retryOnPrimaryException66.addHeader("", (java.util.List<java.lang.String>) strList78);
        java.util.List<java.lang.String> strList82 = retryOnPrimaryException66.getResourceId();
        java.util.Set<java.lang.String> strSet83 = retryOnPrimaryException66.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId84 = null;
        retryOnPrimaryException66.setShard(shardId84);
        java.lang.String[] strArray87 = new java.lang.String[] {};
        retryOnPrimaryException66.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray87);
        retryOnPrimaryException31.addHeader("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];", strArray87);
        retryOnPrimaryException25.addHeader("retry_on_primary_exception", strArray87);
        java.lang.Throwable throwable91 = retryOnPrimaryException25.unwrapCause();
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(shardId26);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray62);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(strList82);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(throwable91);
        org.junit.Assert.assertEquals(throwable91.getLocalizedMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable91.getMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable91.toString(), "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];");
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException2.getHeaderKeys();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.index.Index index13 = null;
        retryOnPrimaryException2.setIndex(index13);
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        java.lang.Throwable throwable18 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException19 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "hi!", throwable18);
        java.lang.Throwable throwable20 = retryOnPrimaryException19.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException19.setResources("rest.exception.stacktrace.skip", strArray34);
        retryOnPrimaryException2.addHeader("rest.exception.cause.skip", strArray34);
        java.lang.Throwable throwable38 = retryOnPrimaryException2.getRootCause();
        org.elasticsearch.index.Index index39 = retryOnPrimaryException2.getIndex();
        java.lang.String str40 = retryOnPrimaryException2.getDetailedMessage();
        java.lang.String str41 = retryOnPrimaryException2.toString();
        java.lang.String str42 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder43 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params44 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = retryOnPrimaryException2.toXContent(xContentBuilder43, params44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable38);
        org.junit.Assert.assertEquals(throwable38.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable38.getMessage(), "");
        org.junit.Assert.assertEquals(throwable38.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(index39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str40, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RetryOnPrimaryException[]" + "'", str41, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(params44);
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException6 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "");
        org.elasticsearch.index.Index index7 = null;
        retryOnPrimaryException6.setIndex(index7);
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException6.getSuppressed();
        org.elasticsearch.index.Index index10 = retryOnPrimaryException6.getIndex();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException6.addHeader("hi!", strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        retryOnPrimaryException6.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList22);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        retryOnPrimaryException6.setShard(shardId25);
        java.util.List<java.lang.String> strList27 = retryOnPrimaryException6.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException6);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "");
        java.util.Set<java.lang.String> strSet33 = retryOnPrimaryException32.getHeaderKeys();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        retryOnPrimaryException32.addHeader("", (java.util.List<java.lang.String>) strList37);
        retryOnPrimaryException32.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "");
        java.util.Set<java.lang.String> strSet45 = retryOnPrimaryException44.getHeaderKeys();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        retryOnPrimaryException44.addHeader("", (java.util.List<java.lang.String>) strList49);
        java.util.List<java.lang.String> strList52 = retryOnPrimaryException44.getResourceId();
        retryOnPrimaryException32.addSuppressed((java.lang.Throwable) retryOnPrimaryException44);
        java.lang.String[] strArray60 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException32.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray60);
        retryOnPrimaryException28.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray60);
        java.lang.Throwable throwable63 = retryOnPrimaryException28.unwrapCause();
        java.lang.String str64 = retryOnPrimaryException28.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId65 = null;
        java.lang.Throwable throwable67 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException68 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId65, "hi!", throwable67);
        java.lang.Throwable throwable69 = retryOnPrimaryException68.unwrapCause();
        java.lang.String str70 = retryOnPrimaryException68.toString();
        org.elasticsearch.index.Index index71 = null;
        retryOnPrimaryException68.setIndex(index71);
        java.lang.String str73 = retryOnPrimaryException68.toString();
        org.elasticsearch.rest.RestStatus restStatus74 = retryOnPrimaryException68.status();
        org.elasticsearch.rest.RestStatus restStatus75 = retryOnPrimaryException68.status();
        java.lang.Throwable throwable76 = retryOnPrimaryException68.unwrapCause();
        java.lang.Throwable throwable77 = retryOnPrimaryException68.getRootCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray78 = retryOnPrimaryException68.guessRootCauses();
        retryOnPrimaryException28.addSuppressed((java.lang.Throwable) retryOnPrimaryException68);
        java.lang.String str80 = retryOnPrimaryException68.getResourceType();
        org.elasticsearch.rest.RestStatus restStatus81 = retryOnPrimaryException68.status();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(index10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(strList27);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(strList52);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(throwable63);
        org.junit.Assert.assertEquals(throwable63.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable63.getMessage(), "");
        org.junit.Assert.assertEquals(throwable63.toString(), "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str64, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable69);
        org.junit.Assert.assertEquals(throwable69.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable69.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable69.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str70, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str73, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus74 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus74.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + restStatus75 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus75.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable77);
        org.junit.Assert.assertEquals(throwable77.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable77.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable77.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + restStatus81 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus81.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "");
        org.elasticsearch.index.Index index36 = retryOnPrimaryException35.getIndex();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException35);
        java.util.List<java.lang.String> strList39 = retryOnPrimaryException2.getHeader("[] RetryOnPrimaryException[]");
        java.lang.String str40 = retryOnPrimaryException2.toString();
        java.util.Set<java.lang.String> strSet41 = retryOnPrimaryException2.getHeaderKeys();
        retryOnPrimaryException2.setShard("[[] RetryOnPrimaryException[]][[[] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[hi!] RetryOnPrimaryException[]" + "'", str40, "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet41);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.lang.String str11 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.rest.RestStatus restStatus14 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        java.util.Set<java.lang.String> strSet21 = retryOnPrimaryException17.getHeaderKeys();
        retryOnPrimaryException17.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException17.setIndex(index25);
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException17.status();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        retryOnPrimaryException17.setShard(shardId28);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        boolean boolean31 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException17);
        java.lang.String str32 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException17);
        java.util.List<java.lang.String> strList34 = retryOnPrimaryException17.getHeader("[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str11, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertTrue("'" + restStatus14 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus14.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "retry_on_primary_exception" + "'", str32, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList34);
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "");
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        java.lang.Throwable throwable12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "hi!", throwable12);
        java.lang.Throwable throwable14 = retryOnPrimaryException13.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.index.Index index19 = null;
        retryOnPrimaryException18.setIndex(index19);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException18.getIndex();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException18.addHeader("hi!", strArray28);
        retryOnPrimaryException13.setResources("rest.exception.stacktrace.skip", strArray28);
        retryOnPrimaryException7.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray28);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId3, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException7);
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException32.getResourceId();
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException32.setIndex(index34);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException32);
        retryOnPrimaryException32.setIndex("[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]");
        java.lang.Class<?> wildcardClass39 = retryOnPrimaryException32.getClass();
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.rest.RestStatus restStatus6 = retryOnPrimaryException2.status();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + restStatus6 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus6.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.lang.Throwable throwable8 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId9 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable throwable16 = retryOnPrimaryException13.getRootCause();
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException13.getResourceId();
        java.lang.String[] strArray22 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException13.setResources("", strArray22);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray22);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException5);
        boolean boolean26 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException5.status();
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        boolean boolean30 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException5.getSuppressed();
        retryOnPrimaryException5.setIndex("[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]");
        java.lang.Throwable throwable34 = retryOnPrimaryException5.getRootCause();
        java.lang.String str35 = org.elasticsearch.ElasticsearchException.getExceptionName(throwable34);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "");
        org.junit.Assert.assertEquals(throwable16.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.toString(), "[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "retry_on_primary_exception" + "'", str35, "retry_on_primary_exception");
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        boolean boolean4 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable throwable5 = retryOnPrimaryException3.getRootCause();
        java.util.List<java.lang.String> strList6 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.index.Index index19 = null;
        retryOnPrimaryException18.setIndex(index19);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException18.getIndex();
        java.lang.String str23 = retryOnPrimaryException18.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!", throwable27);
        java.lang.Throwable throwable29 = retryOnPrimaryException28.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException28.setResources("rest.exception.stacktrace.skip", strArray43);
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId47, "");
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException49.setIndex(index50);
        java.lang.Throwable[] throwableArray52 = retryOnPrimaryException49.getSuppressed();
        org.elasticsearch.index.Index index53 = retryOnPrimaryException49.getIndex();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException49.addHeader("hi!", strArray59);
        retryOnPrimaryException28.setResources("hi!", strArray59);
        retryOnPrimaryException18.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        retryOnPrimaryException14.setResources("RetryOnPrimaryException[hi!]", strArray59);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.rest.RestStatus restStatus65 = retryOnPrimaryException14.status();
        java.lang.String str66 = retryOnPrimaryException14.toString();
        org.elasticsearch.rest.RestStatus restStatus67 = retryOnPrimaryException14.status();
        org.elasticsearch.index.Index index68 = retryOnPrimaryException14.getIndex();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str23, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNull(index53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + restStatus65 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus65.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "RetryOnPrimaryException[rest.exception.stacktrace.skip]" + "'", str66, "RetryOnPrimaryException[rest.exception.stacktrace.skip]");
        org.junit.Assert.assertTrue("'" + restStatus67 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus67.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(index68);
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8603");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable throwable7 = retryOnPrimaryException4.getRootCause();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str10 = retryOnPrimaryException9.toString();
        boolean boolean11 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException9);
        java.lang.String str12 = retryOnPrimaryException9.getResourceType();
        java.lang.Throwable[] throwableArray13 = retryOnPrimaryException9.getSuppressed();
        org.elasticsearch.rest.RestStatus restStatus14 = retryOnPrimaryException9.status();
        org.elasticsearch.rest.RestStatus restStatus15 = retryOnPrimaryException9.status();
        java.lang.Throwable throwable16 = retryOnPrimaryException9.unwrapCause();
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];" + "'", str10, "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + restStatus14 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus14.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + restStatus15 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus15.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "");
        org.junit.Assert.assertEquals(throwable16.toString(), "RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8604");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = retryOnPrimaryException2.toString();
        java.lang.String str5 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException2.setIndex(index6);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[]");
        org.elasticsearch.rest.RestStatus restStatus11 = retryOnPrimaryException2.status();
        java.lang.String str12 = retryOnPrimaryException2.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray13 = retryOnPrimaryException2.guessRootCauses();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RetryOnPrimaryException[]" + "'", str4, "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str5, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertTrue("'" + restStatus11 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus11.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RetryOnPrimaryException[]" + "'", str12, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray13);
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8605");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException5.setShard(shardId7);
        java.lang.String str9 = retryOnPrimaryException5.toString();
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        java.lang.Throwable throwable11 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        retryOnPrimaryException5.setShard(shardId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        retryOnPrimaryException5.setShard(shardId15);
        retryOnPrimaryException5.setShard("[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]", (int) ' ');
        java.lang.Throwable throwable20 = retryOnPrimaryException5.getRootCause();
        java.util.List<java.lang.String> strList21 = retryOnPrimaryException5.getResourceId();
        boolean boolean22 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][32]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][[[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]][32]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8606");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        java.util.List<java.lang.String> strList6 = retryOnPrimaryException2.getResourceId();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException2.getHeader("retry_on_primary_exception");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException2.setShard(shardId9);
        org.elasticsearch.rest.RestStatus restStatus11 = retryOnPrimaryException2.status();
        retryOnPrimaryException2.setShard("[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]", 100);
        java.lang.String str15 = retryOnPrimaryException2.toString();
        boolean boolean16 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        java.lang.Throwable throwable19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException20 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "hi!", throwable19);
        java.lang.Throwable throwable21 = retryOnPrimaryException20.unwrapCause();
        java.lang.String str22 = retryOnPrimaryException20.toString();
        org.elasticsearch.index.shard.ShardId shardId23 = retryOnPrimaryException20.getShardId();
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException20.getResourceId();
        java.lang.Throwable[] throwableArray25 = retryOnPrimaryException20.getSuppressed();
        java.util.Set<java.lang.String> strSet26 = retryOnPrimaryException20.getHeaderKeys();
        java.lang.Throwable throwable27 = retryOnPrimaryException20.getRootCause();
        org.elasticsearch.rest.RestStatus restStatus28 = retryOnPrimaryException20.status();
        java.lang.Throwable throwable29 = retryOnPrimaryException20.getRootCause();
        retryOnPrimaryException2.addSuppressed(throwable29);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "retry_on_primary_exception" + "'", str4, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + restStatus11 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus11.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]][[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]" + "'", str15, "[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]][[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwable21);
        org.junit.Assert.assertEquals(throwable21.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable21.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable21.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str22, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable27.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus28 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus28.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8607");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.index.Index index11 = null;
        retryOnPrimaryException10.setIndex(index11);
        java.lang.Throwable[] throwableArray13 = retryOnPrimaryException10.getSuppressed();
        org.elasticsearch.index.Index index14 = retryOnPrimaryException10.getIndex();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException10.addHeader("hi!", strArray20);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray20);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException23.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        java.util.Set<java.lang.String> strSet29 = retryOnPrimaryException28.getHeaderKeys();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        retryOnPrimaryException28.addHeader("", (java.util.List<java.lang.String>) strList33);
        retryOnPrimaryException23.addHeader("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException23.getResourceId();
        retryOnPrimaryException23.setShard("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) 'a');
        retryOnPrimaryException23.setIndex("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.lang.Throwable throwable43 = retryOnPrimaryException23.unwrapCause();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(throwable43);
        org.junit.Assert.assertEquals(throwable43.getLocalizedMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable43.getMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable43.toString(), "[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][97]] RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];");
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8608");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        java.lang.String str7 = retryOnPrimaryException5.toString();
        org.elasticsearch.index.Index index8 = null;
        retryOnPrimaryException5.setIndex(index8);
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        java.util.List<java.lang.String> strList12 = retryOnPrimaryException5.getHeader("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray13 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str7, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray13);
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8609");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray26 = retryOnPrimaryException4.guessRootCauses();
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];", (java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        java.lang.Throwable throwable32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", throwable32);
        java.lang.Throwable throwable34 = retryOnPrimaryException33.unwrapCause();
        java.lang.String str35 = retryOnPrimaryException33.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray36 = retryOnPrimaryException33.guessRootCauses();
        java.lang.String[] strArray44 = new java.lang.String[] { "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[]", "", "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException33.addHeader("", strArray44);
        retryOnPrimaryException28.setResources("rest.exception.cause.skip", strArray44);
        org.elasticsearch.index.Index index47 = retryOnPrimaryException28.getIndex();
        org.elasticsearch.rest.RestStatus restStatus48 = retryOnPrimaryException28.status();
        boolean boolean49 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException28);
        java.lang.Throwable throwable50 = retryOnPrimaryException28.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId51 = null;
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        java.util.Set<java.lang.String> strSet56 = retryOnPrimaryException55.getHeaderKeys();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        retryOnPrimaryException55.addHeader("", (java.util.List<java.lang.String>) strList60);
        retryOnPrimaryException55.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId65 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException67 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId65, "");
        java.util.Set<java.lang.String> strSet68 = retryOnPrimaryException67.getHeaderKeys();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        retryOnPrimaryException67.addHeader("", (java.util.List<java.lang.String>) strList72);
        java.util.List<java.lang.String> strList75 = retryOnPrimaryException67.getResourceId();
        retryOnPrimaryException55.addSuppressed((java.lang.Throwable) retryOnPrimaryException67);
        java.lang.String[] strArray83 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException55.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray83);
        org.elasticsearch.rest.RestStatus restStatus85 = retryOnPrimaryException55.status();
        org.elasticsearch.index.shard.ShardId shardId86 = null;
        retryOnPrimaryException55.setShard(shardId86);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException88 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId51, "", (java.lang.Throwable) retryOnPrimaryException55);
        org.elasticsearch.index.shard.ShardId shardId89 = retryOnPrimaryException88.getShardId();
        retryOnPrimaryException88.setShard("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", (int) (short) 1);
        retryOnPrimaryException28.addSuppressed((java.lang.Throwable) retryOnPrimaryException88);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder94 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params95 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder96 = retryOnPrimaryException88.toXContent(xContentBuilder94, params95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str35, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(index47);
        org.junit.Assert.assertTrue("'" + restStatus48 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus48.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(throwable50);
        org.junit.Assert.assertEquals(throwable50.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable50.getMessage(), "");
        org.junit.Assert.assertEquals(throwable50.toString(), "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(strList75);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + restStatus85 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus85.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(shardId89);
        org.junit.Assert.assertNotNull(params95);
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8610");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", throwable8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        retryOnPrimaryException9.setShard(shardId11);
        java.lang.String str13 = retryOnPrimaryException9.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException15);
        boolean boolean17 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException16);
        java.lang.String str18 = retryOnPrimaryException16.toString();
        retryOnPrimaryException16.setShard("[[[] RetryOnPrimaryException[]][[[] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]][[[[] RetryOnPrimaryException[]][[[] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[]][100]] RetryOnPrimaryException[hi!]", (int) ' ');
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str13, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RetryOnPrimaryException[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];" + "'", str18, "RetryOnPrimaryException[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]]; nested: RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];");
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8611");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        boolean boolean37 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        retryOnPrimaryException3.addHeader("rest.exception.cause.skip", strArray39);
        java.lang.String str41 = retryOnPrimaryException3.toString();
        java.lang.String str42 = retryOnPrimaryException3.getDetailedMessage();
        java.util.Set<java.lang.String> strSet43 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.Index index44 = retryOnPrimaryException3.getIndex();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str41, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str42, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(index44);
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8612");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray45 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus46 = retryOnPrimaryException3.status();
        boolean boolean47 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str48 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList49 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray50 = retryOnPrimaryException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray45);
        org.junit.Assert.assertTrue("'" + restStatus46 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus46.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "retry_on_primary_exception" + "'", str48, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8613");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        boolean boolean6 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.util.Set<java.lang.String> strSet7 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.String str8 = retryOnPrimaryException3.getResourceType();
        java.lang.Throwable throwable9 = retryOnPrimaryException3.unwrapCause();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8614");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[]");
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId34 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId35 = retryOnPrimaryException5.getShardId();
        java.lang.String str36 = retryOnPrimaryException5.getDetailedMessage();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException5);
        boolean boolean38 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.String str39 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "[RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shardId34);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str36, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "retry_on_primary_exception" + "'", str39, "retry_on_primary_exception");
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8615");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        retryOnPrimaryException5.setShard(shardId7);
        java.lang.String str9 = retryOnPrimaryException5.toString();
        org.elasticsearch.rest.RestStatus restStatus10 = retryOnPrimaryException5.status();
        java.lang.Throwable throwable11 = retryOnPrimaryException5.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        retryOnPrimaryException5.setShard(shardId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!", throwable17);
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException18.getHeaderKeys();
        java.lang.Throwable throwable20 = retryOnPrimaryException18.unwrapCause();
        org.elasticsearch.rest.RestStatus restStatus21 = retryOnPrimaryException18.status();
        java.lang.String str22 = retryOnPrimaryException18.toString();
        org.elasticsearch.index.shard.ShardId shardId23 = retryOnPrimaryException18.getShardId();
        retryOnPrimaryException18.setIndex("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        org.elasticsearch.index.Index index29 = null;
        retryOnPrimaryException28.setIndex(index29);
        java.lang.Throwable[] throwableArray31 = retryOnPrimaryException28.getSuppressed();
        java.util.Set<java.lang.String> strSet32 = retryOnPrimaryException28.getHeaderKeys();
        java.util.List<java.lang.String> strList34 = retryOnPrimaryException28.getHeader("hi!");
        java.lang.Throwable throwable35 = retryOnPrimaryException28.getRootCause();
        retryOnPrimaryException18.addSuppressed(throwable35);
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException18);
        boolean boolean38 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.Throwable throwable39 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException41 = org.elasticsearch.ElasticsearchException.writeStackTraces((java.lang.RuntimeException) retryOnPrimaryException5, streamOutput40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus10 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus10.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(throwable20);
        org.junit.Assert.assertEquals(throwable20.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable20.toString(), "[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus21 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus21.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str22, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId23);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "");
        org.junit.Assert.assertEquals(throwable35.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(throwable39);
        org.junit.Assert.assertEquals(throwable39.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable39.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable39.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8616");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException3.setIndex(index6);
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        java.lang.Throwable throwable9 = retryOnPrimaryException3.getRootCause();
        java.lang.String str10 = retryOnPrimaryException3.getDetailedMessage();
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str10, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8617");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.index.Index index8 = null;
        retryOnPrimaryException3.setIndex(index8);
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.Index index11 = null;
        retryOnPrimaryException3.setIndex(index11);
        org.elasticsearch.index.shard.ShardId shardId13 = retryOnPrimaryException3.getShardId();
        java.lang.Throwable throwable14 = retryOnPrimaryException3.getRootCause();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8618");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException3.setIndex(index6);
        java.lang.String str8 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        java.lang.String str14 = retryOnPrimaryException12.toString();
        org.elasticsearch.index.shard.ShardId shardId15 = retryOnPrimaryException12.getShardId();
        java.util.List<java.lang.String> strList16 = retryOnPrimaryException12.getResourceId();
        org.elasticsearch.index.Index index17 = null;
        retryOnPrimaryException12.setIndex(index17);
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException12.getHeaderKeys();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        java.lang.String str21 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.index.shard.ShardId shardId22 = retryOnPrimaryException12.getShardId();
        boolean boolean23 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder24 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = retryOnPrimaryException12.toXContent(xContentBuilder24, params25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str8, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str14, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "retry_on_primary_exception" + "'", str21, "retry_on_primary_exception");
        org.junit.Assert.assertNull(shardId22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8619");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        java.lang.String[] strArray32 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException4.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray32);
        org.elasticsearch.rest.RestStatus restStatus34 = retryOnPrimaryException4.status();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        retryOnPrimaryException4.setShard(shardId35);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable throwable38 = retryOnPrimaryException37.unwrapCause();
        java.util.Set<java.lang.String> strSet39 = retryOnPrimaryException37.getHeaderKeys();
        retryOnPrimaryException37.setIndex("[][[][100]] RetryOnPrimaryException[hi!]");
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "");
        org.elasticsearch.index.Index index45 = null;
        retryOnPrimaryException44.setIndex(index45);
        java.lang.Throwable[] throwableArray47 = retryOnPrimaryException44.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId49, "");
        java.util.Set<java.lang.String> strSet52 = retryOnPrimaryException51.getHeaderKeys();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        retryOnPrimaryException51.addHeader("", (java.util.List<java.lang.String>) strList56);
        retryOnPrimaryException44.addHeader("", (java.util.List<java.lang.String>) strList56);
        java.util.List<java.lang.String> strList60 = retryOnPrimaryException44.getResourceId();
        java.util.Set<java.lang.String> strSet61 = retryOnPrimaryException44.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId62 = null;
        retryOnPrimaryException44.setShard(shardId62);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        retryOnPrimaryException44.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray65);
        retryOnPrimaryException44.setShard("[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (int) ' ');
        retryOnPrimaryException44.setShard("RetryOnPrimaryException[]", (-1));
        java.lang.String str73 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException44);
        org.elasticsearch.index.Index index74 = null;
        retryOnPrimaryException44.setIndex(index74);
        java.lang.String str76 = retryOnPrimaryException44.getDetailedMessage();
        retryOnPrimaryException44.setIndex("[rest.exception.stacktrace.skip][[rest.exception.stacktrace.skip][-1]] RetryOnPrimaryException[hi!]");
        java.lang.Throwable throwable79 = retryOnPrimaryException44.unwrapCause();
        retryOnPrimaryException37.addSuppressed(throwable79);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + restStatus34 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus34.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable38);
        org.junit.Assert.assertEquals(throwable38.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable38.getMessage(), "");
        org.junit.Assert.assertEquals(throwable38.toString(), "[[][[][100]] RetryOnPrimaryException[hi!]] RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(strList60);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "retry_on_primary_exception" + "'", str73, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str76, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable79);
        org.junit.Assert.assertEquals(throwable79.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable79.getMessage(), "");
        org.junit.Assert.assertEquals(throwable79.toString(), "[[rest.exception.stacktrace.skip][[rest.exception.stacktrace.skip][-1]] RetryOnPrimaryException[hi!]][[[rest.exception.stacktrace.skip][[rest.exception.stacktrace.skip][-1]] RetryOnPrimaryException[hi!]][-1]] RetryOnPrimaryException[]");
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8620");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        java.lang.Throwable throwable6 = retryOnPrimaryException3.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        java.lang.Throwable throwable10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "hi!", throwable10);
        java.lang.Throwable throwable12 = retryOnPrimaryException11.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        org.elasticsearch.index.Index index17 = null;
        retryOnPrimaryException16.setIndex(index17);
        java.lang.Throwable[] throwableArray19 = retryOnPrimaryException16.getSuppressed();
        org.elasticsearch.index.Index index20 = retryOnPrimaryException16.getIndex();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException16.addHeader("hi!", strArray26);
        retryOnPrimaryException11.setResources("rest.exception.stacktrace.skip", strArray26);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "");
        org.elasticsearch.index.Index index33 = null;
        retryOnPrimaryException32.setIndex(index33);
        java.lang.Throwable[] throwableArray35 = retryOnPrimaryException32.getSuppressed();
        org.elasticsearch.index.Index index36 = retryOnPrimaryException32.getIndex();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException32.addHeader("hi!", strArray42);
        retryOnPrimaryException11.addHeader("hi!", strArray42);
        boolean boolean45 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException11);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        retryOnPrimaryException11.addHeader("rest.exception.cause.skip", strArray47);
        retryOnPrimaryException3.addHeader("rest.exception.cause.skip", strArray47);
        org.elasticsearch.index.shard.ShardId shardId50 = retryOnPrimaryException3.getShardId();
        org.elasticsearch.index.shard.ShardId shardId51 = retryOnPrimaryException3.getShardId();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable12.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNull(index20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNull(shardId50);
        org.junit.Assert.assertNull(shardId51);
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8621");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException3.setShard(shardId6);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException12.setResources("hi!", strArray43);
        retryOnPrimaryException3.setResources("retry_on_primary_exception", strArray43);
        org.elasticsearch.rest.RestStatus restStatus47 = retryOnPrimaryException3.status();
        java.lang.String str48 = retryOnPrimaryException3.getDetailedMessage();
        java.lang.String str49 = retryOnPrimaryException3.getDetailedMessage();
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException3.setIndex(index50);
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]");
        java.lang.String str54 = retryOnPrimaryException3.getDetailedMessage();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + restStatus47 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus47.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str48, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str49, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str54, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8622");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException3.getHeaderKeys();
        boolean boolean7 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = retryOnPrimaryException3.guessRootCauses();
        java.lang.Throwable throwable9 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str10 = retryOnPrimaryException3.getDetailedMessage();
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException3.getHeaderKeys();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str10, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8623");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        java.lang.String str6 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = retryOnPrimaryException2.guessRootCauses();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        retryOnPrimaryException2.setShard("retry_on_primary_exception", 100);
        java.lang.Throwable throwable12 = retryOnPrimaryException2.getRootCause();
        java.lang.String str13 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Exception exception15 = org.elasticsearch.ElasticsearchException.readStackTrace((java.lang.Exception) retryOnPrimaryException2, streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "retry_on_primary_exception" + "'", str4, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "");
        org.junit.Assert.assertEquals(throwable12.toString(), "[retry_on_primary_exception][[retry_on_primary_exception][100]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8624");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.Index index7 = retryOnPrimaryException5.getIndex();
        java.lang.String str8 = retryOnPrimaryException5.getResourceType();
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException5.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException5);
        retryOnPrimaryException10.setIndex("hi!");
        java.lang.String str13 = retryOnPrimaryException10.getDetailedMessage();
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException10.setIndex(index14);
        retryOnPrimaryException10.setIndex("RetryOnPrimaryException[hi!]");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException10.setIndex(index18);
        java.lang.String str20 = retryOnPrimaryException10.getDetailedMessage();
        java.lang.Class<?> wildcardClass21 = retryOnPrimaryException10.getClass();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str13, "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[RetryOnPrimaryException[hi!]] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str20, "[RetryOnPrimaryException[hi!]] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8625");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.lang.String str7 = retryOnPrimaryException3.toString();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        java.util.List<java.lang.String> strList9 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId10 = retryOnPrimaryException3.getShardId();
        java.lang.String str11 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        java.util.Set<java.lang.String> strSet16 = retryOnPrimaryException15.getHeaderKeys();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException15.addHeader("", (java.util.List<java.lang.String>) strList20);
        retryOnPrimaryException15.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        java.util.Set<java.lang.String> strSet28 = retryOnPrimaryException27.getHeaderKeys();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        retryOnPrimaryException27.addHeader("", (java.util.List<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList35 = retryOnPrimaryException27.getResourceId();
        retryOnPrimaryException15.addSuppressed((java.lang.Throwable) retryOnPrimaryException27);
        java.lang.String[] strArray43 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException15.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray43);
        java.lang.Throwable[] throwableArray45 = retryOnPrimaryException15.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException48 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId46, "");
        org.elasticsearch.index.Index index49 = retryOnPrimaryException48.getIndex();
        retryOnPrimaryException15.addSuppressed((java.lang.Throwable) retryOnPrimaryException48);
        java.util.List<java.lang.String> strList52 = retryOnPrimaryException15.getHeader("[] RetryOnPrimaryException[]");
        retryOnPrimaryException15.setIndex("[] RetryOnPrimaryException[]");
        org.elasticsearch.index.shard.ShardId shardId55 = retryOnPrimaryException15.getShardId();
        java.util.List<java.lang.String> strList56 = retryOnPrimaryException15.getResourceId();
        retryOnPrimaryException3.addHeader("", strList56);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str7, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNull(index49);
        org.junit.Assert.assertNull(strList52);
        org.junit.Assert.assertNull(shardId55);
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8626");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException7.setShard(shardId9);
        java.lang.String str11 = retryOnPrimaryException7.toString();
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException7.status();
        java.lang.Throwable throwable13 = retryOnPrimaryException7.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.Index index15 = null;
        retryOnPrimaryException7.setIndex(index15);
        org.elasticsearch.rest.RestStatus restStatus17 = retryOnPrimaryException7.status();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray19 = retryOnPrimaryException7.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus20 = retryOnPrimaryException7.status();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException7.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus17 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus17.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray19);
        org.junit.Assert.assertTrue("'" + restStatus20 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus20.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8627");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.rest.RestStatus restStatus6 = retryOnPrimaryException3.status();
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException3.getSuppressed();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus6 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus6.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8628");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.lang.Throwable throwable3 = retryOnPrimaryException2.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.lang.Throwable throwable8 = retryOnPrimaryException7.unwrapCause();
        java.lang.String str9 = retryOnPrimaryException7.toString();
        org.elasticsearch.index.shard.ShardId shardId10 = retryOnPrimaryException7.getShardId();
        java.util.List<java.lang.String> strList11 = retryOnPrimaryException7.getResourceId();
        java.lang.Throwable[] throwableArray12 = retryOnPrimaryException7.getSuppressed();
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException7.getHeaderKeys();
        java.lang.Throwable throwable14 = retryOnPrimaryException7.unwrapCause();
        retryOnPrimaryException2.addSuppressed(throwable14);
        java.lang.String str16 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException2.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable3);
        org.junit.Assert.assertEquals(throwable3.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable3.getMessage(), "");
        org.junit.Assert.assertEquals(throwable3.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str9, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "retry_on_primary_exception" + "'", str16, "retry_on_primary_exception");
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8629");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        java.lang.String str6 = retryOnPrimaryException3.getResourceType();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = retryOnPrimaryException3.guessRootCauses();
        java.lang.String str9 = retryOnPrimaryException3.getResourceType();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        java.util.Set<java.lang.String> strSet14 = retryOnPrimaryException13.getHeaderKeys();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        retryOnPrimaryException13.addHeader("", (java.util.List<java.lang.String>) strList18);
        retryOnPrimaryException13.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId23, "");
        java.util.Set<java.lang.String> strSet26 = retryOnPrimaryException25.getHeaderKeys();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        retryOnPrimaryException25.addHeader("", (java.util.List<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException25.getResourceId();
        retryOnPrimaryException13.addSuppressed((java.lang.Throwable) retryOnPrimaryException25);
        java.lang.String[] strArray41 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException13.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray41);
        boolean boolean43 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException47 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId45, "");
        java.util.Set<java.lang.String> strSet48 = retryOnPrimaryException47.getHeaderKeys();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        retryOnPrimaryException47.addHeader("", (java.util.List<java.lang.String>) strList52);
        java.util.List<java.lang.String> strList55 = retryOnPrimaryException47.getResourceId();
        java.util.Set<java.lang.String> strSet56 = retryOnPrimaryException47.getHeaderKeys();
        java.util.List<java.lang.String> strList57 = retryOnPrimaryException47.getResourceId();
        org.elasticsearch.index.Index index58 = null;
        retryOnPrimaryException47.setIndex(index58);
        org.elasticsearch.index.shard.ShardId shardId61 = null;
        java.lang.Throwable throwable63 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId61, "hi!", throwable63);
        java.lang.Throwable throwable65 = retryOnPrimaryException64.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId67 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException69 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId67, "");
        org.elasticsearch.index.Index index70 = null;
        retryOnPrimaryException69.setIndex(index70);
        java.lang.Throwable[] throwableArray72 = retryOnPrimaryException69.getSuppressed();
        org.elasticsearch.index.Index index73 = retryOnPrimaryException69.getIndex();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException69.addHeader("hi!", strArray79);
        retryOnPrimaryException64.setResources("rest.exception.stacktrace.skip", strArray79);
        retryOnPrimaryException47.addHeader("rest.exception.cause.skip", strArray79);
        retryOnPrimaryException13.setResources("RetryOnPrimaryException[hi!]", strArray79);
        retryOnPrimaryException3.addHeader("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray79);
        boolean boolean85 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList86 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.rest.RestStatus restStatus87 = retryOnPrimaryException3.status();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder88 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params89 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder90 = retryOnPrimaryException3.toXContent(xContentBuilder88, params89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(strList55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNull(strList57);
        org.junit.Assert.assertNotNull(throwable65);
        org.junit.Assert.assertEquals(throwable65.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable65.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable65.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNull(index73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(strList86);
        org.junit.Assert.assertTrue("'" + restStatus87 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus87.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(params89);
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8630");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        retryOnPrimaryException2.setShard(shardId18);
        boolean boolean20 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        boolean boolean21 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        java.lang.Throwable throwable24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "hi!", throwable24);
        java.lang.Throwable throwable26 = retryOnPrimaryException25.unwrapCause();
        org.elasticsearch.index.Index index27 = retryOnPrimaryException25.getIndex();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        retryOnPrimaryException25.setShard(shardId28);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "hi!", throwable33);
        java.lang.Throwable throwable35 = retryOnPrimaryException34.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        org.elasticsearch.index.Index index40 = null;
        retryOnPrimaryException39.setIndex(index40);
        java.lang.Throwable[] throwableArray42 = retryOnPrimaryException39.getSuppressed();
        org.elasticsearch.index.Index index43 = retryOnPrimaryException39.getIndex();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException39.addHeader("hi!", strArray49);
        retryOnPrimaryException34.setResources("rest.exception.stacktrace.skip", strArray49);
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        org.elasticsearch.index.Index index56 = null;
        retryOnPrimaryException55.setIndex(index56);
        java.lang.Throwable[] throwableArray58 = retryOnPrimaryException55.getSuppressed();
        org.elasticsearch.index.Index index59 = retryOnPrimaryException55.getIndex();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException55.addHeader("hi!", strArray65);
        retryOnPrimaryException34.setResources("hi!", strArray65);
        retryOnPrimaryException25.setResources("retry_on_primary_exception", strArray65);
        org.elasticsearch.rest.RestStatus restStatus69 = retryOnPrimaryException25.status();
        java.lang.String str70 = retryOnPrimaryException25.getDetailedMessage();
        java.lang.String str71 = retryOnPrimaryException25.getDetailedMessage();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException25);
        retryOnPrimaryException25.setIndex("[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][10]] RetryOnPrimaryException[hi!]");
        retryOnPrimaryException25.setShard("[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[]", (int) '4');
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.toString(), "[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[]][[[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]] RetryOnPrimaryException[]][52]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index27);
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNull(index43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNull(index59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + restStatus69 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus69.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str70, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str71, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8631");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[]");
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId34 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId35 = retryOnPrimaryException5.getShardId();
        java.lang.String str36 = retryOnPrimaryException5.getDetailedMessage();
        retryOnPrimaryException5.setShard("rest.exception.stacktrace.skip", (-1));
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray40 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException5);
        java.lang.String str41 = retryOnPrimaryException5.getDetailedMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "[rest.exception.stacktrace.skip][[rest.exception.stacktrace.skip][-1]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shardId34);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str36, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str41, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8632");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.lang.String str7 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable[] throwableArray16 = retryOnPrimaryException13.getSuppressed();
        org.elasticsearch.index.Index index17 = retryOnPrimaryException13.getIndex();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException13.addHeader("hi!", strArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        retryOnPrimaryException13.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList29);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        retryOnPrimaryException13.setShard(shardId32);
        java.util.List<java.lang.String> strList34 = retryOnPrimaryException13.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "", (java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId43, "");
        org.elasticsearch.index.Index index46 = null;
        retryOnPrimaryException45.setIndex(index46);
        java.lang.Throwable[] throwableArray48 = retryOnPrimaryException45.getSuppressed();
        org.elasticsearch.index.Index index49 = retryOnPrimaryException45.getIndex();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException45.addHeader("hi!", strArray55);
        retryOnPrimaryException40.setResources("rest.exception.stacktrace.skip", strArray55);
        retryOnPrimaryException35.setResources("RetryOnPrimaryException[]", strArray55);
        retryOnPrimaryException3.setResources("hi!", strArray55);
        org.elasticsearch.index.shard.ShardId shardId60 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException62 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId60, "");
        org.elasticsearch.index.Index index63 = null;
        retryOnPrimaryException62.setIndex(index63);
        java.lang.Throwable[] throwableArray65 = retryOnPrimaryException62.getSuppressed();
        org.elasticsearch.index.Index index66 = retryOnPrimaryException62.getIndex();
        org.elasticsearch.index.shard.ShardId shardId67 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException69 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId67, "");
        java.util.Set<java.lang.String> strSet70 = retryOnPrimaryException69.getHeaderKeys();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        retryOnPrimaryException69.addHeader("", (java.util.List<java.lang.String>) strList74);
        java.util.List<java.lang.String> strList77 = retryOnPrimaryException69.getResourceId();
        java.util.Set<java.lang.String> strSet78 = retryOnPrimaryException69.getHeaderKeys();
        java.util.List<java.lang.String> strList79 = retryOnPrimaryException69.getResourceId();
        retryOnPrimaryException62.addSuppressed((java.lang.Throwable) retryOnPrimaryException69);
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException62);
        boolean boolean82 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException62);
        java.util.List<java.lang.String> strList83 = retryOnPrimaryException62.getResourceId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str7, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strList34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNull(index49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNull(index66);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(strList77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNull(strList79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(strList83);
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8633");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException9.getResourceId();
        java.util.Set<java.lang.String> strSet18 = retryOnPrimaryException9.getHeaderKeys();
        java.util.List<java.lang.String> strList19 = retryOnPrimaryException9.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.index.Index index21 = null;
        retryOnPrimaryException2.setIndex(index21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException2.getHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.rest.RestStatus restStatus25 = retryOnPrimaryException2.status();
        org.elasticsearch.rest.RestStatus restStatus26 = retryOnPrimaryException2.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray27 = retryOnPrimaryException2.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId29, "");
        java.util.Set<java.lang.String> strSet32 = retryOnPrimaryException31.getHeaderKeys();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        retryOnPrimaryException31.addHeader("", (java.util.List<java.lang.String>) strList36);
        retryOnPrimaryException31.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        java.util.Set<java.lang.String> strSet44 = retryOnPrimaryException43.getHeaderKeys();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        retryOnPrimaryException43.addHeader("", (java.util.List<java.lang.String>) strList48);
        java.util.List<java.lang.String> strList51 = retryOnPrimaryException43.getResourceId();
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException43);
        java.lang.String[] strArray59 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException31.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        java.lang.Throwable[] throwableArray61 = retryOnPrimaryException31.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId62 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId62, "");
        org.elasticsearch.index.Index index65 = retryOnPrimaryException64.getIndex();
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException64);
        java.util.List<java.lang.String> strList68 = retryOnPrimaryException31.getHeader("[] RetryOnPrimaryException[]");
        retryOnPrimaryException31.setIndex("[] RetryOnPrimaryException[]");
        org.elasticsearch.index.shard.ShardId shardId71 = retryOnPrimaryException31.getShardId();
        java.util.List<java.lang.String> strList72 = retryOnPrimaryException31.getResourceId();
        retryOnPrimaryException2.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strList72);
        boolean boolean74 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str75 = retryOnPrimaryException2.getDetailedMessage();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertTrue("'" + restStatus25 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus25.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + restStatus26 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus26.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray27);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(strList51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNull(index65);
        org.junit.Assert.assertNull(strList68);
        org.junit.Assert.assertNull(shardId71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str75, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8634");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray45 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus46 = retryOnPrimaryException3.status();
        java.lang.String str47 = retryOnPrimaryException3.toString();
        boolean boolean48 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray45);
        org.junit.Assert.assertTrue("'" + restStatus46 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus46.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str47, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8635");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException7.setShard(shardId9);
        java.lang.String str11 = retryOnPrimaryException7.toString();
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException7.status();
        java.lang.Throwable throwable13 = retryOnPrimaryException7.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", throwable13);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException14);
        java.util.List<java.lang.String> strList16 = retryOnPrimaryException14.getResourceId();
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList16);
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8636");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException9.getResourceId();
        java.util.Set<java.lang.String> strSet18 = retryOnPrimaryException9.getHeaderKeys();
        java.util.List<java.lang.String> strList19 = retryOnPrimaryException9.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException9);
        retryOnPrimaryException2.setShard("RetryOnPrimaryException[hi!]", (-1));
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        retryOnPrimaryException2.setShard(shardId24);
        java.util.Set<java.lang.String> strSet26 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId27, "");
        org.elasticsearch.index.Index index30 = null;
        retryOnPrimaryException29.setIndex(index30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException29.getSuppressed();
        java.util.Set<java.lang.String> strSet33 = retryOnPrimaryException29.getHeaderKeys();
        retryOnPrimaryException29.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.Index index37 = null;
        retryOnPrimaryException29.setIndex(index37);
        org.elasticsearch.rest.RestStatus restStatus39 = retryOnPrimaryException29.status();
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        retryOnPrimaryException29.setShard(shardId40);
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.index.shard.ShardId shardId44 = null;
        java.lang.Throwable throwable46 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException47 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId44, "hi!", throwable46);
        java.lang.Throwable throwable48 = retryOnPrimaryException47.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId50 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException52 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId50, "");
        org.elasticsearch.index.Index index53 = null;
        retryOnPrimaryException52.setIndex(index53);
        java.lang.Throwable[] throwableArray55 = retryOnPrimaryException52.getSuppressed();
        org.elasticsearch.index.Index index56 = retryOnPrimaryException52.getIndex();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException52.addHeader("hi!", strArray62);
        retryOnPrimaryException47.setResources("rest.exception.stacktrace.skip", strArray62);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException65 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException47);
        java.lang.Throwable[] throwableArray66 = retryOnPrimaryException65.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId68 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException70 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId68, "");
        java.util.Set<java.lang.String> strSet71 = retryOnPrimaryException70.getHeaderKeys();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        retryOnPrimaryException70.addHeader("", (java.util.List<java.lang.String>) strList75);
        retryOnPrimaryException65.addHeader("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.util.List<java.lang.String>) strList75);
        java.lang.String str79 = retryOnPrimaryException65.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray80 = retryOnPrimaryException65.guessRootCauses();
        java.lang.Throwable throwable81 = retryOnPrimaryException65.getRootCause();
        retryOnPrimaryException29.addSuppressed((java.lang.Throwable) retryOnPrimaryException65);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException65);
        java.lang.Class<?> wildcardClass84 = retryOnPrimaryException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + restStatus39 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus39.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable48);
        org.junit.Assert.assertEquals(throwable48.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable48.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNull(index56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];" + "'", str79, "RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray80);
        org.junit.Assert.assertNotNull(throwable81);
        org.junit.Assert.assertEquals(throwable81.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable81.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable81.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8637");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        java.lang.Throwable throwable7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "hi!", throwable7);
        java.lang.Throwable throwable9 = retryOnPrimaryException8.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable[] throwableArray16 = retryOnPrimaryException13.getSuppressed();
        org.elasticsearch.index.Index index17 = retryOnPrimaryException13.getIndex();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException13.addHeader("hi!", strArray23);
        retryOnPrimaryException8.setResources("rest.exception.stacktrace.skip", strArray23);
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray23);
        java.util.List<java.lang.String> strList28 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[hi!]");
        java.lang.String str29 = retryOnPrimaryException2.getDetailedMessage();
        org.elasticsearch.index.Index index30 = null;
        retryOnPrimaryException2.setIndex(index30);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray32 = retryOnPrimaryException2.guessRootCauses();
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet34 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str35 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNull(index17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str29, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "retry_on_primary_exception" + "'", str35, "retry_on_primary_exception");
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8638");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.util.Set<java.lang.String> strSet24 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String str25 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.Throwable[] throwableArray26 = retryOnPrimaryException14.getSuppressed();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params28 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder29 = retryOnPrimaryException14.toXContent(xContentBuilder27, params28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "retry_on_primary_exception" + "'", str25, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(params28);
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8639");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String str4 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        java.lang.String str6 = retryOnPrimaryException2.getResourceType();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = retryOnPrimaryException2.guessRootCauses();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray8 = retryOnPrimaryException2.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        org.elasticsearch.index.Index index12 = null;
        retryOnPrimaryException11.setIndex(index12);
        java.lang.Throwable[] throwableArray14 = retryOnPrimaryException11.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException18.getHeaderKeys();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        retryOnPrimaryException18.addHeader("", (java.util.List<java.lang.String>) strList23);
        retryOnPrimaryException11.addHeader("", (java.util.List<java.lang.String>) strList23);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        retryOnPrimaryException11.setShard(shardId27);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException11);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException32 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "");
        java.util.Set<java.lang.String> strSet33 = retryOnPrimaryException32.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        java.lang.Throwable throwable37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "hi!", throwable37);
        java.lang.Throwable throwable39 = retryOnPrimaryException38.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        org.elasticsearch.index.Index index44 = null;
        retryOnPrimaryException43.setIndex(index44);
        java.lang.Throwable[] throwableArray46 = retryOnPrimaryException43.getSuppressed();
        org.elasticsearch.index.Index index47 = retryOnPrimaryException43.getIndex();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException43.addHeader("hi!", strArray53);
        retryOnPrimaryException38.setResources("rest.exception.stacktrace.skip", strArray53);
        retryOnPrimaryException32.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray53);
        java.util.List<java.lang.String> strList57 = retryOnPrimaryException32.getResourceId();
        org.elasticsearch.rest.RestStatus restStatus58 = retryOnPrimaryException32.status();
        boolean boolean59 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException32);
        boolean boolean60 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException32);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException32);
        java.lang.String str62 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("[RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "retry_on_primary_exception" + "'", str4, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(throwable39);
        org.junit.Assert.assertEquals(throwable39.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable39.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable39.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNull(index47);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + restStatus58 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus58.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str62, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8640");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.Index index7 = retryOnPrimaryException5.getIndex();
        java.lang.String str8 = retryOnPrimaryException5.getResourceType();
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException5.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException5);
        retryOnPrimaryException10.setIndex("hi!");
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException10);
        java.lang.String str14 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException10);
        java.lang.String str15 = retryOnPrimaryException10.toString();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", throwable21);
        java.util.Set<java.lang.String> strSet23 = retryOnPrimaryException22.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        retryOnPrimaryException22.setShard(shardId24);
        java.lang.String str26 = retryOnPrimaryException22.toString();
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException22.status();
        java.lang.Throwable throwable28 = retryOnPrimaryException22.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException29 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId17, "hi!", (java.lang.Throwable) retryOnPrimaryException22);
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        retryOnPrimaryException22.setShard(shardId30);
        java.util.List<java.lang.String> strList33 = retryOnPrimaryException22.getHeader("RetryOnPrimaryException[hi!]; nested: RetryOnPrimaryException[hi!];");
        java.util.List<java.lang.String> strList35 = retryOnPrimaryException22.getHeader("[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        java.util.Set<java.lang.String> strSet40 = retryOnPrimaryException39.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!", throwable44);
        java.lang.Throwable throwable46 = retryOnPrimaryException45.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "");
        org.elasticsearch.index.Index index51 = null;
        retryOnPrimaryException50.setIndex(index51);
        java.lang.Throwable[] throwableArray53 = retryOnPrimaryException50.getSuppressed();
        org.elasticsearch.index.Index index54 = retryOnPrimaryException50.getIndex();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException50.addHeader("hi!", strArray60);
        retryOnPrimaryException45.setResources("rest.exception.stacktrace.skip", strArray60);
        retryOnPrimaryException39.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray60);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray64 = retryOnPrimaryException39.guessRootCauses();
        org.elasticsearch.index.shard.ShardId shardId66 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException68 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId66, "");
        org.elasticsearch.index.Index index69 = retryOnPrimaryException68.getIndex();
        java.lang.String str70 = retryOnPrimaryException68.getDetailedMessage();
        java.lang.String str71 = retryOnPrimaryException68.toString();
        org.elasticsearch.index.shard.ShardId shardId73 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException75 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId73, "");
        org.elasticsearch.index.Index index76 = null;
        retryOnPrimaryException75.setIndex(index76);
        java.lang.Throwable throwable78 = retryOnPrimaryException75.getRootCause();
        java.util.List<java.lang.String> strList79 = retryOnPrimaryException75.getResourceId();
        java.lang.String[] strArray84 = new java.lang.String[] { "retry_on_primary_exception", "RetryOnPrimaryException[hi!]", "" };
        retryOnPrimaryException75.setResources("", strArray84);
        retryOnPrimaryException68.setResources("", strArray84);
        retryOnPrimaryException39.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: retry_on_primary_exception", strArray84);
        retryOnPrimaryException22.addHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]; nested: RetryOnPrimaryException[];", strArray84);
        retryOnPrimaryException10.addHeader("[RetryOnPrimaryException[]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]", strArray84);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "retry_on_primary_exception" + "'", str14, "retry_on_primary_exception");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];" + "'", str15, "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str26, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList33);
        org.junit.Assert.assertNull(strList35);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(throwable46);
        org.junit.Assert.assertEquals(throwable46.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNull(index54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray64);
        org.junit.Assert.assertNull(index69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str70, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "RetryOnPrimaryException[]" + "'", str71, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable78);
        org.junit.Assert.assertEquals(throwable78.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable78.getMessage(), "");
        org.junit.Assert.assertEquals(throwable78.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList79);
        org.junit.Assert.assertNotNull(strArray84);
    }

    @Test
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8641");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.Index index6 = null;
        retryOnPrimaryException3.setIndex(index6);
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException3.getHeader("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]");
        retryOnPrimaryException3.setShard("[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];][0]] RetryOnPrimaryException[]", (int) (byte) 1);
        retryOnPrimaryException3.setIndex("[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][10]] RetryOnPrimaryException[]");
        boolean boolean16 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][10]] RetryOnPrimaryException[]][[[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]][10]] RetryOnPrimaryException[]][1]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8642");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.index.shard.ShardId shardId6 = retryOnPrimaryException3.getShardId();
        java.util.List<java.lang.String> strList7 = retryOnPrimaryException3.getResourceId();
        java.lang.Throwable[] throwableArray8 = retryOnPrimaryException3.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException3.setShard(shardId9);
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        retryOnPrimaryException17.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList33);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        retryOnPrimaryException17.setShard(shardId36);
        java.util.List<java.lang.String> strList38 = retryOnPrimaryException17.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "", (java.lang.Throwable) retryOnPrimaryException17);
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        java.util.Set<java.lang.String> strSet44 = retryOnPrimaryException43.getHeaderKeys();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        retryOnPrimaryException43.addHeader("", (java.util.List<java.lang.String>) strList48);
        retryOnPrimaryException43.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        java.util.Set<java.lang.String> strSet56 = retryOnPrimaryException55.getHeaderKeys();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        retryOnPrimaryException55.addHeader("", (java.util.List<java.lang.String>) strList60);
        java.util.List<java.lang.String> strList63 = retryOnPrimaryException55.getResourceId();
        retryOnPrimaryException43.addSuppressed((java.lang.Throwable) retryOnPrimaryException55);
        java.lang.String[] strArray71 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException43.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray71);
        retryOnPrimaryException39.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray71);
        retryOnPrimaryException3.setResources("rest.exception.cause.skip", strArray71);
        retryOnPrimaryException3.setIndex("");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray77 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(strList38);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(strList63);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray77);
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8643");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray6 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException3.getHeader("RetryOnPrimaryException[]");
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray10 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        java.util.Set<java.lang.String> strSet11 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        java.lang.Throwable throwable15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", throwable15);
        java.lang.String str17 = retryOnPrimaryException16.toString();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException21 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "");
        org.elasticsearch.index.Index index22 = null;
        retryOnPrimaryException21.setIndex(index22);
        java.lang.Throwable[] throwableArray24 = retryOnPrimaryException21.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "");
        java.util.Set<java.lang.String> strSet29 = retryOnPrimaryException28.getHeaderKeys();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        retryOnPrimaryException28.addHeader("", (java.util.List<java.lang.String>) strList33);
        retryOnPrimaryException21.addHeader("", (java.util.List<java.lang.String>) strList33);
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException21.getResourceId();
        java.util.Set<java.lang.String> strSet38 = retryOnPrimaryException21.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        retryOnPrimaryException21.setShard(shardId39);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        retryOnPrimaryException21.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray42);
        retryOnPrimaryException16.setResources("[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", strArray42);
        retryOnPrimaryException3.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: [hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray42);
        java.util.Set<java.lang.String> strSet46 = retryOnPrimaryException3.getHeaderKeys();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray6);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]" + "'", str17, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8644");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException5.getHeaderKeys();
        java.lang.Throwable throwable7 = retryOnPrimaryException5.unwrapCause();
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException5.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        retryOnPrimaryException5.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException5.setIndex("RetryOnPrimaryException[]");
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.shard.ShardId shardId34 = retryOnPrimaryException5.getShardId();
        org.elasticsearch.index.shard.ShardId shardId35 = retryOnPrimaryException5.getShardId();
        java.lang.String str36 = retryOnPrimaryException5.getDetailedMessage();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", (java.lang.Throwable) retryOnPrimaryException5);
        retryOnPrimaryException5.setShard("[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][-1]] RetryOnPrimaryException[]", (int) '4');
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable7.toString(), "[[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][-1]] RetryOnPrimaryException[]][[[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][-1]] RetryOnPrimaryException[]][52]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shardId34);
        org.junit.Assert.assertNull(shardId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str36, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8645");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        java.util.Set<java.lang.String> strSet5 = retryOnPrimaryException4.getHeaderKeys();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList9);
        retryOnPrimaryException4.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        retryOnPrimaryException16.addHeader("", (java.util.List<java.lang.String>) strList21);
        java.util.List<java.lang.String> strList24 = retryOnPrimaryException16.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException16);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray26 = retryOnPrimaryException4.guessRootCauses();
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException4.getSuppressed();
        java.lang.String str28 = retryOnPrimaryException4.getDetailedMessage();
        java.util.Set<java.lang.String> strSet29 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId30 = retryOnPrimaryException4.getShardId();
        java.lang.String str31 = retryOnPrimaryException4.getResourceType();
        boolean boolean32 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str28, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(shardId30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8646");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.Index index7 = retryOnPrimaryException5.getIndex();
        java.lang.String str8 = retryOnPrimaryException5.getResourceType();
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException5.getSuppressed();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException5);
        retryOnPrimaryException10.setIndex("hi!");
        java.lang.String str13 = retryOnPrimaryException10.getDetailedMessage();
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException10.setIndex(index14);
        retryOnPrimaryException10.setIndex("RetryOnPrimaryException[hi!]");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException10.setIndex(index18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        java.lang.Throwable throwable24 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "hi!", throwable24);
        java.lang.Throwable throwable26 = retryOnPrimaryException25.unwrapCause();
        org.elasticsearch.index.Index index27 = retryOnPrimaryException25.getIndex();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        retryOnPrimaryException25.setShard(shardId28);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        java.lang.Throwable throwable33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "hi!", throwable33);
        java.lang.Throwable throwable35 = retryOnPrimaryException34.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        org.elasticsearch.index.Index index40 = null;
        retryOnPrimaryException39.setIndex(index40);
        java.lang.Throwable[] throwableArray42 = retryOnPrimaryException39.getSuppressed();
        org.elasticsearch.index.Index index43 = retryOnPrimaryException39.getIndex();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException39.addHeader("hi!", strArray49);
        retryOnPrimaryException34.setResources("rest.exception.stacktrace.skip", strArray49);
        org.elasticsearch.index.shard.ShardId shardId53 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException55 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId53, "");
        org.elasticsearch.index.Index index56 = null;
        retryOnPrimaryException55.setIndex(index56);
        java.lang.Throwable[] throwableArray58 = retryOnPrimaryException55.getSuppressed();
        org.elasticsearch.index.Index index59 = retryOnPrimaryException55.getIndex();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException55.addHeader("hi!", strArray65);
        retryOnPrimaryException34.setResources("hi!", strArray65);
        retryOnPrimaryException25.setResources("retry_on_primary_exception", strArray65);
        retryOnPrimaryException25.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (int) (short) 10);
        java.lang.String str72 = retryOnPrimaryException25.getResourceType();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray73 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException25);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException74 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId20, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException25);
        java.lang.Throwable throwable75 = retryOnPrimaryException74.unwrapCause();
        java.util.List<java.lang.String> strList76 = retryOnPrimaryException74.getResourceId();
        java.lang.Throwable[] throwableArray77 = retryOnPrimaryException74.getSuppressed();
        java.util.Set<java.lang.String> strSet78 = retryOnPrimaryException74.getHeaderKeys();
        retryOnPrimaryException10.addSuppressed((java.lang.Throwable) retryOnPrimaryException74);
        org.elasticsearch.index.Index index80 = null;
        retryOnPrimaryException10.setIndex(index80);
        java.lang.Throwable throwable82 = retryOnPrimaryException10.unwrapCause();
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str13, "[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable26.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index27);
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable35.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNull(index43);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNull(index59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "retry_on_primary_exception" + "'", str72, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray73);
        org.junit.Assert.assertNotNull(throwable75);
        org.junit.Assert.assertEquals(throwable75.getLocalizedMessage(), "rest.exception.stacktrace.skip");
        org.junit.Assert.assertEquals(throwable75.getMessage(), "rest.exception.stacktrace.skip");
        org.junit.Assert.assertEquals(throwable75.toString(), "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNull(strList76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(throwable82);
        org.junit.Assert.assertEquals(throwable82.getLocalizedMessage(), "rest.exception.stacktrace.skip");
        org.junit.Assert.assertEquals(throwable82.getMessage(), "rest.exception.stacktrace.skip");
        org.junit.Assert.assertEquals(throwable82.toString(), "[RetryOnPrimaryException[hi!]] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];");
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8647");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        java.lang.Throwable throwable4 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException5 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", throwable4);
        java.lang.Throwable throwable6 = retryOnPrimaryException5.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId8, "");
        org.elasticsearch.index.Index index11 = null;
        retryOnPrimaryException10.setIndex(index11);
        java.lang.Throwable[] throwableArray13 = retryOnPrimaryException10.getSuppressed();
        org.elasticsearch.index.Index index14 = retryOnPrimaryException10.getIndex();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException10.addHeader("hi!", strArray20);
        retryOnPrimaryException5.setResources("rest.exception.stacktrace.skip", strArray20);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException5);
        org.elasticsearch.index.Index index24 = null;
        retryOnPrimaryException23.setIndex(index24);
        retryOnPrimaryException23.setIndex("[hi!][[hi!][32]] RetryOnPrimaryException[RetryOnPrimaryException[]]");
        java.lang.Throwable throwable28 = retryOnPrimaryException23.getRootCause();
        java.util.List<java.lang.String> strList30 = retryOnPrimaryException23.getHeader("[RetryOnPrimaryException[]][[RetryOnPrimaryException[]][52]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNull(index14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwable28);
        org.junit.Assert.assertEquals(throwable28.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable28.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(strList30);
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8648");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.lang.String str11 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.lang.Throwable throwable14 = retryOnPrimaryException2.getRootCause();
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId16 = retryOnPrimaryException2.getShardId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray17 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str11, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "");
        org.junit.Assert.assertEquals(throwable14.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray17);
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8649");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.Index index6 = retryOnPrimaryException2.getIndex();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.util.Set<java.lang.String> strSet13 = retryOnPrimaryException12.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        retryOnPrimaryException12.setShard(shardId14);
        java.lang.String str16 = retryOnPrimaryException12.toString();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException12);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException12);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray19 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str20 = retryOnPrimaryException2.getResourceType();
        java.lang.Throwable throwable21 = retryOnPrimaryException2.unwrapCause();
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(index6);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str16, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(throwable21);
        org.junit.Assert.assertEquals(throwable21.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable21.getMessage(), "");
        org.junit.Assert.assertEquals(throwable21.toString(), "[RetryOnPrimaryException[[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[hi!];] RetryOnPrimaryException[]");
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8650");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException35 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId33, "");
        org.elasticsearch.index.Index index36 = retryOnPrimaryException35.getIndex();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException35);
        java.util.List<java.lang.String> strList39 = retryOnPrimaryException35.getHeader("rest.exception.stacktrace.skip");
        java.lang.String str40 = retryOnPrimaryException35.toString();
        retryOnPrimaryException35.setIndex("");
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId43, "");
        java.util.Set<java.lang.String> strSet46 = retryOnPrimaryException45.getHeaderKeys();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        retryOnPrimaryException45.addHeader("", (java.util.List<java.lang.String>) strList50);
        java.lang.Throwable throwable53 = retryOnPrimaryException45.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException56 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId54, "");
        java.util.Set<java.lang.String> strSet57 = retryOnPrimaryException56.getHeaderKeys();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        retryOnPrimaryException56.addHeader("", (java.util.List<java.lang.String>) strList61);
        org.elasticsearch.index.shard.ShardId shardId64 = null;
        retryOnPrimaryException56.setShard(shardId64);
        retryOnPrimaryException45.addSuppressed((java.lang.Throwable) retryOnPrimaryException56);
        retryOnPrimaryException35.addSuppressed((java.lang.Throwable) retryOnPrimaryException56);
        retryOnPrimaryException56.setIndex("[RetryOnPrimaryException[hi!]][[RetryOnPrimaryException[hi!]][100]] RetryOnPrimaryException[]");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray70 = retryOnPrimaryException56.guessRootCauses();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNull(index36);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "RetryOnPrimaryException[]" + "'", str40, "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(throwable53);
        org.junit.Assert.assertEquals(throwable53.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable53.getMessage(), "");
        org.junit.Assert.assertEquals(throwable53.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray70);
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8651");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", throwable8);
        java.lang.Throwable throwable10 = retryOnPrimaryException9.unwrapCause();
        org.elasticsearch.index.Index index11 = retryOnPrimaryException9.getIndex();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        retryOnPrimaryException9.setShard(shardId12);
        retryOnPrimaryException9.setShard("retry_on_primary_exception", (int) (short) 100);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", (java.lang.Throwable) retryOnPrimaryException9);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (java.lang.Throwable) retryOnPrimaryException17);
        java.lang.Throwable throwable19 = retryOnPrimaryException18.getRootCause();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.toString(), "[retry_on_primary_exception][[retry_on_primary_exception][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.toString(), "[retry_on_primary_exception][[retry_on_primary_exception][100]] RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8652");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        retryOnPrimaryException3.setShard(shardId5);
        java.lang.String str7 = retryOnPrimaryException3.toString();
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray9 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        retryOnPrimaryException3.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (int) (byte) 100);
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str14 = retryOnPrimaryException3.toString();
        java.lang.Throwable[] throwableArray15 = retryOnPrimaryException3.getSuppressed();
        boolean boolean16 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str7, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]" + "'", str14, "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8653");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray45 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus46 = retryOnPrimaryException3.status();
        boolean boolean47 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.String str48 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList49 = retryOnPrimaryException3.getResourceId();
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException3.setIndex(index50);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput52 = null;
        // The following exception was thrown during execution in test generation
        try {
            retryOnPrimaryException3.writeTo(streamOutput52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray45);
        org.junit.Assert.assertTrue("'" + restStatus46 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus46.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "retry_on_primary_exception" + "'", str48, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8654");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException3.setShard(shardId6);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        java.lang.Throwable throwable11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "hi!", throwable11);
        java.lang.Throwable throwable13 = retryOnPrimaryException12.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        org.elasticsearch.index.Index index21 = retryOnPrimaryException17.getIndex();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException17.addHeader("hi!", strArray27);
        retryOnPrimaryException12.setResources("rest.exception.stacktrace.skip", strArray27);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException12.setResources("hi!", strArray43);
        retryOnPrimaryException3.setResources("retry_on_primary_exception", strArray43);
        org.elasticsearch.rest.RestStatus restStatus47 = retryOnPrimaryException3.status();
        java.lang.String str48 = retryOnPrimaryException3.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId49 = retryOnPrimaryException3.getShardId();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray50 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable[] throwableArray51 = retryOnPrimaryException3.getSuppressed();
        java.util.List<java.lang.String> strList52 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNull(index21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + restStatus47 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus47.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str48, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(shardId49);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray50);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8655");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.lang.Throwable throwable8 = retryOnPrimaryException7.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException12 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId10, "");
        org.elasticsearch.index.Index index13 = null;
        retryOnPrimaryException12.setIndex(index13);
        java.lang.Throwable[] throwableArray15 = retryOnPrimaryException12.getSuppressed();
        org.elasticsearch.index.Index index16 = retryOnPrimaryException12.getIndex();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException12.addHeader("hi!", strArray22);
        retryOnPrimaryException7.setResources("rest.exception.stacktrace.skip", strArray22);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException25 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.index.shard.ShardId shardId26 = retryOnPrimaryException25.getShardId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", (java.lang.Throwable) retryOnPrimaryException25);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.index.shard.ShardId shardId30 = null;
        java.lang.Throwable throwable32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId30, "hi!", throwable32);
        java.lang.Throwable throwable34 = retryOnPrimaryException33.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException38 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId36, "");
        org.elasticsearch.index.Index index39 = null;
        retryOnPrimaryException38.setIndex(index39);
        java.lang.Throwable[] throwableArray41 = retryOnPrimaryException38.getSuppressed();
        org.elasticsearch.index.Index index42 = retryOnPrimaryException38.getIndex();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException38.addHeader("hi!", strArray48);
        retryOnPrimaryException33.setResources("rest.exception.stacktrace.skip", strArray48);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException51 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException33);
        java.lang.Throwable[] throwableArray52 = retryOnPrimaryException51.getSuppressed();
        boolean boolean53 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException51);
        retryOnPrimaryException25.addSuppressed((java.lang.Throwable) retryOnPrimaryException51);
        java.util.List<java.lang.String> strList56 = retryOnPrimaryException51.getHeader("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]");
        retryOnPrimaryException51.setIndex("[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]");
        java.lang.String str59 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException51);
        boolean boolean60 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException51);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(shardId26);
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable34.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNull(index42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(strList56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "retry_on_primary_exception" + "'", str59, "retry_on_primary_exception");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8656");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "");
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        retryOnPrimaryException7.addHeader("", (java.util.List<java.lang.String>) strList12);
        retryOnPrimaryException7.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId17 = retryOnPrimaryException7.getShardId();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", throwable21);
        java.lang.Throwable throwable23 = retryOnPrimaryException22.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.index.Index index28 = null;
        retryOnPrimaryException27.setIndex(index28);
        java.lang.Throwable[] throwableArray30 = retryOnPrimaryException27.getSuppressed();
        org.elasticsearch.index.Index index31 = retryOnPrimaryException27.getIndex();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException27.addHeader("hi!", strArray37);
        retryOnPrimaryException22.setResources("rest.exception.stacktrace.skip", strArray37);
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        org.elasticsearch.index.Index index44 = null;
        retryOnPrimaryException43.setIndex(index44);
        java.lang.Throwable[] throwableArray46 = retryOnPrimaryException43.getSuppressed();
        org.elasticsearch.index.Index index47 = retryOnPrimaryException43.getIndex();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException43.addHeader("hi!", strArray53);
        retryOnPrimaryException22.setResources("hi!", strArray53);
        retryOnPrimaryException7.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray53);
        org.elasticsearch.index.shard.ShardId shardId57 = retryOnPrimaryException7.getShardId();
        java.lang.Throwable throwable58 = retryOnPrimaryException7.getRootCause();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        java.util.Set<java.lang.String> strSet60 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus61 = retryOnPrimaryException4.status();
        java.lang.Throwable[] throwableArray62 = retryOnPrimaryException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.renderThrowable(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertNotNull(throwable23);
        org.junit.Assert.assertEquals(throwable23.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(index31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNull(index47);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNull(shardId57);
        org.junit.Assert.assertNotNull(throwable58);
        org.junit.Assert.assertEquals(throwable58.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable58.getMessage(), "");
        org.junit.Assert.assertEquals(throwable58.toString(), "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + restStatus61 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus61.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray62);
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8657");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        java.util.List<java.lang.String> strList10 = retryOnPrimaryException2.getResourceId();
        java.lang.String str11 = retryOnPrimaryException2.getDetailedMessage();
        retryOnPrimaryException2.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.rest.RestStatus restStatus14 = retryOnPrimaryException2.status();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException17 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "");
        org.elasticsearch.index.Index index18 = null;
        retryOnPrimaryException17.setIndex(index18);
        java.lang.Throwable[] throwableArray20 = retryOnPrimaryException17.getSuppressed();
        java.util.Set<java.lang.String> strSet21 = retryOnPrimaryException17.getHeaderKeys();
        retryOnPrimaryException17.setShard("rest.exception.cause.skip", 0);
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException17.setIndex(index25);
        org.elasticsearch.rest.RestStatus restStatus27 = retryOnPrimaryException17.status();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        retryOnPrimaryException17.setShard(shardId28);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException17);
        java.lang.Throwable throwable31 = retryOnPrimaryException2.getRootCause();
        boolean boolean32 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str11, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertTrue("'" + restStatus14 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus14.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + restStatus27 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus27.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "");
        org.junit.Assert.assertEquals(throwable31.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8658");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        java.lang.Throwable[] throwableArray32 = retryOnPrimaryException2.getSuppressed();
        java.lang.String str33 = retryOnPrimaryException2.getDetailedMessage();
        java.lang.Throwable throwable34 = retryOnPrimaryException2.getRootCause();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder35 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params36 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = retryOnPrimaryException2.toXContent(xContentBuilder35, params36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str33, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "");
        org.junit.Assert.assertEquals(throwable34.toString(), "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(params36);
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8659");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.unwrapCause();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        java.lang.Throwable throwable9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException10 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "hi!", throwable9);
        java.lang.Throwable throwable11 = retryOnPrimaryException10.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId13, "");
        org.elasticsearch.index.Index index16 = null;
        retryOnPrimaryException15.setIndex(index16);
        java.lang.Throwable[] throwableArray18 = retryOnPrimaryException15.getSuppressed();
        org.elasticsearch.index.Index index19 = retryOnPrimaryException15.getIndex();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException15.addHeader("hi!", strArray25);
        retryOnPrimaryException10.setResources("rest.exception.stacktrace.skip", strArray25);
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException10);
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[]");
        boolean boolean31 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException39 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "");
        java.util.Set<java.lang.String> strSet40 = retryOnPrimaryException39.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        java.lang.Throwable throwable44 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException45 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "hi!", throwable44);
        java.lang.Throwable throwable46 = retryOnPrimaryException45.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId48 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException50 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId48, "");
        org.elasticsearch.index.Index index51 = null;
        retryOnPrimaryException50.setIndex(index51);
        java.lang.Throwable[] throwableArray53 = retryOnPrimaryException50.getSuppressed();
        org.elasticsearch.index.Index index54 = retryOnPrimaryException50.getIndex();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException50.addHeader("hi!", strArray60);
        retryOnPrimaryException45.setResources("rest.exception.stacktrace.skip", strArray60);
        retryOnPrimaryException39.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray60);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException64 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException39);
        retryOnPrimaryException34.addSuppressed((java.lang.Throwable) retryOnPrimaryException39);
        java.lang.String str66 = retryOnPrimaryException34.getResourceType();
        java.util.List<java.lang.String> strList67 = retryOnPrimaryException34.getResourceId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        org.elasticsearch.index.shard.ShardId shardId70 = null;
        java.lang.Throwable throwable72 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException73 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId70, "hi!", throwable72);
        java.util.Set<java.lang.String> strSet74 = retryOnPrimaryException73.getHeaderKeys();
        java.lang.Throwable throwable75 = retryOnPrimaryException73.unwrapCause();
        java.lang.Throwable throwable76 = retryOnPrimaryException73.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId78 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException80 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId78, "");
        java.util.Set<java.lang.String> strSet81 = retryOnPrimaryException80.getHeaderKeys();
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        retryOnPrimaryException80.addHeader("", (java.util.List<java.lang.String>) strList85);
        retryOnPrimaryException73.addHeader("RetryOnPrimaryException[hi!]", (java.util.List<java.lang.String>) strList85);
        retryOnPrimaryException3.addHeader("[] RetryOnPrimaryException[]", (java.util.List<java.lang.String>) strList85);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray90 = retryOnPrimaryException3.guessRootCauses();
        java.lang.String str91 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList93 = retryOnPrimaryException3.getHeader("[[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[[hi!] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[]");
        boolean boolean94 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList95 = retryOnPrimaryException3.getResourceId();
        java.lang.String str96 = retryOnPrimaryException3.getResourceType();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "[RetryOnPrimaryException[]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable11.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNull(index19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(throwable46);
        org.junit.Assert.assertEquals(throwable46.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable46.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNull(index54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(strList67);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(throwable75);
        org.junit.Assert.assertEquals(throwable75.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable75.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable75.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable76.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "retry_on_primary_exception" + "'", str91, "retry_on_primary_exception");
        org.junit.Assert.assertNull(strList93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(strList95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8660");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", throwable2);
        java.lang.String str4 = retryOnPrimaryException3.getDetailedMessage();
        java.lang.Throwable throwable5 = retryOnPrimaryException3.getRootCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        java.lang.Throwable throwable8 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "hi!", throwable8);
        java.lang.Throwable throwable10 = retryOnPrimaryException9.unwrapCause();
        java.lang.String str11 = retryOnPrimaryException9.toString();
        org.elasticsearch.index.Index index12 = null;
        retryOnPrimaryException9.setIndex(index12);
        java.lang.String str14 = retryOnPrimaryException9.toString();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        java.lang.Throwable throwable17 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId15, "hi!", throwable17);
        java.lang.Throwable throwable19 = retryOnPrimaryException18.unwrapCause();
        java.lang.String str20 = retryOnPrimaryException18.toString();
        org.elasticsearch.index.shard.ShardId shardId21 = retryOnPrimaryException18.getShardId();
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException18.getResourceId();
        org.elasticsearch.index.Index index23 = null;
        retryOnPrimaryException18.setIndex(index23);
        java.util.Set<java.lang.String> strSet25 = retryOnPrimaryException18.getHeaderKeys();
        retryOnPrimaryException9.addSuppressed((java.lang.Throwable) retryOnPrimaryException18);
        java.util.Set<java.lang.String> strSet27 = retryOnPrimaryException18.getHeaderKeys();
        retryOnPrimaryException18.setShard("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", (int) (byte) 100);
        throwable5.addSuppressed((java.lang.Throwable) retryOnPrimaryException18);
        java.lang.String str32 = retryOnPrimaryException18.getResourceType();
        java.lang.String str33 = retryOnPrimaryException18.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str4, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNotNull(throwable5);
        org.junit.Assert.assertEquals(throwable5.getLocalizedMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals(throwable5.getMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertEquals(throwable5.toString(), "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable10.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str14, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable19.toString(), "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str20, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId21);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][100]] RetryOnPrimaryException[hi!]" + "'", str33, "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]][100]] RetryOnPrimaryException[hi!]");
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8661");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId5, "");
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        retryOnPrimaryException7.addHeader("", (java.util.List<java.lang.String>) strList12);
        retryOnPrimaryException7.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId17 = retryOnPrimaryException7.getShardId();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", throwable21);
        java.lang.Throwable throwable23 = retryOnPrimaryException22.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.index.Index index28 = null;
        retryOnPrimaryException27.setIndex(index28);
        java.lang.Throwable[] throwableArray30 = retryOnPrimaryException27.getSuppressed();
        org.elasticsearch.index.Index index31 = retryOnPrimaryException27.getIndex();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException27.addHeader("hi!", strArray37);
        retryOnPrimaryException22.setResources("rest.exception.stacktrace.skip", strArray37);
        org.elasticsearch.index.shard.ShardId shardId41 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId41, "");
        org.elasticsearch.index.Index index44 = null;
        retryOnPrimaryException43.setIndex(index44);
        java.lang.Throwable[] throwableArray46 = retryOnPrimaryException43.getSuppressed();
        org.elasticsearch.index.Index index47 = retryOnPrimaryException43.getIndex();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException43.addHeader("hi!", strArray53);
        retryOnPrimaryException22.setResources("hi!", strArray53);
        retryOnPrimaryException7.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray53);
        org.elasticsearch.index.shard.ShardId shardId57 = retryOnPrimaryException7.getShardId();
        java.lang.Throwable throwable58 = retryOnPrimaryException7.getRootCause();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException7);
        java.util.Set<java.lang.String> strSet60 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.rest.RestStatus restStatus61 = retryOnPrimaryException4.status();
        java.lang.Throwable[] throwableArray62 = retryOnPrimaryException4.getSuppressed();
        retryOnPrimaryException4.setShard("[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];", 100);
        java.lang.Throwable throwable66 = retryOnPrimaryException4.unwrapCause();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, throwable66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(shardId17);
        org.junit.Assert.assertNotNull(throwable23);
        org.junit.Assert.assertEquals(throwable23.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(index31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNull(index47);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNull(shardId57);
        org.junit.Assert.assertNotNull(throwable58);
        org.junit.Assert.assertEquals(throwable58.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable58.getMessage(), "");
        org.junit.Assert.assertEquals(throwable58.toString(), "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + restStatus61 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus61.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwable66);
        org.junit.Assert.assertEquals(throwable66.getLocalizedMessage(), "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable66.getMessage(), "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable66.toString(), "[[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];][[[[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ] RetryOnPrimaryException[]] RetryOnPrimaryException[RetryOnPrimaryException[hi!]]; nested: RetryOnPrimaryException[];][100]] RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8662");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException34 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId32, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException34);
        java.util.List<java.lang.String> strList37 = retryOnPrimaryException34.getHeader("");
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray38 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException34);
        retryOnPrimaryException34.setIndex("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        org.elasticsearch.index.shard.ShardId shardId41 = retryOnPrimaryException34.getShardId();
        java.lang.Throwable throwable42 = retryOnPrimaryException34.unwrapCause();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder43 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params44 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = retryOnPrimaryException34.toXContent(xContentBuilder43, params44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(strList37);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray38);
        org.junit.Assert.assertNull(shardId41);
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable42.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
        org.junit.Assert.assertNotNull(params44);
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8663");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "rest.exception.stacktrace.skip");
        org.elasticsearch.index.shard.ShardId shardId16 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException18 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId16, "");
        org.elasticsearch.index.Index index19 = null;
        retryOnPrimaryException18.setIndex(index19);
        java.lang.Throwable[] throwableArray21 = retryOnPrimaryException18.getSuppressed();
        org.elasticsearch.index.Index index22 = retryOnPrimaryException18.getIndex();
        java.lang.String str23 = retryOnPrimaryException18.getDetailedMessage();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        java.lang.Throwable throwable27 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException28 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "hi!", throwable27);
        java.lang.Throwable throwable29 = retryOnPrimaryException28.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException33 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId31, "");
        org.elasticsearch.index.Index index34 = null;
        retryOnPrimaryException33.setIndex(index34);
        java.lang.Throwable[] throwableArray36 = retryOnPrimaryException33.getSuppressed();
        org.elasticsearch.index.Index index37 = retryOnPrimaryException33.getIndex();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException33.addHeader("hi!", strArray43);
        retryOnPrimaryException28.setResources("rest.exception.stacktrace.skip", strArray43);
        org.elasticsearch.index.shard.ShardId shardId47 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException49 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId47, "");
        org.elasticsearch.index.Index index50 = null;
        retryOnPrimaryException49.setIndex(index50);
        java.lang.Throwable[] throwableArray52 = retryOnPrimaryException49.getSuppressed();
        org.elasticsearch.index.Index index53 = retryOnPrimaryException49.getIndex();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException49.addHeader("hi!", strArray59);
        retryOnPrimaryException28.setResources("hi!", strArray59);
        retryOnPrimaryException18.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray59);
        retryOnPrimaryException14.setResources("RetryOnPrimaryException[hi!]", strArray59);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.rest.RestStatus restStatus65 = retryOnPrimaryException14.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray66 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException14);
        retryOnPrimaryException14.setIndex("[RetryOnPrimaryException[hi!]] RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        java.lang.String str69 = retryOnPrimaryException14.getDetailedMessage();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNull(index22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str23, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable29.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNull(index37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNull(index53);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + restStatus65 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus65.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip" + "'", str69, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip");
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8664");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException4.addHeader("hi!", strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException4.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        retryOnPrimaryException4.setShard(shardId23);
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        retryOnPrimaryException4.setShard("RetryOnPrimaryException[]", (int) (short) 1);
        java.lang.String str30 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray31 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray32 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException4);
        boolean boolean33 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException4);
        java.lang.String str34 = org.elasticsearch.ElasticsearchException.getExceptionName((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.index.shard.ShardId shardId35 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException37 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId35, "");
        org.elasticsearch.index.Index index38 = null;
        retryOnPrimaryException37.setIndex(index38);
        java.lang.Throwable throwable40 = retryOnPrimaryException37.getRootCause();
        boolean boolean41 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException37);
        java.util.Set<java.lang.String> strSet42 = retryOnPrimaryException37.getHeaderKeys();
        java.lang.Throwable[] throwableArray43 = retryOnPrimaryException37.getSuppressed();
        java.lang.String str44 = retryOnPrimaryException37.getResourceType();
        java.util.List<java.lang.String> strList45 = retryOnPrimaryException37.getResourceId();
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException37);
        java.lang.String str47 = retryOnPrimaryException37.getDetailedMessage();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "retry_on_primary_exception" + "'", str30, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray31);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "retry_on_primary_exception" + "'", str34, "retry_on_primary_exception");
        org.junit.Assert.assertNotNull(throwable40);
        org.junit.Assert.assertEquals(throwable40.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable40.getMessage(), "");
        org.junit.Assert.assertEquals(throwable40.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str47, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8665");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.addHeader("hi!", strArray34);
        org.elasticsearch.index.shard.ShardId shardId37 = null;
        java.lang.Throwable throwable39 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException40 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId37, "hi!", throwable39);
        java.lang.Throwable throwable41 = retryOnPrimaryException40.unwrapCause();
        java.lang.String str42 = retryOnPrimaryException40.toString();
        org.elasticsearch.index.shard.ShardId shardId43 = retryOnPrimaryException40.getShardId();
        retryOnPrimaryException3.addSuppressed((java.lang.Throwable) retryOnPrimaryException40);
        java.lang.String str45 = retryOnPrimaryException3.getResourceType();
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.util.List<java.lang.String> strList49 = retryOnPrimaryException3.getHeader("RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];]; nested: RetryOnPrimaryException[hi!];");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwable41);
        org.junit.Assert.assertEquals(throwable41.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable41.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str42, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "rest.exception.stacktrace.skip" + "'", str45, "rest.exception.stacktrace.skip");
        org.junit.Assert.assertNull(strList49);
    }

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8666");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        boolean boolean9 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        boolean boolean10 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(params1);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8667");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException11 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId9, "");
        java.util.Set<java.lang.String> strSet12 = retryOnPrimaryException11.getHeaderKeys();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        retryOnPrimaryException11.addHeader("", (java.util.List<java.lang.String>) strList16);
        retryOnPrimaryException4.addHeader("", (java.util.List<java.lang.String>) strList16);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException4.setShard(shardId20);
        boolean boolean22 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable throwable24 = retryOnPrimaryException23.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray25 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException23);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(throwable24);
        org.junit.Assert.assertEquals(throwable24.getLocalizedMessage(), "retry_on_primary_exception");
        org.junit.Assert.assertEquals(throwable24.getMessage(), "retry_on_primary_exception");
        org.junit.Assert.assertEquals(throwable24.toString(), "RetryOnPrimaryException[retry_on_primary_exception]; nested: RetryOnPrimaryException[];");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray25);
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8668");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException4.getSuppressed();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException4.getIndex();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException4.addHeader("hi!", strArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        retryOnPrimaryException4.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        retryOnPrimaryException4.setShard(shardId23);
        java.util.List<java.lang.String> strList25 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException26 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "", (java.lang.Throwable) retryOnPrimaryException4);
        java.util.Set<java.lang.String> strSet27 = retryOnPrimaryException4.getHeaderKeys();
        java.util.Set<java.lang.String> strSet28 = retryOnPrimaryException4.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId29 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException31 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId29, "");
        java.util.Set<java.lang.String> strSet32 = retryOnPrimaryException31.getHeaderKeys();
        java.lang.String str33 = retryOnPrimaryException31.toString();
        java.lang.String str34 = retryOnPrimaryException31.getDetailedMessage();
        org.elasticsearch.index.Index index35 = null;
        retryOnPrimaryException31.setIndex(index35);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray37 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException31);
        java.util.List<java.lang.String> strList39 = retryOnPrimaryException31.getHeader("RetryOnPrimaryException[]");
        org.elasticsearch.index.shard.ShardId shardId40 = null;
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId42, "");
        org.elasticsearch.index.Index index45 = null;
        retryOnPrimaryException44.setIndex(index45);
        java.lang.Throwable[] throwableArray47 = retryOnPrimaryException44.getSuppressed();
        org.elasticsearch.index.Index index48 = retryOnPrimaryException44.getIndex();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException44.addHeader("hi!", strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        retryOnPrimaryException44.addHeader("retry_on_primary_exception", (java.util.List<java.lang.String>) strList60);
        org.elasticsearch.index.shard.ShardId shardId63 = null;
        retryOnPrimaryException44.setShard(shardId63);
        java.util.List<java.lang.String> strList65 = retryOnPrimaryException44.getResourceId();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException66 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId40, "", (java.lang.Throwable) retryOnPrimaryException44);
        java.util.List<java.lang.String> strList68 = null;
        retryOnPrimaryException44.addHeader("hi!", strList68);
        retryOnPrimaryException31.addSuppressed((java.lang.Throwable) retryOnPrimaryException44);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException44);
        java.util.List<java.lang.String> strList72 = retryOnPrimaryException44.getResourceId();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strList25);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RetryOnPrimaryException[]" + "'", str33, "RetryOnPrimaryException[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: " + "'", str34, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray37);
        org.junit.Assert.assertNull(strList39);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNull(index48);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(strList65);
        org.junit.Assert.assertNull(strList72);
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8669");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.String str4 = retryOnPrimaryException3.toString();
        java.lang.String str5 = retryOnPrimaryException3.getResourceType();
        java.lang.String str6 = retryOnPrimaryException3.toString();
        java.lang.Throwable[] throwableArray7 = retryOnPrimaryException3.getSuppressed();
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException3.getResourceId();
        java.lang.String str9 = retryOnPrimaryException3.getResourceType();
        org.elasticsearch.index.Index index10 = null;
        retryOnPrimaryException3.setIndex(index10);
        boolean boolean12 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str4, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str6, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8670");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        java.lang.Throwable throwable6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException7 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId4, "hi!", throwable6);
        java.util.Set<java.lang.String> strSet8 = retryOnPrimaryException7.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        retryOnPrimaryException7.setShard(shardId9);
        java.lang.String str11 = retryOnPrimaryException7.toString();
        org.elasticsearch.rest.RestStatus restStatus12 = retryOnPrimaryException7.status();
        java.lang.Throwable throwable13 = retryOnPrimaryException7.getRootCause();
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "hi!", (java.lang.Throwable) retryOnPrimaryException7);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException15 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "retry_on_primary_exception", (java.lang.Throwable) retryOnPrimaryException14);
        org.elasticsearch.index.shard.ShardId shardId16 = retryOnPrimaryException14.getShardId();
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException14.getHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException14.getHeaderKeys();
        org.elasticsearch.index.Index index20 = retryOnPrimaryException14.getIndex();
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException23 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId21, "");
        org.elasticsearch.index.Index index24 = null;
        retryOnPrimaryException23.setIndex(index24);
        java.lang.Throwable[] throwableArray26 = retryOnPrimaryException23.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "");
        java.util.Set<java.lang.String> strSet31 = retryOnPrimaryException30.getHeaderKeys();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        retryOnPrimaryException30.addHeader("", (java.util.List<java.lang.String>) strList35);
        retryOnPrimaryException23.addHeader("", (java.util.List<java.lang.String>) strList35);
        org.elasticsearch.index.shard.ShardId shardId39 = null;
        retryOnPrimaryException23.setShard(shardId39);
        boolean boolean41 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray42 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException23);
        java.lang.Throwable throwable43 = retryOnPrimaryException23.unwrapCause();
        retryOnPrimaryException14.addSuppressed((java.lang.Throwable) retryOnPrimaryException23);
        org.elasticsearch.index.shard.ShardId shardId45 = retryOnPrimaryException14.getShardId();
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str11, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus12 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus12.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(throwable13);
        org.junit.Assert.assertEquals(throwable13.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable13.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(index20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray42);
        org.junit.Assert.assertNotNull(throwable43);
        org.junit.Assert.assertEquals(throwable43.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable43.getMessage(), "");
        org.junit.Assert.assertEquals(throwable43.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(shardId45);
    }

    @Test
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8671");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        boolean boolean6 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        org.elasticsearch.index.Index index7 = retryOnPrimaryException3.getIndex();
        java.lang.String str8 = retryOnPrimaryException3.toString();
        java.lang.Throwable[] throwableArray9 = retryOnPrimaryException3.getSuppressed();
        org.elasticsearch.index.Index index10 = null;
        retryOnPrimaryException3.setIndex(index10);
        org.elasticsearch.index.Index index12 = retryOnPrimaryException3.getIndex();
        retryOnPrimaryException3.setIndex("[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][10]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]][10]] RetryOnPrimaryException[hi!]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str8, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(index12);
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8672");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        java.util.List<java.lang.String> strList18 = retryOnPrimaryException2.getResourceId();
        java.util.Set<java.lang.String> strSet19 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        retryOnPrimaryException2.setShard(shardId20);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        retryOnPrimaryException2.setShard(shardId25);
        retryOnPrimaryException2.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", 1);
        org.elasticsearch.rest.RestStatus restStatus30 = retryOnPrimaryException2.status();
        retryOnPrimaryException2.setIndex("RetryOnPrimaryException[]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + restStatus30 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus30.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8673");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.Index index4 = null;
        retryOnPrimaryException2.setIndex(index4);
        java.lang.Throwable throwable6 = retryOnPrimaryException2.getRootCause();
        boolean boolean7 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.util.List<java.lang.String> strList8 = retryOnPrimaryException2.getResourceId();
        java.lang.Throwable throwable9 = retryOnPrimaryException2.getRootCause();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable6.toString(), "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]");
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8674");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        java.util.Set<java.lang.String> strSet6 = retryOnPrimaryException2.getHeaderKeys();
        java.util.Set<java.lang.String> strSet7 = retryOnPrimaryException2.getHeaderKeys();
        org.elasticsearch.index.Index index8 = retryOnPrimaryException2.getIndex();
        java.lang.Throwable throwable9 = retryOnPrimaryException2.unwrapCause();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = retryOnPrimaryException2.toXContent(xContentBuilder10, params11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(params11);
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8675");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder0 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params1 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "");
        org.elasticsearch.index.Index index5 = null;
        retryOnPrimaryException4.setIndex(index5);
        java.lang.Throwable throwable7 = retryOnPrimaryException4.getRootCause();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException4);
        java.lang.Throwable throwable9 = retryOnPrimaryException4.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException13 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId11, "");
        org.elasticsearch.index.Index index14 = null;
        retryOnPrimaryException13.setIndex(index14);
        java.lang.Throwable throwable16 = retryOnPrimaryException13.getRootCause();
        boolean boolean17 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException13);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", throwable21);
        java.lang.Throwable throwable23 = retryOnPrimaryException22.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.index.Index index28 = null;
        retryOnPrimaryException27.setIndex(index28);
        java.lang.Throwable[] throwableArray30 = retryOnPrimaryException27.getSuppressed();
        org.elasticsearch.index.Index index31 = retryOnPrimaryException27.getIndex();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException27.addHeader("hi!", strArray37);
        retryOnPrimaryException22.setResources("rest.exception.stacktrace.skip", strArray37);
        retryOnPrimaryException13.setResources("RetryOnPrimaryException[hi!]", strArray37);
        retryOnPrimaryException4.addHeader("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", strArray37);
        java.lang.Throwable throwable42 = retryOnPrimaryException4.getRootCause();
        org.elasticsearch.index.Index index43 = retryOnPrimaryException4.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.ElasticsearchException.toXContent(xContentBuilder0, params1, (java.lang.Throwable) retryOnPrimaryException4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "");
        org.junit.Assert.assertEquals(throwable7.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "");
        org.junit.Assert.assertEquals(throwable9.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable16);
        org.junit.Assert.assertEquals(throwable16.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable16.getMessage(), "");
        org.junit.Assert.assertEquals(throwable16.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwable23);
        org.junit.Assert.assertEquals(throwable23.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(index31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(throwable42);
        org.junit.Assert.assertEquals(throwable42.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable42.getMessage(), "");
        org.junit.Assert.assertEquals(throwable42.toString(), "RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(index43);
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8676");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        java.lang.String str5 = retryOnPrimaryException3.toString();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray6 = retryOnPrimaryException3.guessRootCauses();
        java.lang.String[] strArray14 = new java.lang.String[] { "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "RetryOnPrimaryException[]", "", "RetryOnPrimaryException[rest.exception.stacktrace.skip]; nested: RetryOnPrimaryException[];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "RetryOnPrimaryException[hi!]" };
        retryOnPrimaryException3.addHeader("", strArray14);
        java.lang.String str16 = retryOnPrimaryException3.getDetailedMessage();
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str5, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str16, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8677");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.util.Set<java.lang.String> strSet4 = retryOnPrimaryException3.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        retryOnPrimaryException3.setShard(shardId5);
        java.lang.String str7 = retryOnPrimaryException3.toString();
        org.elasticsearch.rest.RestStatus restStatus8 = retryOnPrimaryException3.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray9 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException3);
        retryOnPrimaryException3.setShard("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!", (int) (byte) 100);
        boolean boolean13 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException3);
        java.lang.Throwable throwable14 = retryOnPrimaryException3.unwrapCause();
        boolean boolean15 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException3);
        java.util.List<java.lang.String> strList17 = retryOnPrimaryException3.getHeader("[rest.exception.cause.skip] RetryOnPrimaryException[]");
        org.elasticsearch.rest.RestStatus restStatus18 = retryOnPrimaryException3.status();
        java.lang.String str19 = retryOnPrimaryException3.toString();
        org.elasticsearch.rest.RestStatus restStatus20 = retryOnPrimaryException3.status();
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str7, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus8 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus8.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable14.toString(), "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertTrue("'" + restStatus18 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus18.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]" + "'", str19, "[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertTrue("'" + restStatus20 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus20.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8678");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId6, "");
        org.elasticsearch.index.Index index9 = null;
        retryOnPrimaryException8.setIndex(index9);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException8.getSuppressed();
        org.elasticsearch.index.Index index12 = retryOnPrimaryException8.getIndex();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException8.addHeader("hi!", strArray18);
        retryOnPrimaryException3.setResources("rest.exception.stacktrace.skip", strArray18);
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException24 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId22, "");
        org.elasticsearch.index.Index index25 = null;
        retryOnPrimaryException24.setIndex(index25);
        java.lang.Throwable[] throwableArray27 = retryOnPrimaryException24.getSuppressed();
        org.elasticsearch.index.Index index28 = retryOnPrimaryException24.getIndex();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException24.addHeader("hi!", strArray34);
        retryOnPrimaryException3.setResources("hi!", strArray34);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray37 = retryOnPrimaryException3.guessRootCauses();
        org.elasticsearch.rest.RestStatus restStatus38 = retryOnPrimaryException3.status();
        retryOnPrimaryException3.setIndex("RetryOnPrimaryException[hi!]");
        java.util.List<java.lang.String> strList42 = retryOnPrimaryException3.getHeader("[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][[[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][[[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]][32]] RetryOnPrimaryException[]][0]] RetryOnPrimaryException[]");
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[hi!]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNull(index12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNull(index28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray37);
        org.junit.Assert.assertTrue("'" + restStatus38 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus38.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNull(strList42);
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8679");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        java.util.Set<java.lang.String> strSet3 = retryOnPrimaryException2.getHeaderKeys();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList7);
        retryOnPrimaryException2.setIndex("hi!");
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException14 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "");
        java.util.Set<java.lang.String> strSet15 = retryOnPrimaryException14.getHeaderKeys();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        retryOnPrimaryException14.addHeader("", (java.util.List<java.lang.String>) strList19);
        java.util.List<java.lang.String> strList22 = retryOnPrimaryException14.getResourceId();
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException14);
        java.lang.String[] strArray30 = new java.lang.String[] { "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", "hi!", "", "retry_on_primary_exception", "hi!" };
        retryOnPrimaryException2.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray30);
        boolean boolean32 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException36 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId34, "");
        java.util.Set<java.lang.String> strSet37 = retryOnPrimaryException36.getHeaderKeys();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        retryOnPrimaryException36.addHeader("", (java.util.List<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList44 = retryOnPrimaryException36.getResourceId();
        java.util.Set<java.lang.String> strSet45 = retryOnPrimaryException36.getHeaderKeys();
        java.util.List<java.lang.String> strList46 = retryOnPrimaryException36.getResourceId();
        org.elasticsearch.index.Index index47 = null;
        retryOnPrimaryException36.setIndex(index47);
        org.elasticsearch.index.shard.ShardId shardId50 = null;
        java.lang.Throwable throwable52 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException53 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId50, "hi!", throwable52);
        java.lang.Throwable throwable54 = retryOnPrimaryException53.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId56 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException58 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId56, "");
        org.elasticsearch.index.Index index59 = null;
        retryOnPrimaryException58.setIndex(index59);
        java.lang.Throwable[] throwableArray61 = retryOnPrimaryException58.getSuppressed();
        org.elasticsearch.index.Index index62 = retryOnPrimaryException58.getIndex();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException58.addHeader("hi!", strArray68);
        retryOnPrimaryException53.setResources("rest.exception.stacktrace.skip", strArray68);
        retryOnPrimaryException36.addHeader("rest.exception.cause.skip", strArray68);
        retryOnPrimaryException2.setResources("RetryOnPrimaryException[hi!]", strArray68);
        java.util.List<java.lang.String> strList73 = retryOnPrimaryException2.getResourceId();
        boolean boolean74 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        boolean boolean75 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable throwable76 = retryOnPrimaryException2.unwrapCause();
        java.util.List<java.lang.String> strList78 = retryOnPrimaryException2.getHeader("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]");
        java.lang.String str79 = retryOnPrimaryException2.getResourceType();
        java.lang.Throwable[] throwableArray80 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(strList44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(strList46);
        org.junit.Assert.assertNotNull(throwable54);
        org.junit.Assert.assertEquals(throwable54.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable54.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNull(index62);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(throwable76);
        org.junit.Assert.assertEquals(throwable76.getLocalizedMessage(), "");
        org.junit.Assert.assertEquals(throwable76.getMessage(), "");
        org.junit.Assert.assertEquals(throwable76.toString(), "[hi!] RetryOnPrimaryException[]");
        org.junit.Assert.assertNull(strList78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "RetryOnPrimaryException[hi!]" + "'", str79, "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8680");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "");
        org.elasticsearch.index.Index index3 = null;
        retryOnPrimaryException2.setIndex(index3);
        java.lang.Throwable[] throwableArray5 = retryOnPrimaryException2.getSuppressed();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException9 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId7, "");
        java.util.Set<java.lang.String> strSet10 = retryOnPrimaryException9.getHeaderKeys();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        retryOnPrimaryException9.addHeader("", (java.util.List<java.lang.String>) strList14);
        retryOnPrimaryException2.addHeader("", (java.util.List<java.lang.String>) strList14);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        retryOnPrimaryException2.setShard(shardId18);
        java.lang.String str20 = retryOnPrimaryException2.getResourceType();
        java.util.List<java.lang.String> strList21 = retryOnPrimaryException2.getResourceId();
        org.elasticsearch.index.Index index22 = null;
        retryOnPrimaryException2.setIndex(index22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.index.shard.ShardId shardId26 = null;
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException30 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId28, "");
        java.util.Set<java.lang.String> strSet31 = retryOnPrimaryException30.getHeaderKeys();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        retryOnPrimaryException30.addHeader("", (java.util.List<java.lang.String>) strList35);
        java.util.List<java.lang.String> strList38 = retryOnPrimaryException30.getResourceId();
        java.util.Set<java.lang.String> strSet39 = retryOnPrimaryException30.getHeaderKeys();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray40 = retryOnPrimaryException30.guessRootCauses();
        retryOnPrimaryException30.setIndex("RetryOnPrimaryException[hi!]");
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException43 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId26, "RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!]", (java.lang.Throwable) retryOnPrimaryException30);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException44 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId24, "[rest.exception.cause.skip][[rest.exception.cause.skip][0]] RetryOnPrimaryException[]", (java.lang.Throwable) retryOnPrimaryException43);
        java.util.List<java.lang.String> strList45 = retryOnPrimaryException44.getResourceId();
        java.lang.Throwable[] throwableArray46 = retryOnPrimaryException44.getSuppressed();
        boolean boolean47 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException44);
        retryOnPrimaryException2.addSuppressed((java.lang.Throwable) retryOnPrimaryException44);
        java.lang.Throwable[] throwableArray49 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(strList38);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray40);
        org.junit.Assert.assertNull(strList45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8681");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException2 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.elasticsearch.rest.RestStatus restStatus3 = retryOnPrimaryException2.status();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray4 = org.elasticsearch.ElasticsearchException.guessRootCauses((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.rest.RestStatus restStatus5 = retryOnPrimaryException2.status();
        boolean boolean6 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = retryOnPrimaryException2.guessRootCauses();
        boolean boolean8 = org.elasticsearch.action.support.replication.ReplicationOperation.ignoreReplicaException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.String str9 = retryOnPrimaryException2.getResourceType();
        boolean boolean10 = org.elasticsearch.action.support.replication.ReplicationOperation.isConflictException((java.lang.Throwable) retryOnPrimaryException2);
        java.lang.Throwable[] throwableArray11 = retryOnPrimaryException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + restStatus3 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus3.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray4);
        org.junit.Assert.assertTrue("'" + restStatus5 + "' != '" + org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR + "'", restStatus5.equals(org.elasticsearch.rest.RestStatus.INTERNAL_SERVER_ERROR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8682");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException4 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId2, "rest.exception.cause.skip");
        java.util.List<java.lang.String> strList5 = retryOnPrimaryException4.getResourceId();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        retryOnPrimaryException4.setShard(shardId6);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException8 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "rest.exception.cause.skip", (java.lang.Throwable) retryOnPrimaryException4);
        retryOnPrimaryException4.setShard("RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];", 100);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException16 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId14, "");
        java.util.Set<java.lang.String> strSet17 = retryOnPrimaryException16.getHeaderKeys();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        java.lang.Throwable throwable21 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException22 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId19, "hi!", throwable21);
        java.lang.Throwable throwable23 = retryOnPrimaryException22.unwrapCause();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException27 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId25, "");
        org.elasticsearch.index.Index index28 = null;
        retryOnPrimaryException27.setIndex(index28);
        java.lang.Throwable[] throwableArray30 = retryOnPrimaryException27.getSuppressed();
        org.elasticsearch.index.Index index31 = retryOnPrimaryException27.getIndex();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "rest.exception.stacktrace.skip", "rest.exception.stacktrace.skip", "" };
        retryOnPrimaryException27.addHeader("hi!", strArray37);
        retryOnPrimaryException22.setResources("rest.exception.stacktrace.skip", strArray37);
        retryOnPrimaryException16.setResources("org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ", strArray37);
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException41 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId12, "rest.exception.stacktrace.skip", (java.lang.Throwable) retryOnPrimaryException16);
        retryOnPrimaryException4.addSuppressed((java.lang.Throwable) retryOnPrimaryException41);
        java.lang.Throwable throwable43 = retryOnPrimaryException4.unwrapCause();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray44 = retryOnPrimaryException4.guessRootCauses();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray45 = retryOnPrimaryException4.guessRootCauses();
        java.util.List<java.lang.String> strList47 = retryOnPrimaryException4.getHeader("[][[][1]] RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];; org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(throwable23);
        org.junit.Assert.assertEquals(throwable23.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable23.toString(), "RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNull(index31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(throwable43);
        org.junit.Assert.assertEquals(throwable43.getLocalizedMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable43.getMessage(), "rest.exception.cause.skip");
        org.junit.Assert.assertEquals(throwable43.toString(), "[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: ]; nested: RetryOnPrimaryException[hi!];][100]] RetryOnPrimaryException[rest.exception.cause.skip]");
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray44);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray45);
        org.junit.Assert.assertNull(strList47);
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8683");
        org.elasticsearch.index.shard.ShardId shardId0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException retryOnPrimaryException3 = new org.elasticsearch.action.support.replication.ReplicationOperation.RetryOnPrimaryException(shardId0, "hi!", throwable2);
        java.lang.Throwable throwable4 = retryOnPrimaryException3.unwrapCause();
        org.elasticsearch.index.Index index5 = retryOnPrimaryException3.getIndex();
        java.lang.String str6 = retryOnPrimaryException3.getResourceType();
        org.elasticsearch.ElasticsearchException[] elasticsearchExceptionArray7 = retryOnPrimaryException3.guessRootCauses();
        retryOnPrimaryException3.setShard("RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];", (int) (byte) 100);
        java.lang.String str11 = retryOnPrimaryException3.getResourceType();
        java.lang.String str12 = retryOnPrimaryException3.getDetailedMessage();
        java.util.List<java.lang.String> strList14 = retryOnPrimaryException3.getHeader("[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip][[org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: rest.exception.stacktrace.skip][1]] RetryOnPrimaryException[hi!]");
        java.util.List<java.lang.String> strList15 = retryOnPrimaryException3.getResourceId();
        org.junit.Assert.assertNotNull(throwable4);
        org.junit.Assert.assertEquals(throwable4.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable4.toString(), "[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][[RetryOnPrimaryException[rest.exception.cause.skip]; nested: RetryOnPrimaryException[hi!];][100]] RetryOnPrimaryException[hi!]");
        org.junit.Assert.assertNull(index5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(elasticsearchExceptionArray7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!" + "'", str12, "org.elasticsearch.action.support.replication.ReplicationOperation$RetryOnPrimaryException: hi!");
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(strList15);
    }
}

