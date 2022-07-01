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
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting9 = indexSettings2.getINDEX_GC_DELETES_SETTING();
        int int10 = indexSettings2.maxRescoreWindow;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexSettings2.scopedSettings;
        boolean boolean12 = indexSettings2.warmerEnabled;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting7 = indexSettings2.getINDEX_WARMER_ENABLED_SETTING();
        indexSettings2.TTLPurgeDisabled = true;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData10, settings11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData10);
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = settings14.getAsStructuredMap();
        org.elasticsearch.index.IndexSettings indexSettings16 = new org.elasticsearch.index.IndexSettings(indexMetaData10, settings14);
        int int17 = indexSettings16.getNumberOfReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue18 = indexSettings16.flushThresholdSize;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting19 = org.elasticsearch.index.IndexSettings.INDEX_WARMER_ENABLED_SETTING;
        java.lang.Boolean boolean20 = indexSettings16.getValue(booleanSetting19);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue21 = indexSettings16.flushThresholdSize;
        indexSettings2.flushThresholdSize = byteSizeValue21;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData23);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings25 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean27 = indexScopedSettings25.hasDynamicSetting("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.common.settings.Settings settings29 = indexScopedSettings25.archiveUnknownOrBrokenSettings(settings28);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings29.getGroups("index.shadow_replicas");
        org.elasticsearch.index.IndexSettings indexSettings32 = new org.elasticsearch.index.IndexSettings(indexMetaData23, settings29);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap33 = indexMetaData23.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData23);
        indexSettings2.indexMetaData = indexMetaData23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int36 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        java.lang.String str8 = indexSettings2.customDataPath();
        org.elasticsearch.common.unit.TimeValue timeValue9 = indexSettings2.syncInterval;
        org.elasticsearch.common.unit.TimeValue timeValue10 = indexSettings2.getDEFAULT_REFRESH_INTERVAL();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting11 = indexSettings2.getDEFAULT_FIELD_SETTING();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexSettings2.getindexNameMatcher();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        boolean boolean8 = indexSettings2.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version9 = indexSettings2.version;
        boolean boolean10 = indexSettings2.isQueryStringAnalyzeWildcard();
        org.elasticsearch.common.unit.TimeValue timeValue11 = indexSettings2.refreshInterval;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher12 = indexSettings2.getParseFieldMatcher();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting13 = indexSettings2.getDEFAULT_FIELD_SETTING();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting14 = indexSettings2.getINDEX_CHECK_ON_STARTUP();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        boolean boolean8 = indexSettings2.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version9 = indexSettings2.version;
        org.elasticsearch.common.unit.TimeValue timeValue10 = indexSettings2.getDEFAULT_REFRESH_INTERVAL();
        org.elasticsearch.index.translog.Translog.Durability durability11 = indexSettings2.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexSettings2.getindexNameMatcher();
        int int13 = indexSettings2.numberOfShards;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting7 = indexSettings2.getINDEX_WARMER_ENABLED_SETTING();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        int int9 = indexSettings2.maxResultWindow;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexSettings2.getScopedSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        int int9 = indexSettings2.getMaxRescoreWindow();
        int int10 = indexSettings2.maxRescoreWindow;
        int int11 = indexSettings2.getNumberOfShards();
        boolean boolean12 = indexSettings2.isTTLPurgeDisabled();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting13 = indexSettings2.getINDEX_TRANSLOG_SYNC_INTERVAL_SETTING();
        int int14 = indexSettings2.numberOfShards;
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings2.durability;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        long long8 = indexSettings2.getGcDeletesInMillis();
        boolean boolean9 = indexSettings2.TTLPurgeDisabled;
        java.lang.String str10 = indexSettings2.getDefaultField();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting11 = indexSettings2.getINDEX_CHECK_ON_STARTUP();
        java.lang.String str12 = indexSettings2.getUUID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        int int9 = indexSettings2.getMaxRescoreWindow();
        int int10 = indexSettings2.maxRescoreWindow;
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexSettings2.getindexNameMatcher();
        org.elasticsearch.common.settings.Settings settings12 = indexSettings2.settings;
        org.elasticsearch.common.unit.TimeValue timeValue13 = indexSettings2.getDEFAULT_GC_DELETES();
        boolean boolean14 = indexSettings2.warmerEnabled;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        int int9 = indexSettings2.getMaxRescoreWindow();
        int int10 = indexSettings2.maxRescoreWindow;
        int int11 = indexSettings2.getNumberOfShards();
        boolean boolean12 = indexSettings2.isTTLPurgeDisabled();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting13 = indexSettings2.getINDEX_TRANSLOG_SYNC_INTERVAL_SETTING();
        boolean boolean14 = indexSettings2.isShadowReplicaIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        boolean boolean8 = indexSettings2.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version9 = indexSettings2.version;
        org.elasticsearch.common.unit.TimeValue timeValue10 = indexSettings2.getDEFAULT_REFRESH_INTERVAL();
        org.elasticsearch.index.translog.Translog.Durability durability11 = indexSettings2.getTranslogDurability();
        org.elasticsearch.common.unit.TimeValue timeValue12 = indexSettings2.getDEFAULT_GC_DELETES();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig13 = indexSettings2.getMergeSchedulerConfig();
        java.lang.String str14 = indexSettings2.getNodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting9 = indexSettings2.getINDEX_GC_DELETES_SETTING();
        int int10 = indexSettings2.maxRescoreWindow;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting11 = indexSettings2.getINDEX_WARMER_ENABLED_SETTING();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting9 = indexSettings2.getQUERY_STRING_LENIENT_SETTING();
        org.elasticsearch.common.settings.Settings settings10 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting11 = indexSettings2.getINDEX_CHECK_ON_STARTUP();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting12 = indexSettings2.getMAX_RESCORE_WINDOW_SETTING();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        boolean boolean8 = indexSettings2.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version9 = indexSettings2.version;
        boolean boolean10 = indexSettings2.isQueryStringAnalyzeWildcard();
        org.elasticsearch.common.settings.Settings settings11 = indexSettings2.nodeSettings;
        boolean boolean12 = indexSettings2.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting13 = indexSettings2.getINDEX_TTL_DISABLE_PURGE_SETTING();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        boolean boolean9 = indexSettings2.isOnSharedFilesystem();
        org.elasticsearch.common.logging.ESLogger eSLogger10 = indexSettings2.logger;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Settings settings9 = indexSettings2.nodeSettings;
        boolean boolean10 = indexSettings2.isDefaultAllowUnmappedFields();
        org.apache.lucene.index.MergePolicy mergePolicy11 = indexSettings2.getMergePolicy();
        org.elasticsearch.common.unit.TimeValue timeValue12 = indexSettings2.getDEFAULT_REFRESH_INTERVAL();
        boolean boolean14 = indexSettings2.matchesIndexName("_all");
        long long15 = indexSettings2.getGcDeletesInMillis();
        org.elasticsearch.common.settings.Settings settings16 = indexSettings2.nodeSettings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting7 = indexSettings2.getINDEX_WARMER_ENABLED_SETTING();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.getNodeSettings();
        org.elasticsearch.common.unit.TimeValue timeValue9 = indexSettings2.refreshInterval;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData10, settings11);
        boolean boolean13 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings12.settings = settings14;
        boolean boolean16 = indexSettings12.queryStringLenient;
        boolean boolean17 = indexSettings12.TTLPurgeDisabled;
        java.lang.String str18 = indexSettings12.customDataPath();
        indexSettings12.warmerEnabled = false;
        org.elasticsearch.index.translog.Translog.Durability durability21 = indexSettings12.durability;
        indexSettings2.durability = durability21;
        int int23 = indexSettings2.getNumberOfShards();
        indexSettings2.setEnableWarmer(false);
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig26 = indexSettings2.mergeSchedulerConfig;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings29 = new org.elasticsearch.index.IndexSettings(indexMetaData27, settings28);
        boolean boolean30 = indexSettings29.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings29.settings = settings31;
        boolean boolean33 = indexSettings29.queryStringLenient;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting34 = indexSettings29.getINDEX_WARMER_ENABLED_SETTING();
        org.elasticsearch.common.settings.Settings settings35 = indexSettings29.nodeSettings;
        boolean boolean36 = indexSettings29.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting37 = indexSettings29.getQUERY_STRING_LENIENT_SETTING();
        java.lang.Boolean boolean38 = indexSettings2.getValue(booleanSetting37);
        java.lang.String str39 = indexSettings2.getNodeName();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig40 = indexSettings2.mergePolicyConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.State state1 = indexMetaData0.getState();
        java.util.Set<java.lang.String> strSet3 = indexMetaData0.activeAllocationIds((int) (short) 100);
        org.elasticsearch.Version version4 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long6 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("index.shared_filesystem.recover_on_any_node");
        boolean boolean10 = indexMetaData0.isSameUUID("state-");
        org.elasticsearch.Version version11 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = builder12.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = builder12.mapping("index.blocks.write");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Settings settings9 = indexSettings2.nodeSettings;
        boolean boolean10 = indexSettings2.isDefaultAllowUnmappedFields();
        org.apache.lucene.index.MergePolicy mergePolicy11 = indexSettings2.getMergePolicy();
        org.elasticsearch.common.unit.TimeValue timeValue12 = indexSettings2.getDEFAULT_REFRESH_INTERVAL();
        boolean boolean13 = indexSettings2.isTTLPurgeDisabled();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig14 = indexSettings2.mergeSchedulerConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        int int9 = indexSettings2.getMaxRescoreWindow();
        int int10 = indexSettings2.maxRescoreWindow;
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexSettings2.getindexNameMatcher();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = indexSettings2.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData12);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = builder13.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.removeAlias("true");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        int int6 = indexSettings2.maxRescoreWindow;
        java.lang.String str7 = indexSettings2.getUUID();
        org.elasticsearch.common.settings.Settings settings8 = indexSettings2.nodeSettings;
        org.elasticsearch.common.settings.Settings settings9 = indexSettings2.nodeSettings;
        int int10 = indexSettings2.maxRescoreWindow;
        indexSettings2.setTTLPurgeDisabled(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        int int9 = indexSettings2.getMaxRescoreWindow();
        int int10 = indexSettings2.maxRescoreWindow;
        int int11 = indexSettings2.getNumberOfShards();
        boolean boolean12 = indexSettings2.isTTLPurgeDisabled();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting13 = indexSettings2.getINDEX_TRANSLOG_SYNC_INTERVAL_SETTING();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings16 = new org.elasticsearch.index.IndexSettings(indexMetaData14, settings15);
        boolean boolean17 = indexSettings16.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings16.settings = settings18;
        int int20 = indexSettings16.maxRescoreWindow;
        java.lang.String str21 = indexSettings16.getUUID();
        org.elasticsearch.common.settings.Settings settings22 = indexSettings16.nodeSettings;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting23 = indexSettings16.getINDEX_GC_DELETES_SETTING();
        int int24 = indexSettings16.maxRescoreWindow;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings27 = new org.elasticsearch.index.IndexSettings(indexMetaData25, settings26);
        boolean boolean28 = indexSettings27.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings27.settings = settings29;
        int int31 = indexSettings27.maxRescoreWindow;
        boolean boolean32 = indexSettings27.TTLPurgeDisabled;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue33 = indexSettings27.getFlushThresholdSize();
        indexSettings16.setTranslogFlushThresholdSize(byteSizeValue33);
        indexSettings2.setTranslogFlushThresholdSize(byteSizeValue33);
        java.lang.String str36 = indexSettings2.getUUID();
        org.apache.lucene.index.MergePolicy mergePolicy37 = indexSettings2.getMergePolicy();
        boolean boolean38 = indexSettings2.defaultAllowUnmappedFields;
        long long39 = indexSettings2.getGcDeletesInMillis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig8 = indexSettings2.mergePolicyConfig;
        org.elasticsearch.index.translog.Translog.Durability durability9 = indexSettings2.durability;
        org.elasticsearch.common.settings.Settings settings10 = indexSettings2.getSettings();
        boolean boolean11 = indexSettings2.queryStringAllowLeadingWildcard;
        int int12 = indexSettings2.numberOfShards;
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexSettings2.indexNameMatcher;
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexSettings2.indexNameMatcher;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = indexSettings2.getNumberOfReplicas();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings2 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings1);
        boolean boolean3 = indexSettings2.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings2.settings = settings4;
        boolean boolean6 = indexSettings2.queryStringLenient;
        boolean boolean7 = indexSettings2.TTLPurgeDisabled;
        boolean boolean8 = indexSettings2.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version9 = indexSettings2.version;
        org.elasticsearch.index.translog.Translog.Durability durability10 = indexSettings2.durability;
        boolean boolean11 = indexSettings2.queryStringAllowLeadingWildcard;
        boolean boolean12 = indexSettings2.isIndexUsingShadowReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings15 = new org.elasticsearch.index.IndexSettings(indexMetaData13, settings14);
        boolean boolean16 = indexSettings15.queryStringLenient;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings19 = new org.elasticsearch.index.IndexSettings(indexMetaData17, settings18);
        boolean boolean20 = indexSettings19.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.common.settings.Settings.EMPTY;
        indexSettings19.settings = settings21;
        boolean boolean23 = indexSettings19.queryStringLenient;
        boolean boolean24 = indexSettings19.TTLPurgeDisabled;
        boolean boolean25 = indexSettings19.isDefaultAllowUnmappedFields();
        org.elasticsearch.Version version26 = indexSettings19.version;
        org.elasticsearch.index.translog.Translog.Durability durability27 = indexSettings19.durability;
        indexSettings15.setdurability(durability27);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue29 = indexSettings15.flushThresholdSize;
        indexSettings2.setTranslogFlushThresholdSize(byteSizeValue29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = indexSettings2.getNumberOfReplicas();
    }
}

