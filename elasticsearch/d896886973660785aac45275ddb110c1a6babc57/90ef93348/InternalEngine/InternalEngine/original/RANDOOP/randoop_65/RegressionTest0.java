import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.elasticsearch.index.engine.EngineConfig engineConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.InternalEngine internalEngine1 = new org.elasticsearch.index.engine.InternalEngine(engineConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = org.elasticsearch.index.engine.Engine.SYNC_COMMIT_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sync_id" + "'", str0, "sync_id");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG;
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool2 = null;
        org.elasticsearch.index.IndexSettings indexSettings3 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer4 = null;
        org.elasticsearch.index.store.Store store5 = null;
        org.apache.lucene.index.SnapshotDeletionPolicy snapshotDeletionPolicy6 = null;
        org.apache.lucene.index.MergePolicy mergePolicy7 = null;
        org.apache.lucene.analysis.Analyzer analyzer8 = null;
        org.apache.lucene.search.similarities.Similarity similarity9 = null;
        org.elasticsearch.index.codec.CodecService codecService10 = null;
        org.elasticsearch.index.engine.Engine.EventListener eventListener11 = null;
        org.elasticsearch.index.shard.TranslogRecoveryPerformer translogRecoveryPerformer12 = null;
        org.apache.lucene.search.QueryCache queryCache13 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = null;
        org.elasticsearch.index.translog.TranslogConfig translogConfig15 = null;
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.EngineConfig engineConfig17 = new org.elasticsearch.index.engine.EngineConfig(openMode0, shardId1, threadPool2, indexSettings3, warmer4, store5, snapshotDeletionPolicy6, mergePolicy7, analyzer8, similarity9, codecService10, eventListener11, translogRecoveryPerformer12, queryCache13, queryCachingPolicy14, translogConfig15, timeValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG;
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool2 = null;
        org.elasticsearch.index.IndexSettings indexSettings3 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer4 = null;
        org.elasticsearch.index.store.Store store5 = null;
        org.apache.lucene.index.SnapshotDeletionPolicy snapshotDeletionPolicy6 = null;
        org.apache.lucene.index.MergePolicy mergePolicy7 = null;
        org.apache.lucene.analysis.Analyzer analyzer8 = null;
        org.apache.lucene.search.similarities.Similarity similarity9 = null;
        org.elasticsearch.index.codec.CodecService codecService10 = null;
        org.elasticsearch.index.engine.Engine.EventListener eventListener11 = null;
        org.elasticsearch.index.shard.TranslogRecoveryPerformer translogRecoveryPerformer12 = null;
        org.apache.lucene.search.QueryCache queryCache13 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = null;
        org.elasticsearch.index.translog.TranslogConfig translogConfig15 = null;
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.EngineConfig engineConfig17 = new org.elasticsearch.index.engine.EngineConfig(openMode0, shardId1, threadPool2, indexSettings3, warmer4, store5, snapshotDeletionPolicy6, mergePolicy7, analyzer8, similarity9, codecService10, eventListener11, translogRecoveryPerformer12, queryCache13, queryCachingPolicy14, translogConfig15, timeValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG;
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool2 = null;
        org.elasticsearch.index.IndexSettings indexSettings3 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer4 = null;
        org.elasticsearch.index.store.Store store5 = null;
        org.apache.lucene.index.SnapshotDeletionPolicy snapshotDeletionPolicy6 = null;
        org.apache.lucene.index.MergePolicy mergePolicy7 = null;
        org.apache.lucene.analysis.Analyzer analyzer8 = null;
        org.apache.lucene.search.similarities.Similarity similarity9 = null;
        org.elasticsearch.index.codec.CodecService codecService10 = null;
        org.elasticsearch.index.engine.Engine.EventListener eventListener11 = null;
        org.elasticsearch.index.shard.TranslogRecoveryPerformer translogRecoveryPerformer12 = null;
        org.apache.lucene.search.QueryCache queryCache13 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = null;
        org.elasticsearch.index.translog.TranslogConfig translogConfig15 = null;
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.EngineConfig engineConfig17 = new org.elasticsearch.index.engine.EngineConfig(openMode0, shardId1, threadPool2, indexSettings3, warmer4, store5, snapshotDeletionPolicy6, mergePolicy7, analyzer8, similarity9, codecService10, eventListener11, translogRecoveryPerformer12, queryCache13, queryCachingPolicy14, translogConfig15, timeValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting0 = org.elasticsearch.index.engine.EngineConfig.INDEX_CODEC_SETTING;
        java.lang.Class<?> wildcardClass1 = strSetting0.getClass();
        org.junit.Assert.assertNotNull(strSetting0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG;
        java.lang.Class<?> wildcardClass1 = openMode0.getClass();
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_AND_TRANSLOG));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG;
        java.lang.Class<?> wildcardClass1 = openMode0.getClass();
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.CREATE_INDEX_AND_TRANSLOG));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG;
        java.lang.Class<?> wildcardClass1 = openMode0.getClass();
        org.junit.Assert.assertTrue("'" + openMode0 + "' != '" + org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG + "'", openMode0.equals(org.elasticsearch.index.engine.EngineConfig.OpenMode.OPEN_INDEX_CREATE_TRANSLOG));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.elasticsearch.index.engine.EngineConfig.OpenMode openMode0 = null;
        org.elasticsearch.index.shard.ShardId shardId1 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool2 = null;
        org.elasticsearch.index.IndexSettings indexSettings3 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer4 = null;
        org.elasticsearch.index.store.Store store5 = null;
        org.apache.lucene.index.SnapshotDeletionPolicy snapshotDeletionPolicy6 = null;
        org.apache.lucene.index.MergePolicy mergePolicy7 = null;
        org.apache.lucene.analysis.Analyzer analyzer8 = null;
        org.apache.lucene.search.similarities.Similarity similarity9 = null;
        org.elasticsearch.index.codec.CodecService codecService10 = null;
        org.elasticsearch.index.engine.Engine.EventListener eventListener11 = null;
        org.elasticsearch.index.shard.TranslogRecoveryPerformer translogRecoveryPerformer12 = null;
        org.apache.lucene.search.QueryCache queryCache13 = null;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy14 = null;
        org.elasticsearch.index.translog.TranslogConfig translogConfig15 = null;
        org.elasticsearch.common.unit.TimeValue timeValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.EngineConfig engineConfig17 = new org.elasticsearch.index.engine.EngineConfig(openMode0, shardId1, threadPool2, indexSettings3, warmer4, store5, snapshotDeletionPolicy6, mergePolicy7, analyzer8, similarity9, codecService10, eventListener11, translogRecoveryPerformer12, queryCache13, queryCachingPolicy14, translogConfig15, timeValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: openMode must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

