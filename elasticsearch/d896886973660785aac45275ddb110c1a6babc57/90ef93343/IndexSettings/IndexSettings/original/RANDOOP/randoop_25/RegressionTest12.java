import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        int int9 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData0.getSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = settings10.getAsStructuredMap();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray29 = new java.lang.String[] { "index.data_path", "index.number_of_shards", "index.shadow_replicas", "", "index.number_of_shards", "index.", "index.blocks.read_only", "index.shadow_replicas", "index.version.minimum_compatible", "index.version.upgraded_string", "index.blocks.read_only", "index.number_of_shards", "index.creation_date_string", "hi!", "primary_terms", "primary_terms" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder2.putArray("index.version.minimum_compatible", (java.util.List<java.lang.String>) strList30);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder2.put("index.version.created", (double) '#');
        org.elasticsearch.common.settings.Settings.Builder builder37 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder37.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder39.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings43 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate44 = null;
        org.elasticsearch.common.settings.Settings settings45 = settings43.filter(strPredicate44);
        java.lang.String str47 = settings45.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder39.put(settings45);
        java.lang.String[] strArray66 = new java.lang.String[] { "index.data_path", "index.number_of_shards", "index.shadow_replicas", "", "index.number_of_shards", "index.", "index.blocks.read_only", "index.shadow_replicas", "index.version.minimum_compatible", "index.version.upgraded_string", "index.blocks.read_only", "index.number_of_shards", "index.creation_date_string", "hi!", "primary_terms", "primary_terms" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder39.putArray("index.version.minimum_compatible", (java.util.List<java.lang.String>) strList67);
        org.elasticsearch.common.settings.Settings.Builder builder70 = builder35.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList67);
        org.elasticsearch.common.settings.Settings.Builder builder73 = builder35.put("index.number_of_replicas=0#index.number_of_shards=1#index.version.created=5000099#", 0.0d);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = builder7.mapping("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.state(state10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.putCustom("archived.", custom13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder14.index("index.creation_date");
        org.elasticsearch.common.settings.Settings.Builder builder17 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder17.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder17.put("_na_", "primary_terms");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = builder17.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder14.settings(builder17);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder17.put("index.shared_filesystem.recover_on_any_node", (double) 60000L);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder17.put("index.version.created", "index.shared_filesystem.recover_on_any_node");
        java.util.concurrent.TimeUnit timeUnit33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder34 = builder30.put("index.version.upgraded", (long) (byte) 100, timeUnit33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 0);
        long long4 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version(1L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.version((long) 1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder1.mapping("100.0");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap13 = indexMetaData11.getMappings();
        int int14 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate16 = null;
        org.elasticsearch.common.settings.Settings settings17 = settings15.filter(strPredicate16);
        java.lang.String str19 = settings17.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap20 = settings17.getAsGroups();
        java.lang.String str22 = settings17.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData11, settings17);
        boolean boolean24 = indexSettings23.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue25 = indexSettings23.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability26 = indexSettings23.getTranslogDurability();
        int int27 = indexSettings23.getMaxRescoreWindow();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = indexSettings23.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int30 = indexMetaData29.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff31 = indexMetaData28.diff(indexMetaData29);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap32 = indexMetaData29.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state33 = indexMetaData29.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder34 = builder1.state(state33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = builder34.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [primary_terms]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteSizeValue25);
        org.junit.Assert.assertTrue("'" + durability26 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability26.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData28);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff31);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap32);
        org.junit.Assert.assertTrue("'" + state33 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state33.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData4 = indexMetaData0.mapping("index.creation_date_string");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.excludeFilters();
        org.elasticsearch.Version version7 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNull(mappingMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(version7);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("_all");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder8.mapping("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder8.numberOfShards((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = builder8.primaryTerm(10000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        java.lang.String str15 = indexSettings12.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig16 = indexSettings12.getMergeSchedulerConfig();
        java.lang.String str17 = indexSettings12.customDataPath();
        java.lang.String str18 = indexSettings12.customDataPath();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long20 = indexMetaData19.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData19.getMappings();
        int int22 = indexMetaData19.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        java.lang.String str27 = settings25.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap28 = settings25.getAsGroups();
        java.lang.String str30 = settings25.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings31 = new org.elasticsearch.index.IndexSettings(indexMetaData19, settings25);
        int int32 = indexSettings31.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting33 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue34 = indexSettings31.getValue(timeValueSetting33);
        boolean boolean35 = indexSettings31.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue36 = indexSettings31.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long38 = indexMetaData37.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap39 = indexMetaData37.getMappings();
        int int40 = indexMetaData37.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings41 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate42 = null;
        org.elasticsearch.common.settings.Settings settings43 = settings41.filter(strPredicate42);
        java.lang.String str45 = settings43.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap46 = settings43.getAsGroups();
        java.lang.String str48 = settings43.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings49 = new org.elasticsearch.index.IndexSettings(indexMetaData37, settings43);
        int int50 = indexSettings49.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting51 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue52 = indexSettings49.getValue(timeValueSetting51);
        org.elasticsearch.common.unit.TimeValue timeValue53 = indexSettings31.getValue(timeValueSetting51);
        org.elasticsearch.common.unit.TimeValue timeValue54 = indexSettings12.getValue(timeValueSetting51);
        org.elasticsearch.common.settings.Settings settings55 = indexSettings12.getNodeSettings();
        boolean boolean56 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings55);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap58 = settings55.getGroups("-1");
        boolean boolean59 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings55);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_all" + "'", str15, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting33);
        org.junit.Assert.assertNotNull(timeValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting51);
        org.junit.Assert.assertNotNull(timeValue52);
        org.junit.Assert.assertNotNull(timeValue53);
        org.junit.Assert.assertNotNull(timeValue54);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        java.util.Set<java.lang.String> strSet8 = indexMetaData0.activeAllocationIds((int) (short) 0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap9 = indexMetaData0.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfReplicas(0);
        org.elasticsearch.common.settings.Settings.Builder builder12 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder12.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder14.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        java.lang.String str22 = settings20.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder14.put(settings20);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = settings20.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings settings26 = settings20.getByPrefix("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings settings28 = settings20.getAsSettings("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder11.settings(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.index("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.creationDate((long) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder33.numberOfShards((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int40 = builder39.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.index("index.version.upgraded");
        int int43 = builder42.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder42.numberOfReplicas((int) (byte) 10);
        int int46 = builder45.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder45.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int51 = builder50.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder50.index("index.version.upgraded");
        int int54 = builder53.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder53.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData58 = builder56.mapping("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state59 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder56.state(state59);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder45.state(state59);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder33.state(state59);
        byte byte63 = state59.id();
        byte byte64 = state59.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = builder31.state(state59);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder31.index("100");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(mappingMetaData58);
        org.junit.Assert.assertTrue("'" + state59 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state59.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 0 + "'", byte63 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 0 + "'", byte64 == (byte) 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.removeAlias("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long5 = indexMetaData4.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData4.getMappings();
        int int7 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate9 = null;
        org.elasticsearch.common.settings.Settings settings10 = settings8.filter(strPredicate9);
        java.lang.String str12 = settings10.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap13 = settings10.getAsGroups();
        java.lang.String str15 = settings10.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings16 = new org.elasticsearch.index.IndexSettings(indexMetaData4, settings10);
        int int17 = indexSettings16.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting18 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings16.getValue(timeValueSetting18);
        int int20 = indexSettings16.getMaxRescoreWindow();
        boolean boolean21 = indexSettings16.isDefaultAllowUnmappedFields();
        boolean boolean22 = indexSettings16.isShadowReplicaIndex();
        java.lang.String str23 = indexSettings16.getNodeName();
        org.elasticsearch.common.settings.Settings settings24 = indexSettings16.getNodeSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.version((long) 1);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder27.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state34 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.state(state34);
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate37 = null;
        org.elasticsearch.common.settings.Settings settings38 = settings36.filter(strPredicate37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings36);
        java.lang.String str41 = settings36.get("");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap43 = settings36.getGroups("_na_");
        java.lang.String str45 = settings36.toDelimitedString('4');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData47 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.Version version48 = indexMetaData47.getCreationVersion();
        org.elasticsearch.Version version49 = settings36.getAsVersion("primary_terms", version48);
        org.elasticsearch.Version version50 = settings24.getAsVersion("index.version.created_string", version48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder3.settings(settings24);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + state34 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state34.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(indexMetaData47);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertNotNull(version50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap15 = indexMetaData14.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder16.putCustom("", custom18);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder24.normalizePrefix("");
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder24.putNull("index.blocks.write");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder24.put("index.number_of_replicas", (double) ' ');
        java.lang.String str33 = builder24.remove("");
        java.lang.String str35 = builder24.get("index.blocks.metadata");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate9 = null;
        org.elasticsearch.common.settings.Settings settings10 = settings8.filter(strPredicate9);
        java.lang.String str12 = settings10.toDelimitedString('#');
        org.elasticsearch.index.IndexSettings indexSettings13 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings10);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = settings10.getAsMap();
        java.lang.String str16 = settings10.toDelimitedString('4');
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (byte) 1, (long) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        org.elasticsearch.common.settings.Settings settings23 = settings18.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet24 = settings18.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder8.putActiveAllocationIds(0, strSet24);
        int int26 = builder8.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder8.removeAllAliases();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings28 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings29.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue33 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue34 = settings29.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue33);
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings29);
        org.elasticsearch.common.settings.Settings settings36 = indexScopedSettings28.dryRun(settings35);
        org.elasticsearch.common.settings.Settings settings38 = settings35.getByPrefix("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder8.settings(settings35);
        int int40 = builder39.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder42.version((long) 1);
        org.elasticsearch.common.settings.Settings settings45 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate46 = null;
        org.elasticsearch.common.settings.Settings settings47 = settings45.filter(strPredicate46);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = builder42.settings(settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state49 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder48.state(state49);
        org.elasticsearch.common.settings.Settings settings51 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate52 = null;
        org.elasticsearch.common.settings.Settings settings53 = settings51.filter(strPredicate52);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder50.settings(settings51);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom56 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder54.putCustom("state-", custom56);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder54.numberOfReplicas((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder54.version((long) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData62 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap63 = indexMetaData62.getMappings();
        int int64 = indexMetaData62.getNumberOfShards();
        long long65 = indexMetaData62.getVersion();
        org.elasticsearch.index.Index index66 = indexMetaData62.getMergeSourceIndex();
        int int67 = indexMetaData62.getNumberOfShards();
        long long68 = indexMetaData62.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state69 = indexMetaData62.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder70 = builder54.state(state69);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = builder39.state(state69);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(indexScopedSettings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(sizeValue34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + state49 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state49.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(indexMetaData62);
        org.junit.Assert.assertNotNull(strImmutableOpenMap63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNull(index66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + state69 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state69.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData3.getMappings();
        int int5 = indexMetaData3.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings6 = indexMetaData3.getSettings();
        org.elasticsearch.index.IndexSettings indexSettings7 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = indexSettings7.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = indexSettings7.getIndexMetaData();
        boolean boolean10 = indexSettings7.isQueryStringAnalyzeWildcard();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap13 = indexMetaData11.getMappings();
        int int14 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate16 = null;
        org.elasticsearch.common.settings.Settings settings17 = settings15.filter(strPredicate16);
        java.lang.String str19 = settings17.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap20 = settings17.getAsGroups();
        java.lang.String str22 = settings17.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData11, settings17);
        boolean boolean24 = indexSettings23.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue25 = indexSettings23.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability26 = indexSettings23.getTranslogDurability();
        int int27 = indexSettings23.getMaxRescoreWindow();
        boolean boolean28 = indexSettings23.isQueryStringAllowLeadingWildcard();
        boolean boolean29 = indexSettings23.isQueryStringAllowLeadingWildcard();
        boolean boolean30 = indexSettings23.isQueryStringLenient();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData31 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long32 = indexMetaData31.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap33 = indexMetaData31.getMappings();
        int int34 = indexMetaData31.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate36 = null;
        org.elasticsearch.common.settings.Settings settings37 = settings35.filter(strPredicate36);
        java.lang.String str39 = settings37.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap40 = settings37.getAsGroups();
        java.lang.String str42 = settings37.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings43 = new org.elasticsearch.index.IndexSettings(indexMetaData31, settings37);
        int int44 = indexSettings43.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting45 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue46 = indexSettings43.getValue(timeValueSetting45);
        org.elasticsearch.common.unit.TimeValue timeValue47 = indexSettings23.getValue(timeValueSetting45);
        org.elasticsearch.common.unit.TimeValue timeValue48 = indexSettings7.getValue(timeValueSetting45);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteSizeValue25);
        org.junit.Assert.assertTrue("'" + durability26 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability26.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(indexMetaData31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting45);
        org.junit.Assert.assertNotNull(timeValue46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(timeValue48);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings settings10 = builder9.build();
        java.util.Set<java.lang.String> strSet11 = settings10.names();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long13 = indexMetaData12.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap14 = indexMetaData12.getMappings();
        int int15 = indexMetaData12.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings18.getAsGroups();
        java.lang.String str23 = settings18.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings24 = new org.elasticsearch.index.IndexSettings(indexMetaData12, settings18);
        int int25 = indexSettings24.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig26 = indexSettings24.getMergeSchedulerConfig();
        boolean boolean28 = indexSettings24.matchesIndexName("index.number_of_shards");
        boolean boolean29 = settings10.equals((java.lang.Object) indexSettings24);
        java.lang.String str30 = indexSettings24.getUUID();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_na_" + "'", str30, "_na_");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isTTLPurgeDisabled();
        int int17 = indexSettings12.getMaxRescoreWindow();
        java.lang.String str18 = indexSettings12.getUUID();
        java.lang.String str19 = indexSettings12.getUUID();
        boolean boolean20 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean21 = indexSettings12.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.Version version22 = indexSettings12.getIndexVersionCreated();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_na_" + "'", str18, "_na_");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_na_" + "'", str19, "_na_");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(version22);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate11 = null;
        org.elasticsearch.common.settings.Settings settings12 = settings10.filter(strPredicate11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.settings(settings10);
        java.lang.Boolean boolean16 = settings10.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = settings10.getAsStructuredMap();
        org.elasticsearch.common.unit.SizeValue sizeValue19 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue20 = settings10.getAsSize("state-", sizeValue19);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params22 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder23 = settings10.toXContent(xContentBuilder21, params22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings10);
        java.util.Set<java.lang.String> strSet25 = settings10.names();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(sizeValue20);
        org.junit.Assert.assertNotNull(params22);
        org.junit.Assert.assertNull(xContentBuilder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.index("index.number_of_shards");
        int int7 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long9 = indexMetaData8.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData8.getMappings();
        int int11 = indexMetaData8.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData8.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings.Builder builder13 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder13.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder15.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate20 = null;
        org.elasticsearch.common.settings.Settings settings21 = settings19.filter(strPredicate20);
        java.lang.String str23 = settings21.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder15.put(settings21);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder24.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap33 = settings32.getAsGroups();
        org.elasticsearch.common.settings.Settings settings35 = settings32.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version37 = null;
        org.elasticsearch.Version version38 = settings32.getAsVersion("index.creation_date_string", version37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = settings32.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate40 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction41 = null;
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder26.putProperties(strMap39, strPredicate40, strFunction41);
        boolean boolean43 = indexMetaData8.equals((java.lang.Object) builder42);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder1.settings(builder42);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder44.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder44.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData49 = builder44.mapping("5000099");
        int int50 = builder44.numberOfReplicas();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNull(version38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strPredicate40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(mappingMetaData49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        boolean boolean13 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue14 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        int int16 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = indexSettings12.getIndexMetaData();
        org.elasticsearch.Version version18 = indexSettings12.getIndexVersionCreated();
        boolean boolean19 = indexSettings12.isShadowReplicaIndex();
        org.elasticsearch.common.unit.TimeValue timeValue20 = indexSettings12.getGlobalCheckpointInterval();
        int int21 = indexSettings12.getNumberOfReplicas();
        int int22 = indexSettings12.getMaxResultWindow();
        org.elasticsearch.common.unit.TimeValue timeValue23 = indexSettings12.getTranslogSyncInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteSizeValue14);
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(timeValue23);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.getCreationDate();
        long long8 = indexMetaData0.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.index.Index index4 = indexMetaData0.getMergeSourceIndex();
        int int5 = indexMetaData0.getNumberOfShards();
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        int int8 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap10 = indexMetaData9.getMappings();
        int int11 = indexMetaData9.getNumberOfShards();
        long long12 = indexMetaData9.getVersion();
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings14 = new org.elasticsearch.index.IndexSettings(indexMetaData9, settings13);
        org.elasticsearch.Version version15 = indexMetaData9.getUpgradedVersion();
        int int16 = indexMetaData9.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings17 = indexMetaData9.getSettings();
        org.elasticsearch.index.IndexSettings indexSettings18 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings17);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(index4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNotNull(strImmutableOpenMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(settings17);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.creationDate(32L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfReplicas((int) (byte) 0);
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        java.lang.String str23 = builder12.get("");
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder12.put("index.shared_filesystem", "index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("state-", (int) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder26.put("index.shared_filesystem.recover_on_any_node", "archived.");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder26.loadFromSource("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder7.settings(builder26);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int39 = builder38.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder38.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder38.index("index.number_of_shards");
        int int44 = builder38.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData45 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long46 = indexMetaData45.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap47 = indexMetaData45.getMappings();
        int int48 = indexMetaData45.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters49 = indexMetaData45.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings.Builder builder50 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder50.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder52.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings56 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate57 = null;
        org.elasticsearch.common.settings.Settings settings58 = settings56.filter(strPredicate57);
        java.lang.String str60 = settings58.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder52.put(settings58);
        org.elasticsearch.common.settings.Settings.Builder builder63 = builder61.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder66 = builder63.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings67 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate68 = null;
        org.elasticsearch.common.settings.Settings settings69 = settings67.filter(strPredicate68);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap70 = settings69.getAsGroups();
        org.elasticsearch.common.settings.Settings settings72 = settings69.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version74 = null;
        org.elasticsearch.Version version75 = settings69.getAsVersion("index.creation_date_string", version74);
        java.util.Map<java.lang.String, java.lang.String> strMap76 = settings69.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate77 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction78 = null;
        org.elasticsearch.common.settings.Settings.Builder builder79 = builder63.putProperties(strMap76, strPredicate77, strFunction78);
        boolean boolean80 = indexMetaData45.equals((java.lang.Object) builder79);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder81 = builder38.settings(builder79);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder82 = builder81.removeAllAliases();
        org.elasticsearch.common.settings.Settings settings84 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate85 = null;
        org.elasticsearch.common.settings.Settings settings86 = settings84.filter(strPredicate85);
        java.util.Set<java.lang.String> strSet87 = settings86.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder88 = builder82.putActiveAllocationIds((int) '4', strSet87);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder89 = builder7.putActiveAllocationIds(0, strSet87);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(indexMetaData45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertNotNull(settings69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNull(version75);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(strPredicate77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(settings84);
        org.junit.Assert.assertNotNull(settings86);
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder13.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder17 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder17.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder19.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        java.lang.String str27 = settings25.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder19.put(settings25);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder28.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate35 = null;
        org.elasticsearch.common.settings.Settings settings36 = settings34.filter(strPredicate35);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap37 = settings36.getAsGroups();
        org.elasticsearch.common.settings.Settings settings39 = settings36.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version41 = null;
        org.elasticsearch.Version version42 = settings36.getAsVersion("index.creation_date_string", version41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = settings36.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate44 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction45 = null;
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder30.putProperties(strMap43, strPredicate44, strFunction45);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder16.put(strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = builder47.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder47.put("_na_", (long) (short) 10);
        java.io.InputStream inputStream53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder54 = builder47.loadFromStream("index.shared_filesystem", inputStream53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNull(version42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strPredicate44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        java.lang.String str15 = indexSettings12.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher16 = indexSettings12.getParseFieldMatcher();
        org.apache.lucene.index.MergePolicy mergePolicy17 = indexSettings12.getMergePolicy();
        boolean boolean18 = indexSettings12.isQueryStringAllowLeadingWildcard();
        java.lang.String str19 = indexSettings12.getUUID();
        int int20 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long22 = indexMetaData21.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap23 = indexMetaData21.getMappings();
        int int24 = indexMetaData21.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings25 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate26 = null;
        org.elasticsearch.common.settings.Settings settings27 = settings25.filter(strPredicate26);
        java.lang.String str29 = settings27.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap30 = settings27.getAsGroups();
        java.lang.String str32 = settings27.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings33 = new org.elasticsearch.index.IndexSettings(indexMetaData21, settings27);
        java.lang.String str34 = indexSettings33.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData35 = indexSettings33.getIndexMetaData();
        java.lang.String str36 = indexSettings33.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher37 = indexSettings33.getParseFieldMatcher();
        org.apache.lucene.index.MergePolicy mergePolicy38 = indexSettings33.getMergePolicy();
        boolean boolean40 = indexSettings33.matchesIndexName("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings settings41 = indexSettings33.getSettings();
        int int42 = indexSettings33.getMaxResultWindow();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData43 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long44 = indexMetaData43.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap45 = indexMetaData43.getMappings();
        int int46 = indexMetaData43.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate48 = null;
        org.elasticsearch.common.settings.Settings settings49 = settings47.filter(strPredicate48);
        java.lang.String str51 = settings49.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap52 = settings49.getAsGroups();
        java.lang.String str54 = settings49.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings55 = new org.elasticsearch.index.IndexSettings(indexMetaData43, settings49);
        int int56 = indexSettings55.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting57 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue58 = indexSettings55.getValue(timeValueSetting57);
        boolean boolean59 = indexSettings55.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue60 = indexSettings55.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long62 = indexMetaData61.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap63 = indexMetaData61.getMappings();
        int int64 = indexMetaData61.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings65 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate66 = null;
        org.elasticsearch.common.settings.Settings settings67 = settings65.filter(strPredicate66);
        java.lang.String str69 = settings67.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap70 = settings67.getAsGroups();
        java.lang.String str72 = settings67.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings73 = new org.elasticsearch.index.IndexSettings(indexMetaData61, settings67);
        int int74 = indexSettings73.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting75 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue76 = indexSettings73.getValue(timeValueSetting75);
        org.elasticsearch.common.unit.TimeValue timeValue77 = indexSettings55.getValue(timeValueSetting75);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData78 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long79 = indexMetaData78.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap80 = indexMetaData78.getMappings();
        int int81 = indexMetaData78.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings82 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate83 = null;
        org.elasticsearch.common.settings.Settings settings84 = settings82.filter(strPredicate83);
        java.lang.String str86 = settings84.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap87 = settings84.getAsGroups();
        java.lang.String str89 = settings84.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings90 = new org.elasticsearch.index.IndexSettings(indexMetaData78, settings84);
        int int91 = indexSettings90.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting92 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue93 = indexSettings90.getValue(timeValueSetting92);
        org.elasticsearch.common.unit.TimeValue timeValue94 = indexSettings55.getValue(timeValueSetting92);
        org.elasticsearch.common.unit.TimeValue timeValue95 = indexSettings33.getValue(timeValueSetting92);
        org.elasticsearch.common.unit.TimeValue timeValue96 = indexSettings12.getValue(timeValueSetting92);
        boolean boolean97 = indexSettings12.isDefaultAllowUnmappedFields();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher16);
        org.junit.Assert.assertNotNull(mergePolicy17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_na_" + "'", str19, "_na_");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(indexMetaData35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher37);
        org.junit.Assert.assertNotNull(mergePolicy38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting57);
        org.junit.Assert.assertNotNull(timeValue58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeValue60);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting75);
        org.junit.Assert.assertNotNull(timeValue76);
        org.junit.Assert.assertNotNull(timeValue77);
        org.junit.Assert.assertNotNull(indexMetaData78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1L + "'", long79 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(settings82);
        org.junit.Assert.assertNotNull(settings84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting92);
        org.junit.Assert.assertNotNull(timeValue93);
        org.junit.Assert.assertNotNull(timeValue94);
        org.junit.Assert.assertNotNull(timeValue95);
        org.junit.Assert.assertNotNull(timeValue96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.index.Index index4 = indexMetaData0.getMergeSourceIndex();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(index4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 0);
        long long4 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version(1L);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = builder1.mapping("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.version((long) 1);
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate14 = null;
        org.elasticsearch.common.settings.Settings settings15 = settings13.filter(strPredicate14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder10.settings(settings13);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state17 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.state(state17);
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate20 = null;
        org.elasticsearch.common.settings.Settings settings21 = settings19.filter(strPredicate20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder18.settings(settings19);
        java.lang.String str23 = builder22.index();
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder24.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder26.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = builder26.internalMap();
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder26.put(objArray33);
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.blocks.read", (double) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder34.normalizePrefix("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder22.settings(builder34);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder34.put("state-", 0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder1.settings(builder34);
        org.elasticsearch.common.settings.Settings.Builder builder45 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder45.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder47.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder52.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder52.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder52.put("state-", (double) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder60 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder62 = builder60.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder62.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder62.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap68 = builder62.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = builder71.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder75 = builder71.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass76 = builder71.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder62.put("index.number_of_shards", (java.lang.Class) wildcardClass76);
        org.elasticsearch.common.settings.Settings.Builder builder79 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder81 = builder79.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder84 = builder81.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder86 = builder81.normalizePrefix("index.blocks.read");
        java.lang.String[] strArray89 = new java.lang.String[] { "index.number_of_shards" };
        org.elasticsearch.common.settings.Settings.Builder builder90 = builder86.putArray("archived.", strArray89);
        org.elasticsearch.common.settings.Settings.Builder builder91 = builder77.extendArray("index.blocks.read", strArray89);
        org.elasticsearch.common.settings.Settings settings92 = builder77.build();
        java.util.Map<java.lang.String, java.lang.Object> strMap93 = settings92.getAsStructuredMap();
        java.util.Map<java.lang.String, java.lang.String> strMap94 = settings92.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder95 = builder52.put(strMap94);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder96 = builder1.settings(builder52);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + state17 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state17.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "primary_terms" + "'", str23, "primary_terms");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(settings92);
        org.junit.Assert.assertNotNull(strMap93);
        org.junit.Assert.assertNotNull(strMap94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate11 = null;
        org.elasticsearch.common.settings.Settings settings12 = settings10.filter(strPredicate11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.settings(settings10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putCustom("state-", custom15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder13.numberOfReplicas((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.numberOfShards((-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.removeAlias("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder20.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.creationDate((long) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.removeAlias("100.0");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder30.version((long) 1);
        org.elasticsearch.common.settings.Settings settings33 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate34 = null;
        org.elasticsearch.common.settings.Settings settings35 = settings33.filter(strPredicate34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder30.settings(settings33);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state37 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder36.state(state37);
        org.elasticsearch.common.settings.Settings settings39 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate40 = null;
        org.elasticsearch.common.settings.Settings settings41 = settings39.filter(strPredicate40);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder38.settings(settings39);
        java.lang.Boolean boolean45 = settings39.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = settings39.getAsStructuredMap();
        org.elasticsearch.common.unit.SizeValue sizeValue48 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue49 = settings39.getAsSize("state-", sizeValue48);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder50 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params51 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder52 = settings39.toXContent(xContentBuilder50, params51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = settings39.getAsMap();
        org.elasticsearch.common.settings.Settings settings55 = settings39.getByPrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData56 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long57 = indexMetaData56.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap58 = indexMetaData56.getMappings();
        int int59 = indexMetaData56.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings60 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate61 = null;
        org.elasticsearch.common.settings.Settings settings62 = settings60.filter(strPredicate61);
        java.lang.String str64 = settings62.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap65 = settings62.getAsGroups();
        java.lang.String str67 = settings62.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings68 = new org.elasticsearch.index.IndexSettings(indexMetaData56, settings62);
        java.lang.String str69 = indexSettings68.getNodeName();
        boolean boolean70 = indexSettings68.isDefaultAllowUnmappedFields();
        org.elasticsearch.common.settings.Settings settings71 = indexSettings68.getSettings();
        org.elasticsearch.common.settings.Settings settings72 = indexSettings68.getSettings();
        org.elasticsearch.common.settings.Settings.Builder builder73 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder75 = builder73.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder75.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings79 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate80 = null;
        org.elasticsearch.common.settings.Settings settings81 = settings79.filter(strPredicate80);
        java.lang.String str83 = settings81.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder84 = builder75.put(settings81);
        java.util.Map<java.lang.String, java.lang.Object> strMap85 = settings81.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings settings87 = settings81.getByPrefix("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings settings89 = settings81.getAsSettings("primary_terms");
        java.util.function.Predicate<java.lang.String> strPredicate90 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings91 = settings81.filter(strPredicate90);
        org.elasticsearch.common.settings.Settings settings92 = settings72.filter(strPredicate90);
        org.elasticsearch.common.settings.Settings settings93 = settings39.filter(strPredicate90);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder94 = builder28.settings(settings93);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state37.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + boolean45 + "' != '" + false + "'", boolean45, false);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(sizeValue49);
        org.junit.Assert.assertNotNull(params51);
        org.junit.Assert.assertNull(xContentBuilder52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(indexMetaData56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(settings71);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(settings79);
        org.junit.Assert.assertNotNull(settings81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNotNull(settings87);
        org.junit.Assert.assertNotNull(settings89);
        org.junit.Assert.assertNotNull(strPredicate90);
        org.junit.Assert.assertNotNull(settings91);
        org.junit.Assert.assertNotNull(settings92);
        org.junit.Assert.assertNotNull(settings93);
        org.junit.Assert.assertNotNull(builder94);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = builder2.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass16 = builder11.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder2.put("index.number_of_shards", (java.lang.Class) wildcardClass16);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder20.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate27 = null;
        org.elasticsearch.common.settings.Settings settings28 = settings26.filter(strPredicate27);
        java.lang.String str30 = settings28.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder22.put(settings28);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = settings28.getAsMap();
        java.lang.String str35 = settings28.get("", "primary_terms");
        org.elasticsearch.common.unit.SizeValue sizeValue37 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue38 = settings28.getAsSize("state-", sizeValue37);
        org.elasticsearch.common.settings.Settings settings39 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate40 = null;
        org.elasticsearch.common.settings.Settings settings41 = settings39.filter(strPredicate40);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap42 = settings41.getAsGroups();
        org.elasticsearch.common.settings.Settings settings44 = settings41.getAsSettings("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings settings45 = indexScopedSettings19.diff(settings28, settings41);
        java.lang.Class<?> wildcardClass46 = settings45.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder17.put("index.", (java.lang.Class) wildcardClass46);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder17.normalizePrefix("index.creation_date");
        org.elasticsearch.common.settings.Settings.Builder builder51 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder51.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder53.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder53.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap59 = builder53.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder62.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder66 = builder62.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass67 = builder62.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder53.put("index.number_of_shards", (java.lang.Class) wildcardClass67);
        org.elasticsearch.common.settings.Settings.Builder builder70 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder72 = builder70.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder75 = builder72.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder72.normalizePrefix("index.blocks.read");
        java.lang.String[] strArray80 = new java.lang.String[] { "index.number_of_shards" };
        org.elasticsearch.common.settings.Settings.Builder builder81 = builder77.putArray("archived.", strArray80);
        org.elasticsearch.common.settings.Settings.Builder builder82 = builder68.extendArray("index.blocks.read", strArray80);
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder17.putArray("index.blocks.read", strArray80);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder85 = builder17.put(objDictionary84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "primary_terms" + "'", str35, "primary_terms");
        org.junit.Assert.assertNull(sizeValue38);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings8.getAsGroups();
        org.elasticsearch.index.IndexSettings indexSettings10 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings8);
        boolean boolean11 = indexSettings10.isQueryStringAnalyzeWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings.Builder builder5 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder5.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder7.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate12 = null;
        org.elasticsearch.common.settings.Settings settings13 = settings11.filter(strPredicate12);
        java.lang.String str15 = settings13.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder7.put(settings13);
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder16.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder18.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate23 = null;
        org.elasticsearch.common.settings.Settings settings24 = settings22.filter(strPredicate23);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap25 = settings24.getAsGroups();
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version29 = null;
        org.elasticsearch.Version version30 = settings24.getAsVersion("index.creation_date_string", version29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings24.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate32 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction33 = null;
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder18.putProperties(strMap31, strPredicate32, strFunction33);
        boolean boolean35 = indexMetaData0.equals((java.lang.Object) builder34);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long38 = indexMetaData0.getVersion();
        int int39 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData40);
        long long43 = indexMetaData40.primaryTerm(0);
        org.apache.lucene.util.Version version44 = indexMetaData40.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version45 = indexMetaData40.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData47 = indexMetaData40.mapping("_all");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData40);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff49 = indexMetaData0.diff(indexMetaData40);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters50 = indexMetaData40.getInitialRecoveryFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap51 = indexMetaData40.getMappings();
        int int52 = indexMetaData40.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNull(version30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strPredicate32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(version44);
        org.junit.Assert.assertNull(version45);
        org.junit.Assert.assertNull(mappingMetaData47);
        org.junit.Assert.assertNotNull(indexMetaDataDiff49);
        org.junit.Assert.assertNull(discoveryNodeFilters50);
        org.junit.Assert.assertNotNull(strImmutableOpenMap51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder0.put("_na_", "primary_terms");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = builder0.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder0.put("index.creation_date", (int) (short) 100);
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder0.putNull("index.version.created_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap15 = settings13.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue17 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue18 = settings13.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue17);
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings13);
        org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings12.dryRun(settings19);
        java.lang.String str21 = indexScopedSettings12.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long23 = indexMetaData22.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap24 = indexMetaData22.getMappings();
        int int25 = indexMetaData22.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate27 = null;
        org.elasticsearch.common.settings.Settings settings28 = settings26.filter(strPredicate27);
        java.lang.String str30 = settings28.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings28.getAsGroups();
        java.lang.String str33 = settings28.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings34 = new org.elasticsearch.index.IndexSettings(indexMetaData22, settings28);
        int int35 = indexSettings34.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting36 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue37 = indexSettings34.getValue(timeValueSetting36);
        boolean boolean38 = indexSettings34.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue39 = indexSettings34.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long41 = indexMetaData40.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap42 = indexMetaData40.getMappings();
        int int43 = indexMetaData40.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.Settings settings46 = settings44.filter(strPredicate45);
        java.lang.String str48 = settings46.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap49 = settings46.getAsGroups();
        java.lang.String str51 = settings46.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings52 = new org.elasticsearch.index.IndexSettings(indexMetaData40, settings46);
        int int53 = indexSettings52.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting54 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue55 = indexSettings52.getValue(timeValueSetting54);
        org.elasticsearch.common.unit.TimeValue timeValue56 = indexSettings34.getValue(timeValueSetting54);
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer57 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer58 = null;
        indexScopedSettings12.addSettingsUpdateConsumer(timeValueSetting54, timeValueConsumer57, timeValueConsumer58);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting61 = indexScopedSettings12.get("index.priority");
        org.elasticsearch.common.settings.Settings settings62 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap64 = settings62.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue66 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue67 = settings62.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue66);
        org.elasticsearch.common.settings.Settings settings68 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate69 = null;
        org.elasticsearch.common.settings.Settings settings70 = settings68.filter(strPredicate69);
        java.util.Set<java.lang.String> strSet71 = settings70.names();
        org.elasticsearch.common.settings.Settings settings72 = indexScopedSettings12.diff(settings62, settings70);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap73 = settings72.getAsGroups();
        org.elasticsearch.common.settings.Settings.Builder builder74 = builder11.put(settings72);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(sizeValue18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting54);
        org.junit.Assert.assertNotNull(timeValue55);
        org.junit.Assert.assertNotNull(timeValue56);
        org.junit.Assert.assertNotNull(wildcardSetting61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNull(sizeValue67);
        org.junit.Assert.assertNotNull(settings68);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings settings10 = builder9.build();
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder9.replacePropertyPlaceholders();
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder14 = builder11.loadFromStream("", inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.settings(settings24);
        java.lang.Boolean boolean30 = settings24.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = settings24.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder11.put(settings24);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = builder32.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder35 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder37.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings41 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate42 = null;
        org.elasticsearch.common.settings.Settings settings43 = settings41.filter(strPredicate42);
        java.lang.String str45 = settings43.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder37.put(settings43);
        java.lang.String[] strArray53 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder37.putArray("", (java.util.List<java.lang.String>) strList54);
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder32.putArray("hi!", (java.util.List<java.lang.String>) strList54);
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder57.putNull("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder59.putNull("_na_");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData63 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long64 = indexMetaData63.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap65 = indexMetaData63.getMappings();
        int int66 = indexMetaData63.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings67 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate68 = null;
        org.elasticsearch.common.settings.Settings settings69 = settings67.filter(strPredicate68);
        java.lang.String str71 = settings69.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap72 = settings69.getAsGroups();
        java.lang.String str74 = settings69.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings75 = new org.elasticsearch.index.IndexSettings(indexMetaData63, settings69);
        int int76 = indexSettings75.getMaxResultWindow();
        boolean boolean77 = indexSettings75.isQueryStringAnalyzeWildcard();
        boolean boolean78 = indexSettings75.isTTLPurgeDisabled();
        boolean boolean79 = indexSettings75.isWarmerEnabled();
        boolean boolean80 = indexSettings75.isOnSharedFilesystem();
        org.elasticsearch.index.translog.Translog.Durability durability81 = indexSettings75.getTranslogDurability();
        boolean boolean82 = indexSettings75.isQueryStringLenient();
        boolean boolean83 = indexSettings75.isQueryStringLenient();
        org.elasticsearch.common.unit.TimeValue timeValue84 = indexSettings75.getGlobalCheckpointInterval();
        boolean boolean85 = indexSettings75.isWarmerEnabled();
        org.elasticsearch.common.unit.TimeValue timeValue86 = indexSettings75.getTranslogSyncInterval();
        org.elasticsearch.Version version87 = indexSettings75.getIndexVersionCreated();
        org.elasticsearch.common.settings.Settings.Builder builder88 = builder59.put("index.shared_filesystem", version87);
        org.elasticsearch.common.settings.Settings.Builder builder91 = builder88.put("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994", (long) 10);
        org.elasticsearch.common.settings.Settings.Builder builder93 = builder88.normalizePrefix("index.blocks.metadata");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(indexMetaData63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertNotNull(settings69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10000 + "'", int76 == 10000);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + durability81 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability81.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(timeValue84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(timeValue86);
        org.junit.Assert.assertNotNull(version87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder93);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings.Builder builder5 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder5.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder7.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate12 = null;
        org.elasticsearch.common.settings.Settings settings13 = settings11.filter(strPredicate12);
        java.lang.String str15 = settings13.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder7.put(settings13);
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder16.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder18.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate23 = null;
        org.elasticsearch.common.settings.Settings settings24 = settings22.filter(strPredicate23);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap25 = settings24.getAsGroups();
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version29 = null;
        org.elasticsearch.Version version30 = settings24.getAsVersion("index.creation_date_string", version29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings24.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate32 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction33 = null;
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder18.putProperties(strMap31, strPredicate32, strFunction33);
        boolean boolean35 = indexMetaData0.equals((java.lang.Object) builder34);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap37 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters38 = indexMetaData0.includeFilters();
        long long39 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters40 = indexMetaData0.includeFilters();
        boolean boolean42 = indexMetaData0.isSameUUID("index.blocks.read_only");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNull(version30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strPredicate32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap37);
        org.junit.Assert.assertNull(discoveryNodeFilters38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("index.version.upgraded_string", "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder30.loadFromSource("10");
        java.io.InputStream inputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.loadFromStream("index.creation_date_string", inputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder7.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder7.put("state-", (double) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder15 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder15.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder20 = builder17.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder17.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = builder17.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder26.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass31 = builder26.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder17.put("index.number_of_shards", (java.lang.Class) wildcardClass31);
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder34.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder36.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder36.normalizePrefix("index.blocks.read");
        java.lang.String[] strArray44 = new java.lang.String[] { "index.number_of_shards" };
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder41.putArray("archived.", strArray44);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder32.extendArray("index.blocks.read", strArray44);
        org.elasticsearch.common.settings.Settings settings47 = builder32.build();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = settings47.getAsStructuredMap();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = settings47.getAsMap();
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder7.put(strMap49);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder50.normalizePrefix(".0=index.auto_expand_replicas4.1=index.shared_filesystem.recover_on_any_node4.2=index.4.3=index.auto_expand_replicas4.4=index.4index.=-14index.auto_expand_replicas.0=index.auto_expand_replicas4index.auto_expand_replicas.1=index.shared_filesystem.recover_on_any_node4index.auto_expand_replicas.2=index.4index.auto_expand_replicas.3=index.auto_expand_replicas4index.auto_expand_replicas.4=index.4index.shadow_replicas=1004index.version.upgraded_string=index.shared_filesystem4primary_terms=index.number_of_replicas4");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String str13 = builder2.get("");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder2.put("index.shared_filesystem", "index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder2.loadFromSource("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.version((long) 1);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.settings(settings24);
        int int28 = builder21.numberOfShards();
        org.elasticsearch.common.settings.Settings.Builder builder29 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder29.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder31.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate36 = null;
        org.elasticsearch.common.settings.Settings settings37 = settings35.filter(strPredicate36);
        java.lang.String str39 = settings37.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder31.put(settings37);
        org.elasticsearch.common.settings.Settings settings42 = settings37.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet43 = settings37.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder21.settings(settings37);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state45 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder21.state(state45);
        java.lang.Class<?> wildcardClass47 = builder21.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder2.put("index.uuid", (java.lang.Class) wildcardClass47);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder2.put("index.shared_filesystem", true);
        org.elasticsearch.common.settings.Settings settings53 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate54 = null;
        org.elasticsearch.common.settings.Settings settings55 = settings53.filter(strPredicate54);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap56 = settings55.getAsGroups();
        org.elasticsearch.common.settings.Settings settings58 = settings55.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version60 = null;
        org.elasticsearch.Version version61 = settings55.getAsVersion("index.creation_date_string", version60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = settings55.getAsMap();
        java.lang.String[] strArray65 = new java.lang.String[] { "index.version.created" };
        java.lang.String[] strArray67 = settings55.getAsArray("index.creation_date_string", strArray65, (java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder51.extendArray("", strArray65);
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder51.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder72 = builder69.put("index.data_path", (long) 0);
        org.elasticsearch.common.settings.Settings settings73 = builder69.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + state45 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state45.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNull(version61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(settings73);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        boolean boolean13 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue14 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.elasticsearch.common.unit.TimeValue timeValue16 = indexSettings12.getRefreshInterval();
        boolean boolean17 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.Version version18 = indexSettings12.getIndexVersionCreated();
        boolean boolean19 = indexSettings12.hasCustomDataPath();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteSizeValue14);
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder13.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.version.upgraded", 10L);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder19.normalizePrefix("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("-1", (long) ' ');
        org.elasticsearch.common.settings.Settings.Builder builder25 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder25.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate32 = null;
        org.elasticsearch.common.settings.Settings settings33 = settings31.filter(strPredicate32);
        java.lang.String str35 = settings33.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder27.put(settings33);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = settings33.getAsMap();
        java.lang.String str40 = settings33.get("", "primary_terms");
        org.elasticsearch.common.settings.Settings.Builder builder41 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder41.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder43.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate48 = null;
        org.elasticsearch.common.settings.Settings settings49 = settings47.filter(strPredicate48);
        java.lang.String str51 = settings49.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder43.put(settings49);
        java.lang.String[] strArray59 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        org.elasticsearch.common.settings.Settings.Builder builder62 = builder43.putArray("", (java.util.List<java.lang.String>) strList60);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder62.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder65.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder70 = builder68.loadFromSource("state-");
        boolean boolean71 = settings33.equals((java.lang.Object) builder68);
        org.elasticsearch.common.settings.Settings.Builder builder72 = builder21.put(settings33);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "primary_terms" + "'", str40, "primary_terms");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder24.normalizePrefix("");
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder24.put("index.blocks.read", "index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long31 = indexMetaData30.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap32 = indexMetaData30.getMappings();
        int int33 = indexMetaData30.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap34 = indexMetaData30.getActiveAllocationIds();
        org.elasticsearch.Version version35 = indexMetaData30.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData30.requireFilters();
        long long37 = indexMetaData30.getCreationDate();
        org.elasticsearch.Version version38 = indexMetaData30.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings39 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap41 = settings39.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue43 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue44 = settings39.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue43);
        java.lang.Boolean boolean47 = settings39.getAsBoolean("archived.", (java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings49 = settings39.getAsSettings("state-");
        org.elasticsearch.index.IndexSettings indexSettings50 = new org.elasticsearch.index.IndexSettings(indexMetaData30, settings39);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder24.put(settings39);
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate53 = null;
        org.elasticsearch.common.settings.Settings settings54 = settings52.filter(strPredicate53);
        java.lang.String str56 = settings54.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder51.put(settings54);
        java.io.InputStream inputStream59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder60 = builder57.loadFromStream("_na_", inputStream59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap34);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(version38);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(sizeValue44);
        org.junit.Assert.assertEquals("'" + boolean47 + "' != '" + false + "'", boolean47, false);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.settings(settings24);
        java.lang.Boolean boolean30 = settings24.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = settings24.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder11.put(settings24);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder32.normalizePrefix("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.version.minimum_compatible", 10000);
        org.elasticsearch.common.settings.Settings.Builder builder38 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder38.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder40.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder40.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder45.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder45.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder45.put("archived.", (double) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder45.normalizePrefix("index.version.minimum_compatible");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = builder54.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder34.put(strMap55);
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder56.loadFromSource("index.blocks.read=nullaindex.blocks.read_only=nullaindex.blocks.readprimary_terms=index.number_of_replicasa");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig14 = indexSettings12.getMergeSchedulerConfig();
        org.elasticsearch.common.settings.Settings settings15 = indexSettings12.getSettings();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig16 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version10 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version12 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder25.removeAlias("");
        org.elasticsearch.common.settings.Settings.Builder builder28 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder28.putNull("");
        java.lang.String str32 = builder30.remove("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder25.settings(builder30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state34 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        byte byte35 = state34.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder25.state(state34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder13.state(state34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.numberOfShards((int) (byte) 1);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + state34 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state34.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.apache.lucene.index.MergePolicy mergePolicy16 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getGlobalCheckpointInterval();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue18 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher19 = indexSettings12.getParseFieldMatcher();
        java.lang.Class<?> wildcardClass20 = indexSettings12.getClass();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergePolicy16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(byteSizeValue18);
        org.junit.Assert.assertNotNull(parseFieldMatcher19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long4 = indexMetaData3.getVersion();
        org.elasticsearch.Version version5 = indexMetaData3.getUpgradedVersion();
        boolean boolean6 = indexMetaData0.equals((java.lang.Object) indexMetaData3);
        org.apache.lucene.util.Version version7 = indexMetaData3.getMinimumCompatibleVersion();
        long long8 = indexMetaData3.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData3.getCustoms();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData3.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        java.lang.String str15 = indexSettings12.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig16 = indexSettings12.getMergeSchedulerConfig();
        java.lang.String str17 = indexSettings12.customDataPath();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        java.lang.String str19 = indexSettings12.customDataPath();
        boolean boolean20 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean22 = indexSettings12.matchesIndexName("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_all" + "'", str15, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder21.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder21.put("index.creation_date_string", (int) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder21.putNull("");
        java.lang.String str32 = builder21.get("active_allocations");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData7.getMappings();
        int int10 = indexMetaData7.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData7.activeAllocationIds((int) (short) -1);
        int int13 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData7.includeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters16 = indexMetaData7.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertNull(discoveryNodeFilters16);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.index.translog.Translog.Durability durability18 = indexSettings12.getTranslogDurability();
        boolean boolean19 = indexSettings12.isQueryStringLenient();
        boolean boolean20 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.common.unit.TimeValue timeValue21 = indexSettings12.getGlobalCheckpointInterval();
        boolean boolean22 = indexSettings12.isOnSharedFilesystem();
        java.lang.String str23 = indexSettings12.getNodeName();
        java.lang.String str24 = indexSettings12.getUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = indexSettings12.getIndexMetaData();
        org.elasticsearch.index.Index index26 = indexMetaData25.getMergeSourceIndex();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData25.writeTo(streamOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + durability18 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability18.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_na_" + "'", str24, "_na_");
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertNull(index26);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getRefreshInterval();
        org.elasticsearch.common.unit.TimeValue timeValue18 = indexSettings12.getRefreshInterval();
        boolean boolean19 = indexSettings12.isShadowReplicaIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        int int14 = indexSettings12.getMaxResultWindow();
        org.apache.lucene.index.MergePolicy mergePolicy15 = indexSettings12.getMergePolicy();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        long long17 = indexMetaData16.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(mergePolicy15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        long long5 = builder4.version();
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.putAlias(builder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder13.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.version.upgraded", 10L);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder21 = builder19.put(objDictionary20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder6 = builder2.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings settings8 = builder7.build();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = settings8.toXContent(xContentBuilder9, params10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(settings8);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.includeFilters();
        int int7 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        org.elasticsearch.common.settings.Settings settings23 = settings18.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet24 = settings23.names();
        org.elasticsearch.common.settings.Settings settings26 = settings23.getByPrefix("index.number_of_replicas");
        indexScopedSettings8.validate("index.data_path", settings23);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.version((long) 1);
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate33 = null;
        org.elasticsearch.common.settings.Settings settings34 = settings32.filter(strPredicate33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder29.settings(settings32);
        org.elasticsearch.common.settings.Settings settings37 = settings32.getAsSettings("hi!");
        org.elasticsearch.common.unit.SizeValue sizeValue39 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue40 = settings32.getAsSize("primary_terms", sizeValue39);
        boolean boolean41 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings32);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData42 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long43 = indexMetaData42.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap44 = indexMetaData42.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData45 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long46 = indexMetaData45.getVersion();
        org.elasticsearch.Version version47 = indexMetaData45.getUpgradedVersion();
        boolean boolean48 = indexMetaData42.equals((java.lang.Object) indexMetaData45);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings49 = indexScopedSettings8.copy(settings32, indexMetaData45);
        long long50 = indexMetaData45.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff51 = indexMetaData0.diff(indexMetaData45);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap52 = indexMetaData45.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData45);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNull(sizeValue40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(indexMetaData42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap44);
        org.junit.Assert.assertNotNull(indexMetaData45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff51);
        org.junit.Assert.assertNotNull(strImmutableOpenMap52);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        int int3 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = indexMetaData0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder8 = builder5.put("index.auto_expand_replicas", "hi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "index.blocks.read_only", "", "index.number_of_replicas", "index.blocks.read", "index.blocks.read", "index.blocks.read" };
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder8.putArray("index.auto_expand_replicas", strArray16);
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings19.getAsGroups(false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap23 = settings19.getGroups("index.shared_filesystem");
        java.lang.String[] strArray25 = settings19.getAsArray("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder17.putArray("index.version.upgraded", strArray25);
        org.elasticsearch.common.settings.Settings.Builder builder27 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder27.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder29.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder29.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = builder29.internalMap();
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder29.put(objArray36);
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder26.put(objArray36);
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder38.put("index.blocks.read_only", (float) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData43 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData43);
        long long46 = indexMetaData43.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData47 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int48 = indexMetaData47.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff49 = indexMetaData43.diff(indexMetaData47);
        java.util.Set<java.lang.String> strSet51 = null; // flaky: indexMetaData43.activeAllocationIds(1);
        long long52 = indexMetaData43.getCreationDate();
        org.elasticsearch.Version version53 = indexMetaData43.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData43);
        java.lang.Class<?> wildcardClass55 = builder54.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder41.put("archived.", (java.lang.Class) wildcardClass55);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings58 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings59 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap61 = settings59.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue63 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue64 = settings59.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue63);
        org.elasticsearch.common.settings.Settings settings65 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings59);
        org.elasticsearch.common.settings.Settings settings66 = indexScopedSettings58.dryRun(settings65);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData68 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long69 = indexMetaData68.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap70 = indexMetaData68.getMappings();
        int int71 = indexMetaData68.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings72 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate73 = null;
        org.elasticsearch.common.settings.Settings settings74 = settings72.filter(strPredicate73);
        java.lang.String str76 = settings74.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap77 = settings74.getAsGroups();
        java.lang.String str79 = settings74.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings80 = new org.elasticsearch.index.IndexSettings(indexMetaData68, settings74);
        java.lang.String str81 = indexSettings80.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData82 = indexSettings80.getIndexMetaData();
        org.elasticsearch.Version version83 = indexMetaData82.getUpgradedVersion();
        org.elasticsearch.Version version84 = settings66.getAsVersion("active_allocations", version83);
        java.lang.Class<?> wildcardClass85 = version83.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder86 = builder56.put("index.version.created", (java.lang.Class) wildcardClass85);
        java.util.concurrent.TimeUnit timeUnit89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder90 = builder56.put("", 0L, timeUnit89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(indexMetaData43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff49);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(indexScopedSettings58);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(sizeValue64);
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertNotNull(indexMetaData68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(settings74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(indexMetaData82);
        org.junit.Assert.assertNotNull(version83);
        org.junit.Assert.assertNotNull(version84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.elasticsearch.Version version16 = indexSettings12.getIndexVersionCreated();
        boolean boolean17 = indexSettings12.isQueryStringLenient();
        boolean boolean18 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue19 = indexSettings12.getFlushThresholdSize();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteSizeValue19);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isTTLPurgeDisabled();
        int int17 = indexSettings12.getMaxResultWindow();
        org.elasticsearch.Version version18 = indexSettings12.getIndexVersionCreated();
        int int19 = indexSettings12.getNumberOfShards();
        boolean boolean20 = indexSettings12.isWarmerEnabled();
        boolean boolean21 = indexSettings12.hasCustomDataPath();
        boolean boolean22 = indexSettings12.isDefaultAllowUnmappedFields();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        java.lang.String str17 = indexSettings12.getUUID();
        org.apache.lucene.index.MergePolicy mergePolicy18 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings12.getRefreshInterval();
        boolean boolean20 = indexSettings12.isWarmerEnabled();
        int int21 = indexSettings12.getMaxResultWindow();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(mergePolicy18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        boolean boolean14 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean15 = indexSettings12.isWarmerEnabled();
        java.lang.String str16 = indexSettings12.getUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_na_" + "'", str16, "_na_");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher16 = indexSettings12.getParseFieldMatcher();
        boolean boolean17 = indexSettings12.isQueryStringLenient();
        boolean boolean18 = indexSettings12.isQueryStringAnalyzeWildcard();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig19 = indexSettings12.getMergeSchedulerConfig();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexSettings12.getIndexMetaData();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(parseFieldMatcher16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig19);
        org.junit.Assert.assertNotNull(indexMetaData20);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = builder2.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass16 = builder11.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder2.put("index.number_of_shards", (java.lang.Class) wildcardClass16);
        org.elasticsearch.common.settings.Settings.Builder builder19 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder19.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder21.normalizePrefix("index.blocks.read");
        java.lang.String[] strArray29 = new java.lang.String[] { "index.number_of_shards" };
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder26.putArray("archived.", strArray29);
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder17.extendArray("index.blocks.read", strArray29);
        java.lang.String str33 = builder31.get("false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        int int4 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        long long6 = indexMetaData0.getVersion();
        org.elasticsearch.Version version7 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.includeFilters();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = settings18.getAsStructuredMap();
        java.lang.String str24 = settings18.toDelimitedString('a');
        boolean boolean25 = settings18.isEmpty();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate28 = null;
        org.elasticsearch.common.settings.Settings settings29 = settings27.filter(strPredicate28);
        java.lang.String str31 = settings29.toDelimitedString('#');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = settings29.getAsMap();
        org.elasticsearch.common.settings.Settings settings33 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings29);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = null;
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.util.Map<java.lang.String, java.lang.String> strMap36 = settings35.getAsMap();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params38 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder39 = settings35.toXContent(xContentBuilder37, params38);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder40 = settings33.toXContent(xContentBuilder34, params38);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder41 = settings18.toXContent(xContentBuilder26, params38);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder9, params38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(version7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(params38);
        org.junit.Assert.assertNull(xContentBuilder39);
        org.junit.Assert.assertNull(xContentBuilder40);
        org.junit.Assert.assertNull(xContentBuilder41);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig14 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean15 = indexSettings12.isWarmerEnabled();
        org.elasticsearch.Version version16 = indexSettings12.getIndexVersionCreated();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue17 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.common.unit.TimeValue timeValue18 = indexSettings12.getRefreshInterval();
        org.apache.lucene.index.MergePolicy mergePolicy19 = indexSettings12.getMergePolicy();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(byteSizeValue17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(mergePolicy19);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putMapping("1", "index.shared_filesystem");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to derive xcontent");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.index.Index index4 = indexMetaData0.getMergeSourceIndex();
        int int5 = indexMetaData0.getNumberOfShards();
        long long6 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap7 = indexMetaData0.getCustoms();
        org.elasticsearch.index.Index index8 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData0.getMappings();
        org.elasticsearch.Version version10 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap11 = indexMetaData0.getCustoms();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = null;
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate14 = null;
        org.elasticsearch.common.settings.Settings settings15 = settings13.filter(strPredicate14);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap16 = settings15.getAsGroups();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params18 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = settings15.toXContent(xContentBuilder17, params18);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData20.getMappings();
        int int22 = indexMetaData20.getNumberOfShards();
        long long23 = indexMetaData20.getCreationDate();
        boolean boolean24 = settings15.equals((java.lang.Object) long23);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long27 = indexMetaData26.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap28 = indexMetaData26.getMappings();
        int int29 = indexMetaData26.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        java.lang.String str34 = settings32.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings32.getAsGroups();
        java.lang.String str37 = settings32.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings38 = new org.elasticsearch.index.IndexSettings(indexMetaData26, settings32);
        int int39 = indexSettings38.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting40 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue41 = indexSettings38.getValue(timeValueSetting40);
        int int42 = indexSettings38.getMaxRescoreWindow();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue43 = indexSettings38.getFlushThresholdSize();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue44 = settings15.getAsBytesSize("state-", byteSizeValue43);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData46 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData46);
        long long49 = indexMetaData46.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData50 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int51 = indexMetaData50.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff52 = indexMetaData46.diff(indexMetaData50);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData46);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData55 = indexMetaData46.mapping("index.number_of_shards");
        org.elasticsearch.common.settings.Settings settings56 = indexMetaData46.getSettings();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap59 = settings56.getGroups("index.", true);
        java.lang.String str61 = settings56.get("active_allocations");
        java.lang.String str63 = settings56.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings65 = settings56.getByPrefix("index.number_of_replicas=0#index.number_of_shards=1#index.version.created=5000099#");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder66 = null;
        org.elasticsearch.common.settings.Settings settings67 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap69 = settings67.getAsGroups(false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap71 = settings67.getGroups("index.shared_filesystem");
        java.lang.String[] strArray73 = settings67.getAsArray("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder74 = null;
        org.elasticsearch.common.settings.Settings settings75 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate76 = null;
        org.elasticsearch.common.settings.Settings settings77 = settings75.filter(strPredicate76);
        java.lang.String str79 = settings77.toDelimitedString('#');
        java.util.Map<java.lang.String, java.lang.String> strMap80 = settings77.getAsMap();
        org.elasticsearch.common.settings.Settings settings81 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings77);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder82 = null;
        org.elasticsearch.common.settings.Settings settings83 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.util.Map<java.lang.String, java.lang.String> strMap84 = settings83.getAsMap();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder85 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params86 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder87 = settings83.toXContent(xContentBuilder85, params86);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder88 = settings81.toXContent(xContentBuilder82, params86);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder89 = settings67.toXContent(xContentBuilder74, params86);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder90 = settings65.toXContent(xContentBuilder66, params86);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder91 = settings15.toXContent(xContentBuilder45, params86);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder92 = indexMetaData0.toXContent(xContentBuilder12, params86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(index4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNull(index8);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(params18);
        org.junit.Assert.assertNull(xContentBuilder19);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting40);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertNotNull(byteSizeValue43);
        org.junit.Assert.assertNotNull(byteSizeValue44);
        org.junit.Assert.assertNotNull(indexMetaData46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(mappingMetaData55);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994" + "'", str63, "index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994");
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertNotNull(settings67);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(settings75);
        org.junit.Assert.assertNotNull(settings77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(settings81);
        org.junit.Assert.assertNotNull(settings83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(params86);
        org.junit.Assert.assertNull(xContentBuilder87);
        org.junit.Assert.assertNull(xContentBuilder88);
        org.junit.Assert.assertNull(xContentBuilder89);
        org.junit.Assert.assertNull(xContentBuilder90);
        org.junit.Assert.assertNull(xContentBuilder91);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate11 = null;
        org.elasticsearch.common.settings.Settings settings12 = settings10.filter(strPredicate11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.settings(settings10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putCustom("state-", custom15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder13.numberOfReplicas((int) (byte) 1);
        int int19 = builder18.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder18.version(10L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom23 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder21.putCustom("index.number_of_replicas=0#index.number_of_shards=1#index.version.created=5000099#", custom23);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long26 = indexMetaData25.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap27 = indexMetaData25.getMappings();
        int int28 = indexMetaData25.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate30 = null;
        org.elasticsearch.common.settings.Settings settings31 = settings29.filter(strPredicate30);
        java.lang.String str33 = settings31.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap34 = settings31.getAsGroups();
        java.lang.String str36 = settings31.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings37 = new org.elasticsearch.index.IndexSettings(indexMetaData25, settings31);
        java.lang.String str38 = indexSettings37.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData39 = indexSettings37.getIndexMetaData();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = indexMetaData39.mappingOrDefault("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder42 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder42.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder44.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings48 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate49 = null;
        org.elasticsearch.common.settings.Settings settings50 = settings48.filter(strPredicate49);
        java.lang.String str52 = settings50.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder44.put(settings50);
        org.elasticsearch.common.settings.Settings settings55 = settings50.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet56 = settings55.names();
        java.lang.String[] strArray58 = settings55.getAsArray("index.shared_filesystem");
        org.elasticsearch.index.IndexSettings indexSettings59 = new org.elasticsearch.index.IndexSettings(indexMetaData39, settings55);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData39);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state61 = indexMetaData39.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder24.state(state61);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder24.putAlias(builder63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(indexMetaData39);
        org.junit.Assert.assertNull(mappingMetaData41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + state61 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state61.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = builder2.internalMap();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder2.put(objArray9);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder10.put("index.blocks.read", (double) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder13.put("index.blocks.metadata", "");
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("archived.", (double) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = builder19.internalMap();
        org.elasticsearch.common.settings.Settings settings21 = builder19.build();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap22 = settings21.getAsGroups();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder2.put("index.blocks.read", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = builder10.internalMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.index.translog.Translog.Durability durability18 = indexSettings12.getTranslogDurability();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = indexSettings12.getIndexMetaData();
        int int20 = indexSettings12.getMaxRescoreWindow();
        boolean boolean22 = indexSettings12.matchesIndexName("index.number_of_shards");
        java.lang.String str23 = indexSettings12.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig24 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean25 = indexSettings12.isDefaultAllowUnmappedFields();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue26 = indexSettings12.getFlushThresholdSize();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + durability18 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability18.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_all" + "'", str23, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteSizeValue26);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder26.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder28.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate33 = null;
        org.elasticsearch.common.settings.Settings settings34 = settings32.filter(strPredicate33);
        java.lang.String str36 = settings34.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder28.put(settings34);
        java.lang.String[] strArray44 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder28.putArray("", (java.util.List<java.lang.String>) strList45);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder50.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder54 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder54.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder56.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder56.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = builder56.internalMap();
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder56.put(objArray63);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder50.put(objArray63);
        org.elasticsearch.common.settings.Settings.Builder builder66 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder66.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder71 = builder68.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings72 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate73 = null;
        org.elasticsearch.common.settings.Settings settings74 = settings72.filter(strPredicate73);
        java.lang.String str76 = settings74.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder68.put(settings74);
        org.elasticsearch.common.settings.Settings settings79 = settings74.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet80 = settings79.names();
        java.lang.String[] strArray82 = settings79.getAsArray("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder65.put(settings79);
        java.lang.Class<?> wildcardClass84 = builder65.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder85 = builder21.put("active_allocations", (java.lang.Class) wildcardClass84);
        org.elasticsearch.common.settings.Settings.Builder builder87 = builder85.putNull("primary_terms");
        org.elasticsearch.common.settings.Settings settings88 = builder87.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(settings74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(settings79);
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(settings88);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfReplicas((int) (byte) 10);
        int int8 = builder7.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int13 = builder12.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder12.index("index.version.upgraded");
        int int16 = builder15.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder15.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData20 = builder18.mapping("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state21 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder18.state(state21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder7.state(state21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder23.removeAlias("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.version((-1L));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.version((long) 1);
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate33 = null;
        org.elasticsearch.common.settings.Settings settings34 = settings32.filter(strPredicate33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder29.settings(settings32);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder35.state(state36);
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate39 = null;
        org.elasticsearch.common.settings.Settings settings40 = settings38.filter(strPredicate39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder37.settings(settings38);
        java.lang.Boolean boolean44 = settings38.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = settings38.getAsStructuredMap();
        org.elasticsearch.common.unit.SizeValue sizeValue47 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue48 = settings38.getAsSize("state-", sizeValue47);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder49 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params50 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder51 = settings38.toXContent(xContentBuilder49, params50);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = settings38.getAsStructuredMap();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap55 = settings38.getGroups("active_allocations", true);
        boolean boolean56 = settings38.isEmpty();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder23.settings(settings38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder23.removeAlias("index.version.created");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(mappingMetaData20);
        org.junit.Assert.assertTrue("'" + state21 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state21.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state36.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + boolean44 + "' != '" + false + "'", boolean44, false);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(sizeValue48);
        org.junit.Assert.assertNotNull(params50);
        org.junit.Assert.assertNull(xContentBuilder51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.settings(settings5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.removeAlias("index.number_of_replicas=0aindex.number_of_shards=1aindex.version.created=5000099a");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.index.translog.Translog.Durability durability14 = indexSettings12.getTranslogDurability();
        boolean boolean15 = indexSettings12.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + durability14 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability14.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(indexMetaData16);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.numberOfShards((int) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.numberOfReplicas((int) (short) 0);
        int int8 = builder7.numberOfReplicas();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(version8);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.apache.lucene.index.MergePolicy mergePolicy16 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher17 = indexSettings12.getParseFieldMatcher();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexSettings12.getIndexMetaData();
        boolean boolean19 = indexSettings12.isQueryStringAllowLeadingWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergePolicy16);
        org.junit.Assert.assertNotNull(parseFieldMatcher17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getRefreshInterval();
        java.lang.String str16 = indexSettings12.customDataPath();
        boolean boolean17 = indexSettings12.isTTLPurgeDisabled();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder21.put("primary_terms", (float) (byte) 100);
        java.util.concurrent.TimeUnit timeUnit30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder31 = builder21.put("index.shadow_replicas", 0L, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int11 = builder10.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.version((long) 1);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.settings(settings24);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state28 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.state(state28);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder29.settings(settings30);
        boolean boolean34 = settings30.isEmpty();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings30.getAsGroups();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder19.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder13.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap39 = indexMetaData38.getMappings();
        int int40 = indexMetaData38.getNumberOfShards();
        long long41 = indexMetaData38.getVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings42 = indexScopedSettings0.copy(settings30, indexMetaData38);
        java.lang.String str43 = indexScopedSettings0.nodeName();
        boolean boolean45 = indexScopedSettings0.hasDynamicSetting("index.version.created_string");
        org.elasticsearch.common.settings.Setting.Property property46 = indexScopedSettings0.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData47 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int48 = indexMetaData47.getTotalNumberOfShards();
        org.elasticsearch.Version version49 = indexMetaData47.getCreationVersion();
        long long50 = indexMetaData47.getVersion();
        org.elasticsearch.common.settings.Settings settings51 = indexMetaData47.getSettings();
        org.elasticsearch.common.settings.Settings settings52 = indexScopedSettings0.applySettings(settings51);
        org.elasticsearch.common.settings.Settings settings54 = settings51.getAsSettings("index.blocks.read");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.unit.ByteSizeValue byteSizeValue57 = settings51.getAsMemory("index.blocks.read.0=index.number_of_shards4index.blocks.readprimary_terms=index.number_of_replicas4index.number_of_shards=org.elasticsearch.cluster.metadata.IndexMetaData$Builder4", "index.data_path");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse setting [index.blocks.read.0=index.number_of_shards4index.blocks.readprimary_terms=index.number_of_replicas4index.number_of_shards=org.elasticsearch.cluster.metadata.IndexMetaData$Builder4] with value [index.data_path] as a size in bytes: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state28.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertNotNull(strImmutableOpenMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(indexScopedSettings42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + property46 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property46.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexMetaData47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData0.getState();
        int int5 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.apache.lucene.util.Version version7 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap9 = indexMetaData0.getActiveAllocationIds();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNull(version7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap9);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate11 = null;
        org.elasticsearch.common.settings.Settings settings12 = settings10.filter(strPredicate11);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap13 = settings12.getAsGroups();
        org.elasticsearch.common.settings.Settings settings15 = settings12.getAsSettings("index.auto_expand_replicas");
        boolean boolean16 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        org.elasticsearch.common.settings.Settings settings18 = settings12.getAsSettings("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long20 = indexMetaData19.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData19.getMappings();
        int int22 = indexMetaData19.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        java.lang.String str27 = settings25.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap28 = settings25.getAsGroups();
        java.lang.String str30 = settings25.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings31 = new org.elasticsearch.index.IndexSettings(indexMetaData19, settings25);
        java.lang.String str32 = indexSettings31.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = indexSettings31.getIndexMetaData();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap34 = indexMetaData33.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData33);
        org.apache.lucene.util.Version version36 = indexMetaData33.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings37 = indexScopedSettings0.copy(settings18, indexMetaData33);
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap38 = indexMetaData33.getActiveAllocationIds();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder39 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder41 = indexMetaData33.toXContent(xContentBuilder39, params40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(version36);
        org.junit.Assert.assertNotNull(indexScopedSettings37);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap38);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.state(state12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        java.lang.String str15 = indexSettings12.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher16 = indexSettings12.getParseFieldMatcher();
        org.apache.lucene.index.MergePolicy mergePolicy17 = indexSettings12.getMergePolicy();
        boolean boolean19 = indexSettings12.matchesIndexName("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings settings20 = indexSettings12.getSettings();
        int int21 = indexSettings12.getMaxResultWindow();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long23 = indexMetaData22.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap24 = indexMetaData22.getMappings();
        int int25 = indexMetaData22.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate27 = null;
        org.elasticsearch.common.settings.Settings settings28 = settings26.filter(strPredicate27);
        java.lang.String str30 = settings28.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings28.getAsGroups();
        java.lang.String str33 = settings28.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings34 = new org.elasticsearch.index.IndexSettings(indexMetaData22, settings28);
        int int35 = indexSettings34.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting36 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue37 = indexSettings34.getValue(timeValueSetting36);
        boolean boolean38 = indexSettings34.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue39 = indexSettings34.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData40 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long41 = indexMetaData40.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap42 = indexMetaData40.getMappings();
        int int43 = indexMetaData40.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings44 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.Settings settings46 = settings44.filter(strPredicate45);
        java.lang.String str48 = settings46.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap49 = settings46.getAsGroups();
        java.lang.String str51 = settings46.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings52 = new org.elasticsearch.index.IndexSettings(indexMetaData40, settings46);
        int int53 = indexSettings52.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting54 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue55 = indexSettings52.getValue(timeValueSetting54);
        org.elasticsearch.common.unit.TimeValue timeValue56 = indexSettings34.getValue(timeValueSetting54);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData57 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long58 = indexMetaData57.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap59 = indexMetaData57.getMappings();
        int int60 = indexMetaData57.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings61 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate62 = null;
        org.elasticsearch.common.settings.Settings settings63 = settings61.filter(strPredicate62);
        java.lang.String str65 = settings63.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap66 = settings63.getAsGroups();
        java.lang.String str68 = settings63.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings69 = new org.elasticsearch.index.IndexSettings(indexMetaData57, settings63);
        int int70 = indexSettings69.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting71 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue72 = indexSettings69.getValue(timeValueSetting71);
        org.elasticsearch.common.unit.TimeValue timeValue73 = indexSettings34.getValue(timeValueSetting71);
        org.elasticsearch.common.unit.TimeValue timeValue74 = indexSettings12.getValue(timeValueSetting71);
        org.apache.lucene.index.MergePolicy mergePolicy75 = indexSettings12.getMergePolicy();
        int int76 = indexSettings12.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher16);
        org.junit.Assert.assertNotNull(mergePolicy17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(indexMetaData40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting54);
        org.junit.Assert.assertNotNull(timeValue55);
        org.junit.Assert.assertNotNull(timeValue56);
        org.junit.Assert.assertNotNull(indexMetaData57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting71);
        org.junit.Assert.assertNotNull(timeValue72);
        org.junit.Assert.assertNotNull(timeValue73);
        org.junit.Assert.assertNotNull(timeValue74);
        org.junit.Assert.assertNotNull(mergePolicy75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.apache.lucene.index.MergePolicy mergePolicy16 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher17 = indexSettings12.getParseFieldMatcher();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap19 = indexMetaData18.getCustoms();
        java.util.Set<java.lang.String> strSet21 = null; // flaky: indexMetaData18.activeAllocationIds(10000);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData22);
        org.elasticsearch.Version version24 = indexMetaData22.getUpgradedVersion();
        boolean boolean26 = indexMetaData22.isSameUUID("state-");
        int int27 = indexMetaData22.getNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap28 = indexMetaData22.getActiveAllocationIds();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff29 = indexMetaData18.diff(indexMetaData22);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData22.writeTo(streamOutput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergePolicy16);
        org.junit.Assert.assertNotNull(parseFieldMatcher17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(indexMetaData22);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap28);
        org.junit.Assert.assertNotNull(indexMetaDataDiff29);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isIndexUsingShadowReplicas();
        boolean boolean18 = indexSettings12.isQueryStringLenient();
        int int19 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig20 = indexSettings12.getMergeSchedulerConfig();
        java.lang.String str21 = indexSettings12.customDataPath();
        java.lang.String str22 = indexSettings12.getUUID();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_na_" + "'", str22, "_na_");
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 0);
        long long4 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.version(1L);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = builder1.mapping("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.version((long) 1);
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate14 = null;
        org.elasticsearch.common.settings.Settings settings15 = settings13.filter(strPredicate14);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder10.settings(settings13);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state17 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder16.state(state17);
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate20 = null;
        org.elasticsearch.common.settings.Settings settings21 = settings19.filter(strPredicate20);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder18.settings(settings19);
        java.lang.String str23 = builder22.index();
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder24.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder26.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = builder26.internalMap();
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder26.put(objArray33);
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.blocks.read", (double) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder34.normalizePrefix("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder22.settings(builder34);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder34.put("state-", 0L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder1.settings(builder34);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData46 = builder1.mapping("0");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + state17 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state17.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "primary_terms" + "'", str23, "primary_terms");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(mappingMetaData46);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings9.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue13 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue14 = settings9.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue13);
        java.lang.Boolean boolean17 = settings9.getAsBoolean("archived.", (java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings19 = settings9.getAsSettings("state-");
        org.elasticsearch.index.IndexSettings indexSettings20 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings9);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters22 = indexMetaData0.includeFilters();
        java.util.Set<java.lang.String> strSet24 = indexMetaData0.activeAllocationIds((int) (short) 0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData26 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(sizeValue14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNull(discoveryNodeFilters22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(mappingMetaData26);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean18 = indexSettings12.matchesIndexName("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.settings.Settings settings20 = indexSettings12.getSettings();
        boolean boolean21 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings20);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfReplicas((int) (byte) 10);
        int int8 = builder7.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.putCustom("index.blocks.write", custom10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("");
        org.elasticsearch.common.settings.Settings.Builder builder14 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder14.putNull("");
        java.lang.String str18 = builder16.remove("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder11.settings(builder16);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder20.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate27 = null;
        org.elasticsearch.common.settings.Settings settings28 = settings26.filter(strPredicate27);
        java.lang.String str30 = settings28.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder22.put(settings28);
        java.lang.String[] strArray38 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder22.putArray("", (java.util.List<java.lang.String>) strList39);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder41.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder41.replacePropertyPlaceholders();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder11.settings(builder41);
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder41.loadFromSource("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("_all", (int) (byte) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfReplicas((int) (byte) 10);
        int int8 = builder7.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.version((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder12.numberOfShards((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder12.creationDate((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder12.numberOfReplicas((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.metadata");
        org.elasticsearch.common.settings.Settings.Builder builder2 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder2.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate9 = null;
        org.elasticsearch.common.settings.Settings settings10 = settings8.filter(strPredicate9);
        java.lang.String str12 = settings10.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder4.put(settings10);
        java.lang.String[] strArray20 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder4.putArray("", (java.util.List<java.lang.String>) strList21);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder23.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder28 = builder26.normalizePrefix("");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder26.put("index.blocks.read", "index.version.upgraded");
        java.lang.String str33 = builder26.get("index.creation_date");
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder26.normalizePrefix("index.blocks.metadata");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder1.settings(builder35);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder36.putMapping(mappingMetaData37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.version((long) 1);
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder3.settings(settings6);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.state(state10);
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate13 = null;
        org.elasticsearch.common.settings.Settings settings14 = settings12.filter(strPredicate13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.settings(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = builder11.putCustom("", custom17);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.version((long) 1);
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder20.settings(settings23);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state27 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.state(state27);
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate30 = null;
        org.elasticsearch.common.settings.Settings settings31 = settings29.filter(strPredicate30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder28.settings(settings29);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom34 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder32.putCustom("state-", custom34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder32.numberOfReplicas((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int40 = builder39.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.index("index.version.upgraded");
        int int43 = builder42.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder42.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData47 = builder45.mapping("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state48 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder49 = builder45.state(state48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder37.state(state48);
        byte byte51 = state48.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder18.state(state48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder53 = builder1.state(state48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = builder53.removeAlias("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder53.version((long) 32);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData58 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData58);
        long long61 = indexMetaData58.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData62 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int63 = indexMetaData62.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff64 = indexMetaData58.diff(indexMetaData62);
        java.util.Set<java.lang.String> strSet66 = null; // flaky: indexMetaData58.activeAllocationIds(1);
        long long67 = indexMetaData58.getCreationDate();
        org.elasticsearch.Version version68 = indexMetaData58.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData58);
        org.apache.lucene.util.Version version70 = indexMetaData58.getMinimumCompatibleVersion();
        org.elasticsearch.Version version71 = indexMetaData58.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters72 = indexMetaData58.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state73 = indexMetaData58.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder74 = builder57.state(state73);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + state27 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state27.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(mappingMetaData47);
        org.junit.Assert.assertTrue("'" + state48 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state48.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 0 + "'", byte51 == (byte) 0);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(indexMetaData58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff64);
        org.junit.Assert.assertNull(strSet66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertNotNull(version68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(version70);
        org.junit.Assert.assertNotNull(version71);
        org.junit.Assert.assertNull(discoveryNodeFilters72);
        org.junit.Assert.assertTrue("'" + state73 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state73.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.index.Index index7 = indexMetaData4.getMergeSourceIndex();
        java.lang.String str8 = indexMetaData4.getIndexUUID();
        int int9 = indexMetaData4.getNumberOfShards();
        org.elasticsearch.Version version10 = indexMetaData4.getCreationVersion();
        org.elasticsearch.index.Index index11 = indexMetaData4.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNull(index7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNull(index11);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.settings(settings24);
        java.lang.Boolean boolean30 = settings24.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = settings24.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder11.put(settings24);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder32.normalizePrefix("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("state-", (float) (-1L));
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder34.put("state-", false);
        org.elasticsearch.common.settings.Settings settings42 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap44 = settings42.getAsGroups(false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap46 = settings42.getGroups("index.shared_filesystem");
        java.lang.String[] strArray48 = settings42.getAsArray("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.putArray("index.number_of_replicas", strArray48);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder34.put("", "index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder53 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder53.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder55.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings59 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate60 = null;
        org.elasticsearch.common.settings.Settings settings61 = settings59.filter(strPredicate60);
        java.lang.String str63 = settings61.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder55.put(settings61);
        org.elasticsearch.common.settings.Settings settings66 = settings61.getByPrefix("index.shadow_replicas");
        java.lang.String str69 = settings61.get("hi!", "");
        java.lang.String str72 = settings61.get("index.data_path", "index.");
        org.elasticsearch.common.settings.Settings.Builder builder74 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder74.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder79 = builder76.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder82 = builder79.put("index.auto_expand_replicas", "hi!");
        java.lang.String[] strArray90 = new java.lang.String[] { "index.blocks.read_only", "", "index.number_of_replicas", "index.blocks.read", "index.blocks.read", "index.blocks.read" };
        org.elasticsearch.common.settings.Settings.Builder builder91 = builder82.putArray("index.auto_expand_replicas", strArray90);
        java.lang.String[] strArray92 = settings61.getAsArray("index.shadow_replicas", strArray90);
        org.elasticsearch.common.settings.Settings.Builder builder93 = builder52.put((java.lang.Object[]) strArray92);
        org.elasticsearch.common.settings.Settings.Builder builder95 = builder52.putNull("state-");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "index." + "'", str72, "index.");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder13.put("index.", (long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder18 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = builder18.version((long) 1);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate22 = null;
        org.elasticsearch.common.settings.Settings settings23 = settings21.filter(strPredicate22);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder18.settings(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state25 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.state(state25);
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate28 = null;
        org.elasticsearch.common.settings.Settings settings29 = settings27.filter(strPredicate28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder26.settings(settings27);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom32 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder26.putCustom("", custom32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder35.version((long) 1);
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate39 = null;
        org.elasticsearch.common.settings.Settings settings40 = settings38.filter(strPredicate39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder35.settings(settings38);
        org.elasticsearch.common.settings.Settings settings43 = settings38.getAsSettings("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = builder26.settings(settings43);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder13.put(settings43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder46.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate53 = null;
        org.elasticsearch.common.settings.Settings settings54 = settings52.filter(strPredicate53);
        java.lang.String str56 = settings54.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder48.put(settings54);
        java.lang.String[] strArray64 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder48.putArray("", (java.util.List<java.lang.String>) strList65);
        org.elasticsearch.common.settings.Settings.Builder builder70 = builder67.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder71 = builder67.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder73 = builder67.normalizePrefix("index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder73.put("index.auto_expand_replicas", 0);
        org.elasticsearch.common.settings.Settings.Builder builder77 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder79 = builder77.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder82 = builder79.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder84 = builder79.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder86 = builder84.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings settings87 = builder86.build();
        java.util.Set<java.lang.String> strSet88 = settings87.names();
        java.lang.String[] strArray90 = settings87.getAsArray("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder91 = builder73.put((java.lang.Object[]) strArray90);
        org.elasticsearch.common.settings.Settings.Builder builder92 = builder13.put((java.lang.Object[]) strArray90);
        org.elasticsearch.common.settings.Settings.Builder builder95 = builder92.put("index.auto_expand_replicas", (int) (byte) 10);
        java.lang.String str97 = builder92.remove("index.=10aindex.auto_expand_replicas=falseaindex.auto_expand_replicasprimary_terms=index.number_of_replicasaindex.blocks.write.0=index.blocks.read_onlyaindex.blocks.write.1=aindex.blocks.write.2=index.number_of_replicasaindex.blocks.write.3=index.blocks.readaindex.blocks.write.4=index.blocks.readaindex.blocks.write.5=index.blocks.reada");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + state25 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state25.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(settings87);
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData9 = indexMetaData0.mapping("index.number_of_shards");
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData0.getSettings();
        java.lang.String str11 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mappingMetaData9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_na_" + "'", str11, "_na_");
        org.junit.Assert.assertNull(discoveryNodeFilters12);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        long long2 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap3 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData5.getMappings();
        int int7 = indexMetaData5.getNumberOfShards();
        long long8 = indexMetaData5.getVersion();
        org.elasticsearch.index.Index index9 = indexMetaData5.getMergeSourceIndex();
        int int10 = indexMetaData5.getNumberOfShards();
        long long11 = indexMetaData5.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap12 = indexMetaData5.getCustoms();
        org.elasticsearch.index.Index index13 = indexMetaData5.getMergeSourceIndex();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap14 = indexMetaData5.getMappings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff15 = indexMetaData0.diff(indexMetaData5);
        boolean boolean17 = indexMetaData0.isSameUUID("index.number_of_replicas=0aindex.number_of_shards=1aindex.version.created=5000099a");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder20.version((long) 1);
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder20.settings(settings23);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state27 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder28 = builder26.state(state27);
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate30 = null;
        org.elasticsearch.common.settings.Settings settings31 = settings29.filter(strPredicate30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder28.settings(settings29);
        java.lang.Boolean boolean35 = settings29.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = settings29.getAsStructuredMap();
        org.elasticsearch.common.unit.SizeValue sizeValue38 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue39 = settings29.getAsSize("state-", sizeValue38);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder40 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params41 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder42 = settings29.toXContent(xContentBuilder40, params41);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder43 = indexMetaData0.toXContent(xContentBuilder18, params41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNull(index9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
        org.junit.Assert.assertNull(index13);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertNotNull(indexMetaDataDiff15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + state27 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state27.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + boolean35 + "' != '" + false + "'", boolean35, false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(sizeValue39);
        org.junit.Assert.assertNotNull(params41);
        org.junit.Assert.assertNull(xContentBuilder42);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData7);
        long long10 = indexMetaData7.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData7.diff(indexMetaData11);
        long long14 = indexMetaData7.getVersion();
        java.lang.String str15 = indexMetaData7.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData7.getCustoms();
        java.util.Set<java.lang.String> strSet18 = null; // flaky: indexMetaData7.activeAllocationIds((int) '#');
        long long19 = indexMetaData7.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters21 = indexMetaData7.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters22 = indexMetaData7.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData24 = indexMetaData7.mapping("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994");
        org.elasticsearch.Version version25 = indexMetaData7.getUpgradedVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_na_" + "'", str15, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertNull(discoveryNodeFilters21);
        org.junit.Assert.assertNull(discoveryNodeFilters22);
        org.junit.Assert.assertNull(mappingMetaData24);
        org.junit.Assert.assertNotNull(version25);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.getInitialRecoveryFilters();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds(10);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        java.lang.String str15 = indexSettings12.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher16 = indexSettings12.getParseFieldMatcher();
        org.elasticsearch.index.translog.Translog.Durability durability17 = indexSettings12.getTranslogDurability();
        java.lang.String str18 = indexSettings12.customDataPath();
        java.lang.String str19 = indexSettings12.customDataPath();
        org.elasticsearch.common.settings.Settings settings20 = indexSettings12.getSettings();
        org.elasticsearch.common.settings.Settings settings21 = indexSettings12.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher16);
        org.junit.Assert.assertTrue("'" + durability17 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability17.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        boolean boolean19 = indexSettings12.matchesIndexName("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexSettings12.getIndexMetaData();
        org.apache.lucene.index.MergePolicy mergePolicy21 = indexSettings12.getMergePolicy();
        boolean boolean22 = indexSettings12.isWarmerEnabled();
        org.elasticsearch.Version version23 = indexSettings12.getIndexVersionCreated();
        int int24 = indexSettings12.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNotNull(mergePolicy21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getGlobalCheckpointInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        java.lang.String str17 = indexMetaData16.getIndexUUID();
        org.elasticsearch.common.settings.Settings settings18 = indexMetaData16.getSettings();
        org.elasticsearch.common.settings.Settings.Builder builder19 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder19.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings25 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate26 = null;
        org.elasticsearch.common.settings.Settings settings27 = settings25.filter(strPredicate26);
        java.lang.String str29 = settings27.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder21.put(settings27);
        org.elasticsearch.common.settings.Settings settings32 = settings27.getByPrefix("index.shadow_replicas");
        java.lang.String str35 = settings27.get("hi!", "");
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate37 = null;
        org.elasticsearch.common.settings.Settings settings38 = settings36.filter(strPredicate37);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap39 = settings38.getAsGroups();
        org.elasticsearch.common.settings.Settings settings41 = settings38.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version43 = null;
        org.elasticsearch.Version version44 = settings38.getAsVersion("index.creation_date_string", version43);
        java.util.function.Predicate<java.lang.String> strPredicate45 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings46 = settings38.filter(strPredicate45);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings47 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings48 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap50 = settings48.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue52 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue53 = settings48.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue52);
        org.elasticsearch.common.settings.Settings settings54 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings48);
        org.elasticsearch.common.settings.Settings settings55 = indexScopedSettings47.dryRun(settings54);
        java.lang.String str56 = indexScopedSettings47.nodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting57 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer58 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer59 = null;
        indexScopedSettings47.addSettingsUpdateConsumer(timeValueSetting57, timeValueConsumer58, timeValueConsumer59);
        java.lang.String str61 = indexScopedSettings47.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting63 = indexScopedSettings47.get("index.version.created");
        org.elasticsearch.index.IndexSettings indexSettings64 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData16, settings27, strPredicate45, indexScopedSettings47);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting66 = indexScopedSettings47.get("index.version.created_string");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting68 = indexScopedSettings47.get("index.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting70 = indexScopedSettings47.get("index.blocks.read=nullaindex.blocks.read_only=nullaindex.blocks.readprimary_terms=index.number_of_replicasa");
        org.elasticsearch.common.settings.Settings.Builder builder72 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder74 = builder72.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder74.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings78 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate79 = null;
        org.elasticsearch.common.settings.Settings settings80 = settings78.filter(strPredicate79);
        java.lang.String str82 = settings80.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder83 = builder74.put(settings80);
        org.elasticsearch.common.settings.Settings settings85 = settings80.getByPrefix("index.version.created");
        boolean boolean86 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings80);
        indexScopedSettings47.validate("index.shared_filesystem", settings80);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNull(version44);
        org.junit.Assert.assertNotNull(strPredicate45);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertNotNull(indexScopedSettings47);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(sizeValue53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(timeValueSetting57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(wildcardSetting63);
        org.junit.Assert.assertNull(wildcardSetting66);
        org.junit.Assert.assertNull(wildcardSetting68);
        org.junit.Assert.assertNull(wildcardSetting70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(settings78);
        org.junit.Assert.assertNotNull(settings80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(settings85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder28 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder28.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder30.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = builder30.internalMap();
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder30.put(objArray37);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder24.put(objArray37);
        org.elasticsearch.common.settings.Settings.Builder builder40 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder40.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder42.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings46 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate47 = null;
        org.elasticsearch.common.settings.Settings settings48 = settings46.filter(strPredicate47);
        java.lang.String str50 = settings48.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder42.put(settings48);
        org.elasticsearch.common.settings.Settings settings53 = settings48.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet54 = settings53.names();
        java.lang.String[] strArray56 = settings53.getAsArray("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder39.put(settings53);
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder39.putNull("index.version.upgraded");
        org.elasticsearch.common.settings.Settings.Builder builder62 = builder39.put("_na_", "index.uuid");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings64 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings.Builder builder65 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder65.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder70 = builder67.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings71 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate72 = null;
        org.elasticsearch.common.settings.Settings settings73 = settings71.filter(strPredicate72);
        java.lang.String str75 = settings73.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder67.put(settings73);
        java.util.Map<java.lang.String, java.lang.String> strMap77 = settings73.getAsMap();
        java.lang.String str80 = settings73.get("", "primary_terms");
        org.elasticsearch.common.unit.SizeValue sizeValue82 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue83 = settings73.getAsSize("state-", sizeValue82);
        org.elasticsearch.common.settings.Settings settings84 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate85 = null;
        org.elasticsearch.common.settings.Settings settings86 = settings84.filter(strPredicate85);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap87 = settings86.getAsGroups();
        org.elasticsearch.common.settings.Settings settings89 = settings86.getAsSettings("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings settings90 = indexScopedSettings64.diff(settings73, settings86);
        java.lang.Class<?> wildcardClass91 = settings90.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder92 = builder62.put("active_allocations", (java.lang.Class) wildcardClass91);
        org.elasticsearch.common.settings.Settings.Builder builder94 = builder92.normalizePrefix("");
        org.elasticsearch.common.settings.Settings.Builder builder96 = builder92.loadFromSource("index.creation_date");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(settings46);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(indexScopedSettings64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(settings71);
        org.junit.Assert.assertNotNull(settings73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "primary_terms" + "'", str80, "primary_terms");
        org.junit.Assert.assertNull(sizeValue83);
        org.junit.Assert.assertNotNull(settings84);
        org.junit.Assert.assertNotNull(settings86);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNotNull(settings89);
        org.junit.Assert.assertNotNull(settings90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder7.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder12 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder12.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder14.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        java.lang.String str22 = settings20.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder14.put(settings20);
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder23.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.version((long) 1);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder27.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state34 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.state(state34);
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate37 = null;
        org.elasticsearch.common.settings.Settings settings38 = settings36.filter(strPredicate37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings36);
        java.lang.Boolean boolean42 = settings36.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = settings36.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder23.put(settings36);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = builder44.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder11.put(strMap45);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder11.put("index.version.upgraded_string", (int) (byte) 1);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder53 = builder49.put("index.priority", (long) (short) 100, byteSizeUnit52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + state34 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state34.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + boolean42 + "' != '" + false + "'", boolean42, false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.getInitialRecoveryFilters();
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.getInitialRecoveryFilters();
        java.lang.String str10 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.readDiffFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_na_" + "'", str10, "_na_");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        boolean boolean19 = indexSettings12.matchesIndexName("index.priority");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexSettings12.getIndexMetaData();
        org.apache.lucene.index.MergePolicy mergePolicy21 = indexSettings12.getMergePolicy();
        boolean boolean22 = indexSettings12.isWarmerEnabled();
        org.elasticsearch.Version version23 = indexSettings12.getIndexVersionCreated();
        boolean boolean25 = indexSettings12.matchesIndexName("index.=10aindex.auto_expand_replicas=falseaindex.auto_expand_replicasprimary_terms=index.number_of_replicasaindex.blocks.write.0=index.blocks.read_onlyaindex.blocks.write.1=aindex.blocks.write.2=index.number_of_replicasaindex.blocks.write.3=index.blocks.readaindex.blocks.write.4=index.blocks.readaindex.blocks.write.5=index.blocks.reada");
        boolean boolean27 = indexSettings12.matchesIndexName(".0=index.auto_expand_replicas4.1=index.shared_filesystem.recover_on_any_node4.2=index.4.3=index.auto_expand_replicas4.4=index.4index.=-14index.auto_expand_replicas.0=index.auto_expand_replicas4index.auto_expand_replicas.1=index.shared_filesystem.recover_on_any_node4index.auto_expand_replicas.2=index.4index.auto_expand_replicas.3=index.auto_expand_replicas4index.auto_expand_replicas.4=index.4index.shadow_replicas=1004index.version.upgraded_string=index.shared_filesystem4primary_terms=index.number_of_replicas4");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNotNull(mergePolicy21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.index.translog.Translog.Durability durability18 = indexSettings12.getTranslogDurability();
        boolean boolean19 = indexSettings12.isQueryStringLenient();
        int int20 = indexSettings12.getNumberOfShards();
        boolean boolean21 = indexSettings12.isQueryStringAllowLeadingWildcard();
        java.lang.String str22 = indexSettings12.getDefaultField();
        java.lang.String str23 = indexSettings12.getNodeName();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + durability18 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability18.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_all" + "'", str22, "_all");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings.Builder builder2 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder2.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate9 = null;
        org.elasticsearch.common.settings.Settings settings10 = settings8.filter(strPredicate9);
        java.lang.String str12 = settings10.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder4.put(settings10);
        org.elasticsearch.common.settings.Settings settings15 = settings10.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet16 = settings15.names();
        org.elasticsearch.common.settings.Settings settings18 = settings15.getByPrefix("index.number_of_replicas");
        indexScopedSettings0.validate("index.data_path", settings15);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.version((long) 1);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.settings(settings24);
        org.elasticsearch.common.settings.Settings settings29 = settings24.getAsSettings("hi!");
        org.elasticsearch.common.unit.SizeValue sizeValue31 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue32 = settings24.getAsSize("primary_terms", sizeValue31);
        boolean boolean33 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings24);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData34 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long35 = indexMetaData34.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap36 = indexMetaData34.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData37 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long38 = indexMetaData37.getVersion();
        org.elasticsearch.Version version39 = indexMetaData37.getUpgradedVersion();
        boolean boolean40 = indexMetaData34.equals((java.lang.Object) indexMetaData37);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings41 = indexScopedSettings0.copy(settings24, indexMetaData37);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting43 = indexScopedSettings0.get("index.version.minimum_compatible");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting45 = indexScopedSettings0.get("index.blocks.read_only");
        org.elasticsearch.common.settings.Setting.Property property46 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNull(sizeValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(indexMetaData34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap36);
        org.junit.Assert.assertNotNull(indexMetaData37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings41);
        org.junit.Assert.assertNull(wildcardSetting43);
        org.junit.Assert.assertNotNull(wildcardSetting45);
        org.junit.Assert.assertTrue("'" + property46 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property46.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getGlobalCheckpointInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        java.lang.String str17 = indexSettings12.getUUID();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig18 = indexSettings12.getMergeSchedulerConfig();
        int int19 = indexSettings12.getNumberOfReplicas();
        int int20 = indexSettings12.getMaxResultWindow();
        long long21 = indexSettings12.getGcDeletesInMillis();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_na_" + "'", str17, "_na_");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60000L + "'", long21 == 60000L);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        boolean boolean13 = indexMetaData0.isSameUUID("index.blocks.write");
        boolean boolean15 = indexMetaData0.isSameUUID("index.number_of_replicas");
        long long16 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData0.includeFilters();
        org.elasticsearch.common.settings.Settings settings19 = indexMetaData0.getSettings();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap20 = indexMetaData0.getActiveAllocationIds();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap20);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings5 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings4);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        long long8 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long10 = indexMetaData9.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap11 = indexMetaData9.getMappings();
        int int12 = indexMetaData9.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings13 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate14 = null;
        org.elasticsearch.common.settings.Settings settings15 = settings13.filter(strPredicate14);
        java.lang.String str17 = settings15.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap18 = settings15.getAsGroups();
        java.lang.String str20 = settings15.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings21 = new org.elasticsearch.index.IndexSettings(indexMetaData9, settings15);
        int int22 = indexSettings21.getMaxResultWindow();
        java.lang.String str23 = indexSettings21.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability24 = indexSettings21.getTranslogDurability();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher25 = indexSettings21.getParseFieldMatcher();
        boolean boolean26 = indexSettings21.isQueryStringAllowLeadingWildcard();
        boolean boolean27 = indexMetaData0.equals((java.lang.Object) indexSettings21);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_na_" + "'", str23, "_na_");
        org.junit.Assert.assertTrue("'" + durability24 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability24.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(parseFieldMatcher25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        org.elasticsearch.index.translog.Translog.Durability durability14 = indexSettings12.getTranslogDurability();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig15 = indexSettings12.getMergeSchedulerConfig();
        int int16 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getTranslogSyncInterval();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + durability14 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability14.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergeSchedulerConfig15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(settings18);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap2 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.includeFilters();
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap5 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        long long9 = indexMetaData6.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int11 = indexMetaData10.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData6.diff(indexMetaData10);
        java.util.Set<java.lang.String> strSet14 = null; // flaky: indexMetaData6.activeAllocationIds(1);
        org.elasticsearch.Version version15 = indexMetaData6.getUpgradedVersion();
        int int16 = indexMetaData6.getNumberOfReplicas();
        int int17 = indexMetaData6.getNumberOfReplicas();
        int int18 = indexMetaData6.getNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff19 = indexMetaData0.diff(indexMetaData6);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff19);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings settings13 = settings8.getByPrefix("index.version.created");
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings8);
        org.elasticsearch.common.settings.Settings settings16 = settings8.getByPrefix("index.auto_expand_replicas");
        java.lang.String str18 = settings16.toDelimitedString(' ');
        java.lang.String str20 = settings16.toDelimitedString('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        int int8 = builder1.numberOfShards();
        org.elasticsearch.common.settings.Settings.Builder builder9 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder9.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder11.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate16 = null;
        org.elasticsearch.common.settings.Settings settings17 = settings15.filter(strPredicate16);
        java.lang.String str19 = settings17.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder20 = builder11.put(settings17);
        org.elasticsearch.common.settings.Settings settings22 = settings17.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet23 = settings17.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = builder1.settings(settings17);
        boolean boolean25 = settings17.isEmpty();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long27 = indexMetaData26.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap28 = indexMetaData26.getMappings();
        int int29 = indexMetaData26.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        java.lang.String str34 = settings32.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings32.getAsGroups();
        java.lang.String str37 = settings32.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings38 = new org.elasticsearch.index.IndexSettings(indexMetaData26, settings32);
        int int39 = indexSettings38.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting40 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue41 = indexSettings38.getValue(timeValueSetting40);
        int int42 = indexSettings38.getMaxRescoreWindow();
        boolean boolean44 = indexSettings38.matchesIndexName("hi!");
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig45 = indexSettings38.getMergeSchedulerConfig();
        org.elasticsearch.index.translog.Translog.Durability durability46 = indexSettings38.getTranslogDurability();
        java.lang.String str47 = indexSettings38.getUUID();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue48 = indexSettings38.getFlushThresholdSize();
        boolean boolean49 = settings17.equals((java.lang.Object) indexSettings38);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting40);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig45);
        org.junit.Assert.assertTrue("'" + durability46 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability46.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_na_" + "'", str47, "_na_");
        org.junit.Assert.assertNotNull(byteSizeValue48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData7);
        long long10 = indexMetaData7.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int12 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData7.diff(indexMetaData11);
        long long14 = indexMetaData7.getVersion();
        java.lang.String str15 = indexMetaData7.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap16 = indexMetaData7.getCustoms();
        java.util.Set<java.lang.String> strSet18 = null; // flaky: indexMetaData7.activeAllocationIds((int) '#');
        long long19 = indexMetaData7.getCreationDate();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff20 = indexMetaData0.diff(indexMetaData7);
        org.elasticsearch.common.settings.Settings settings21 = indexMetaData7.getSettings();
        java.lang.String str24 = settings21.get("archived.", "");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_na_" + "'", str15, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap16);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaDataDiff20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.Settings.Builder builder5 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder5.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder7.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate12 = null;
        org.elasticsearch.common.settings.Settings settings13 = settings11.filter(strPredicate12);
        java.lang.String str15 = settings13.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder7.put(settings13);
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder16.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder18.put("index.", (long) (byte) 10);
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate23 = null;
        org.elasticsearch.common.settings.Settings settings24 = settings22.filter(strPredicate23);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap25 = settings24.getAsGroups();
        org.elasticsearch.common.settings.Settings settings27 = settings24.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version29 = null;
        org.elasticsearch.Version version30 = settings24.getAsVersion("index.creation_date_string", version29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = settings24.getAsMap();
        java.util.function.Predicate<java.lang.String> strPredicate32 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        java.util.function.Function<java.lang.String, java.lang.String> strFunction33 = null;
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder18.putProperties(strMap31, strPredicate32, strFunction33);
        boolean boolean35 = indexMetaData0.equals((java.lang.Object) builder34);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters36 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap37 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData39 = indexMetaData0.mappingOrDefault("index.version.created_string");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData41 = indexMetaData0.mapping("_na_");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNull(version30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strPredicate32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(discoveryNodeFilters36);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap37);
        org.junit.Assert.assertNull(mappingMetaData39);
        org.junit.Assert.assertNull(mappingMetaData41);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getVersion();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.index.IndexSettings indexSettings5 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings4);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.index.Index index7 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(index7);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfReplicas(0);
        org.elasticsearch.common.settings.Settings.Builder builder12 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder12.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder14.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        java.lang.String str22 = settings20.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder14.put(settings20);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = settings20.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings settings26 = settings20.getByPrefix("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings settings28 = settings20.getAsSettings("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder11.settings(settings28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder31 = builder29.index("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.numberOfShards((int) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state36 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder35.state(state36);
        org.elasticsearch.common.settings.Settings.Builder builder38 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder38.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder40.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder40.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = builder40.internalMap();
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder40.put(objArray47);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("index.blocks.read", (double) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder51.put("index.blocks.metadata", "");
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder54.put("index.shared_filesystem.recover_on_any_node", "index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder58 = builder37.settings(builder57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder29.settings(builder57);
        org.elasticsearch.common.settings.Settings.Builder builder62 = builder57.put("index.shared_filesystem", (int) (short) 0);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder66 = builder57.put("", (long) 'a', byteSizeUnit65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap9 = indexMetaData0.getCustoms();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData0.activeAllocationIds((int) '#');
        long long12 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters13 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state14 = indexMetaData0.getState();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData0.includeFilters();
        int int16 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters13);
        org.junit.Assert.assertTrue("'" + state14 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state14.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        long long7 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version8 = indexMetaData0.getCreationVersion();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap11 = settings9.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue13 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue14 = settings9.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue13);
        java.lang.Boolean boolean17 = settings9.getAsBoolean("archived.", (java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings19 = settings9.getAsSettings("state-");
        org.elasticsearch.index.IndexSettings indexSettings20 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings9);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters22 = indexMetaData0.includeFilters();
        org.apache.lucene.util.Version version23 = indexMetaData0.getMinimumCompatibleVersion();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = indexMetaData0.primaryTerm(10000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(sizeValue14);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertNull(discoveryNodeFilters22);
        org.junit.Assert.assertNull(version23);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder7.numberOfShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.putCustom("hi!", custom15);
        long long17 = builder16.version();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData19 = builder16.mapping("hi!");
        int int20 = builder16.numberOfShards();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = builder16.putAlias(aliasMetaData21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNull(mappingMetaData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getRefreshInterval();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        boolean boolean19 = indexSettings12.isQueryStringAnalyzeWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.index.translog.Translog.Durability durability14 = indexSettings12.getTranslogDurability();
        int int15 = indexSettings12.getNumberOfShards();
        org.elasticsearch.Version version16 = indexSettings12.getIndexVersionCreated();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = indexSettings12.getIndexMetaData();
        boolean boolean18 = indexSettings12.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig19 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean20 = indexSettings12.isShadowReplicaIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + durability14 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability14.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        long long9 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version10 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.apache.lucene.util.Version version12 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(version12);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.apache.lucene.util.Version version4 = indexMetaData0.getMinimumCompatibleVersion();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("_all");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long9 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.excludeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.index.translog.Translog.Durability durability18 = indexSettings12.getTranslogDurability();
        boolean boolean19 = indexSettings12.isQueryStringLenient();
        boolean boolean20 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.index.translog.Translog.Durability durability21 = indexSettings12.getTranslogDurability();
        boolean boolean22 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean23 = indexSettings12.isWarmerEnabled();
        boolean boolean24 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.common.settings.Settings settings25 = indexSettings12.getNodeSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + durability18 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability18.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + durability21 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability21.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(settings25);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate1 = null;
        org.elasticsearch.common.settings.Settings settings2 = settings0.filter(strPredicate1);
        java.lang.String str4 = settings2.toDelimitedString('#');
        java.util.Map<java.lang.String, java.lang.String> strMap5 = settings2.getAsMap();
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings2);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = null;
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = settings8.getAsMap();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params11 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder12 = settings8.toXContent(xContentBuilder10, params11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = settings6.toXContent(xContentBuilder7, params11);
        org.elasticsearch.common.settings.Settings settings15 = settings6.getAsSettings("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994");
        boolean boolean16 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings15);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(params11);
        org.junit.Assert.assertNull(xContentBuilder12);
        org.junit.Assert.assertNull(xContentBuilder13);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig14 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean16 = indexSettings12.matchesIndexName("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = indexSettings12.getIndexMetaData();
        org.elasticsearch.Version version18 = indexMetaData17.getCreationVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap19 = indexMetaData17.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.index.Index index4 = indexMetaData0.getMergeSourceIndex();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertNull(index4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        boolean boolean13 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue14 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        int int16 = indexSettings12.getMaxRescoreWindow();
        boolean boolean17 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean18 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean19 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long21 = indexMetaData20.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap22 = indexMetaData20.getMappings();
        int int23 = indexMetaData20.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        java.lang.String str28 = settings26.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings26.getAsGroups();
        java.lang.String str31 = settings26.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings32 = new org.elasticsearch.index.IndexSettings(indexMetaData20, settings26);
        int int33 = indexSettings32.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting34 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue35 = indexSettings32.getValue(timeValueSetting34);
        org.elasticsearch.common.unit.TimeValue timeValue36 = indexSettings12.getValue(timeValueSetting34);
        org.elasticsearch.Version version37 = indexSettings12.getIndexVersionCreated();
        boolean boolean38 = indexSettings12.isOnSharedFilesystem();
        boolean boolean39 = indexSettings12.isQueryStringAnalyzeWildcard();
        long long40 = indexSettings12.getGcDeletesInMillis();
        boolean boolean41 = indexSettings12.isIndexUsingShadowReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteSizeValue14);
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 60000L + "'", long40 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue17 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.settings.Settings settings19 = indexSettings12.getNodeSettings();
        int int20 = indexSettings12.getMaxResultWindow();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteSizeValue17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap2 = settings0.getAsGroups(false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap4 = settings0.getGroups("index.shared_filesystem");
        java.lang.String[] strArray6 = settings0.getAsArray("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder8 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder8.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder10.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate15 = null;
        org.elasticsearch.common.settings.Settings settings16 = settings14.filter(strPredicate15);
        java.lang.String str18 = settings16.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder10.put(settings16);
        org.elasticsearch.common.settings.Settings settings21 = settings16.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet22 = settings21.names();
        java.lang.String[] strArray24 = settings21.getAsArray("index.shared_filesystem");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap26 = settings21.getGroups("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData28);
        long long31 = indexMetaData28.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData32 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int33 = indexMetaData32.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff34 = indexMetaData28.diff(indexMetaData32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData28);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData37 = indexMetaData28.mapping("index.number_of_shards");
        org.elasticsearch.common.settings.Settings settings38 = indexMetaData28.getSettings();
        java.lang.String[] strArray40 = settings38.getAsArray("archived.");
        java.lang.String[] strArray42 = settings21.getAsArray("index.version.upgraded_string", strArray40, (java.lang.Boolean) true);
        java.lang.String[] strArray44 = settings0.getAsArray("index.blocks.metadata", strArray42, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(indexMetaData28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(mappingMetaData37);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.settings(settings24);
        java.lang.Boolean boolean30 = settings24.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = settings24.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder11.put(settings24);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder32.normalizePrefix("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.version.minimum_compatible", 10000);
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder37.put("index.version.created_string", false);
        java.nio.file.Path path41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder42 = builder37.loadFromPath(path41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.Version version2 = indexMetaData0.getCreationVersion();
        int int3 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.common.settings.Settings settings4 = indexMetaData0.getSettings();
        int int5 = indexMetaData0.getNumberOfReplicas();
        int int6 = indexMetaData0.getTotalNumberOfShards();
        long long7 = indexMetaData0.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(version2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.Version version1 = indexMetaData0.getCreationVersion();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.minimum_compatible");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap4 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mappingOrDefault("100");
        java.util.Set<java.lang.String> strSet8 = indexMetaData0.activeAllocationIds((int) (byte) 0);
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(version9);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int11 = builder10.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.version((long) 1);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.settings(settings24);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state28 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.state(state28);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder29.settings(settings30);
        boolean boolean34 = settings30.isEmpty();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings30.getAsGroups();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder19.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder13.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap39 = indexMetaData38.getMappings();
        int int40 = indexMetaData38.getNumberOfShards();
        long long41 = indexMetaData38.getVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings42 = indexScopedSettings0.copy(settings30, indexMetaData38);
        org.elasticsearch.common.settings.Settings.Builder builder43 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder43.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings49 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate50 = null;
        org.elasticsearch.common.settings.Settings settings51 = settings49.filter(strPredicate50);
        java.lang.String str53 = settings51.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder45.put(settings51);
        org.elasticsearch.common.settings.Settings settings56 = settings51.getByPrefix("index.shadow_replicas");
        java.lang.String str59 = settings51.get("hi!", "");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue61 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue62 = settings51.getAsBytesSize("state-", byteSizeValue61);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData63 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long64 = indexMetaData63.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap65 = indexMetaData63.getMappings();
        int int66 = indexMetaData63.getTotalNumberOfShards();
        boolean boolean67 = settings51.equals((java.lang.Object) int66);
        indexScopedSettings0.validate(settings51);
        java.lang.String str69 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.util.Map<java.lang.String, java.lang.String> strMap71 = settings70.getAsMap();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder72 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params73 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder74 = settings70.toXContent(xContentBuilder72, params73);
        org.elasticsearch.common.settings.Settings settings75 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings70);
        java.lang.String str77 = settings70.toDelimitedString('#');
        boolean boolean78 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings70);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state28.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertNotNull(strImmutableOpenMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(indexScopedSettings42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(byteSizeValue62);
        org.junit.Assert.assertNotNull(indexMetaData63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(params73);
        org.junit.Assert.assertNull(xContentBuilder74);
        org.junit.Assert.assertNotNull(settings75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData1.getMappings();
        int int4 = indexMetaData1.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate6 = null;
        org.elasticsearch.common.settings.Settings settings7 = settings5.filter(strPredicate6);
        java.lang.String str9 = settings7.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings7.getAsGroups();
        java.lang.String str12 = settings7.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings13 = new org.elasticsearch.index.IndexSettings(indexMetaData1, settings7);
        int int14 = indexSettings13.getMaxResultWindow();
        boolean boolean15 = indexSettings13.isQueryStringAnalyzeWildcard();
        java.lang.String str16 = indexSettings13.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig17 = indexSettings13.getMergeSchedulerConfig();
        java.lang.String str18 = indexSettings13.customDataPath();
        org.elasticsearch.common.settings.Settings settings19 = indexSettings13.getNodeSettings();
        indexScopedSettings0.validate(settings19);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap23 = settings21.getAsGroups(false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap25 = settings21.getGroups("index.shared_filesystem");
        java.lang.String[] strArray27 = settings21.getAsArray("index.shared_filesystem.recover_on_any_node");
        boolean boolean28 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData29 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int30 = indexMetaData29.getTotalNumberOfShards();
        int int31 = indexMetaData29.getNumberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData33 = indexMetaData29.mappingOrDefault("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings34 = indexScopedSettings0.copy(settings21, indexMetaData29);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting36 = indexScopedSettings0.get("active_allocations");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_all" + "'", str16, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(indexMetaData29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(mappingMetaData33);
        org.junit.Assert.assertNotNull(indexScopedSettings34);
        org.junit.Assert.assertNull(wildcardSetting36);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        java.lang.String str15 = indexSettings12.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig16 = indexSettings12.getMergeSchedulerConfig();
        java.lang.String str17 = indexSettings12.customDataPath();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        java.lang.String str19 = indexSettings12.customDataPath();
        boolean boolean20 = indexSettings12.isShadowReplicaIndex();
        org.elasticsearch.common.settings.Settings settings21 = indexSettings12.getNodeSettings();
        int int22 = indexSettings12.getMaxRescoreWindow();
        boolean boolean23 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean24 = indexSettings12.isIndexUsingShadowReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_all" + "'", str15, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        int int14 = indexSettings12.getMaxResultWindow();
        org.apache.lucene.index.MergePolicy mergePolicy15 = indexSettings12.getMergePolicy();
        boolean boolean16 = indexSettings12.isTTLPurgeDisabled();
        java.lang.String str17 = indexSettings12.getDefaultField();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        boolean boolean19 = indexSettings12.isQueryStringAllowLeadingWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(mergePolicy15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_all" + "'", str17, "_all");
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        int int16 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue17 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.index.translog.Translog.Durability durability18 = indexSettings12.getTranslogDurability();
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings12.getTranslogSyncInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexSettings12.getIndexMetaData();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(byteSizeValue17);
        org.junit.Assert.assertTrue("'" + durability18 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability18.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(indexMetaData20);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings.Builder builder1 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder1.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder6 = builder3.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate8 = null;
        org.elasticsearch.common.settings.Settings settings9 = settings7.filter(strPredicate8);
        java.lang.String str11 = settings9.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder3.put(settings9);
        org.elasticsearch.common.settings.Settings settings14 = settings9.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet15 = settings14.names();
        org.elasticsearch.common.settings.Settings settings17 = settings14.getByPrefix("");
        indexScopedSettings0.validate(settings17);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap22 = settings20.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue24 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue25 = settings20.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue24);
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings20);
        org.elasticsearch.common.settings.Settings settings27 = indexScopedSettings19.dryRun(settings26);
        java.lang.String str28 = indexScopedSettings19.nodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting29 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer30 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer31 = null;
        indexScopedSettings19.addSettingsUpdateConsumer(timeValueSetting29, timeValueConsumer30, timeValueConsumer31);
        org.elasticsearch.common.unit.TimeValue timeValue33 = indexScopedSettings0.get(timeValueSetting29);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting34 = org.elasticsearch.index.IndexSettings.INDEX_REFRESH_INTERVAL_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue35 = indexScopedSettings0.get(timeValueSetting34);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting36 = org.elasticsearch.index.IndexSettings.INDEX_TRANSLOG_SYNC_INTERVAL_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue37 = indexScopedSettings0.get(timeValueSetting36);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder39.numberOfShards((int) (short) -1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder41.removeAllAliases();
        long long43 = builder42.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = builder42.removeAlias("index.version.created");
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder46.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate53 = null;
        org.elasticsearch.common.settings.Settings settings54 = settings52.filter(strPredicate53);
        java.lang.String str56 = settings54.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder48.put(settings54);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = settings54.getAsMap();
        java.lang.String str61 = settings54.get("", "primary_terms");
        org.elasticsearch.common.settings.Settings settings63 = settings54.getAsSettings("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = builder42.settings(settings63);
        org.elasticsearch.common.settings.Settings settings66 = settings63.getByPrefix("_na_");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap67 = settings63.getAsGroups();
        org.elasticsearch.common.settings.Settings settings68 = indexScopedSettings0.applySettings(settings63);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(sizeValue25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(timeValueSetting29);
        org.junit.Assert.assertNotNull(timeValue33);
        org.junit.Assert.assertNotNull(timeValueSetting34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(timeValueSetting36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "primary_terms" + "'", str61, "primary_terms");
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(settings68);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap1 = indexMetaData0.getMappings();
        int int2 = indexMetaData0.getNumberOfShards();
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version4 = indexMetaData0.getUpgradedVersion();
        int int5 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.Version version6 = indexMetaData0.getCreationVersion();
        int int7 = indexMetaData0.getTotalNumberOfShards();
        boolean boolean9 = indexMetaData0.isSameUUID("index.blocks.read.0=index.number_of_shards4index.blocks.readprimary_terms=index.number_of_replicas4index.number_of_shards=org.elasticsearch.cluster.metadata.IndexMetaData$Builder4");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNotNull(strImmutableOpenMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds(1);
        boolean boolean10 = indexMetaData0.isSameUUID("index.number_of_shards");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = builder2.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder11.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass16 = builder11.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder2.put("index.number_of_shards", (java.lang.Class) wildcardClass16);
        org.elasticsearch.common.settings.Settings.Builder builder20 = builder2.put("index.version.upgraded_string", (float) 10000);
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder2.put("", true);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = builder23.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder23.put("index.data_path", (double) (byte) -1);
        java.lang.String str29 = builder23.remove("index.version.created");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        boolean boolean16 = indexSettings12.isWarmerEnabled();
        boolean boolean17 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexSettings12.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData18);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData21 = indexMetaData18.mapping("index.blocks.metadata");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(mappingMetaData21);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isIndexUsingShadowReplicas();
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getGlobalCheckpointInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        org.elasticsearch.Version version17 = indexMetaData16.getUpgradedVersion();
        org.elasticsearch.common.xcontent.XContentParser xContentParser18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long20 = indexMetaData19.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData19.getMappings();
        int int22 = indexMetaData19.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate24 = null;
        org.elasticsearch.common.settings.Settings settings25 = settings23.filter(strPredicate24);
        java.lang.String str27 = settings25.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap28 = settings25.getAsGroups();
        java.lang.String str30 = settings25.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings31 = new org.elasticsearch.index.IndexSettings(indexMetaData19, settings25);
        java.lang.String str32 = indexSettings31.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = indexSettings31.getIndexMetaData();
        java.lang.String str34 = indexSettings31.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher35 = indexSettings31.getParseFieldMatcher();
        org.apache.lucene.index.MergePolicy mergePolicy36 = indexSettings31.getMergePolicy();
        boolean boolean37 = indexSettings31.isQueryStringAllowLeadingWildcard();
        boolean boolean39 = indexSettings31.matchesIndexName("hi!");
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher40 = indexSettings31.getParseFieldMatcher();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData41 = indexMetaData16.fromXContent(xContentParser18, parseFieldMatcher40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(indexMetaData19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher35);
        org.junit.Assert.assertNotNull(mergePolicy36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(parseFieldMatcher40);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int11 = builder10.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.version((long) 1);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder21.settings(settings24);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state28 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.state(state28);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder29.settings(settings30);
        boolean boolean34 = settings30.isEmpty();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings30.getAsGroups();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder19.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = builder13.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData38 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap39 = indexMetaData38.getMappings();
        int int40 = indexMetaData38.getNumberOfShards();
        long long41 = indexMetaData38.getVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings42 = indexScopedSettings0.copy(settings30, indexMetaData38);
        java.lang.String str43 = indexScopedSettings0.nodeName();
        boolean boolean45 = indexScopedSettings0.hasDynamicSetting("index.version.created_string");
        org.elasticsearch.common.settings.Setting.Property property46 = indexScopedSettings0.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData47 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int48 = indexMetaData47.getTotalNumberOfShards();
        org.elasticsearch.Version version49 = indexMetaData47.getCreationVersion();
        long long50 = indexMetaData47.getVersion();
        org.elasticsearch.common.settings.Settings settings51 = indexMetaData47.getSettings();
        org.elasticsearch.common.settings.Settings settings52 = indexScopedSettings0.applySettings(settings51);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap54 = settings52.getGroups("index.blocks.read.0=index.number_of_shards4index.blocks.readprimary_terms=index.number_of_replicas4index.number_of_shards=org.elasticsearch.cluster.metadata.IndexMetaData$Builder4");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap56 = settings52.getAsGroups(true);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state28.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(indexMetaData38);
        org.junit.Assert.assertNotNull(strImmutableOpenMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(indexScopedSettings42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + property46 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property46.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexMetaData47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(version49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder21.put("primary_terms", (float) (byte) 100);
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder21.loadFromSource("index.uuid");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        int int8 = builder7.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder7.numberOfShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.putCustom("hi!", custom12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder10.putCustom("index.blocks.read_only", custom15);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        org.elasticsearch.common.settings.Settings settings23 = settings18.getByPrefix("index.shadow_replicas");
        java.lang.String str25 = settings18.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings0.applySettings(settings18);
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings27.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue31 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue32 = settings27.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue31);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long34 = indexMetaData33.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap35 = indexMetaData33.getMappings();
        int int36 = indexMetaData33.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings37 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate38 = null;
        org.elasticsearch.common.settings.Settings settings39 = settings37.filter(strPredicate38);
        java.lang.String str41 = settings39.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap42 = settings39.getAsGroups();
        java.lang.String str44 = settings39.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings45 = new org.elasticsearch.index.IndexSettings(indexMetaData33, settings39);
        int int46 = indexSettings45.getMaxResultWindow();
        int int47 = indexSettings45.getMaxResultWindow();
        org.apache.lucene.index.MergePolicy mergePolicy48 = indexSettings45.getMergePolicy();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData49 = indexSettings45.getIndexMetaData();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings50 = indexScopedSettings0.copy(settings27, indexMetaData49);
        org.elasticsearch.common.settings.Settings.Builder builder51 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings50.validate(builder51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(sizeValue32);
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10000 + "'", int46 == 10000);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10000 + "'", int47 == 10000);
        org.junit.Assert.assertNotNull(mergePolicy48);
        org.junit.Assert.assertNotNull(indexMetaData49);
        org.junit.Assert.assertNotNull(indexScopedSettings50);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getRefreshInterval();
        boolean boolean16 = indexSettings12.hasCustomDataPath();
        java.lang.String str17 = indexSettings12.customDataPath();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(settings18);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData1.getMappings();
        int int4 = indexMetaData1.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate6 = null;
        org.elasticsearch.common.settings.Settings settings7 = settings5.filter(strPredicate6);
        java.lang.String str9 = settings7.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings7.getAsGroups();
        java.lang.String str12 = settings7.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings13 = new org.elasticsearch.index.IndexSettings(indexMetaData1, settings7);
        int int14 = indexSettings13.getMaxResultWindow();
        boolean boolean15 = indexSettings13.isQueryStringAnalyzeWildcard();
        java.lang.String str16 = indexSettings13.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig17 = indexSettings13.getMergeSchedulerConfig();
        java.lang.String str18 = indexSettings13.customDataPath();
        org.elasticsearch.common.settings.Settings settings19 = indexSettings13.getNodeSettings();
        indexScopedSettings0.validate(settings19);
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("10");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings23 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap26 = settings24.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue28 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue29 = settings24.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue28);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings24);
        org.elasticsearch.common.settings.Settings settings31 = indexScopedSettings23.dryRun(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int34 = builder33.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder33.index("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder38.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder38.creationDate((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder44 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder44.version((long) 1);
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate48 = null;
        org.elasticsearch.common.settings.Settings settings49 = settings47.filter(strPredicate48);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder50 = builder44.settings(settings47);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state51 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = builder50.state(state51);
        org.elasticsearch.common.settings.Settings settings53 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate54 = null;
        org.elasticsearch.common.settings.Settings settings55 = settings53.filter(strPredicate54);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = builder52.settings(settings53);
        boolean boolean57 = settings53.isEmpty();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap58 = settings53.getAsGroups();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder42.settings(settings53);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = builder36.settings(settings53);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap62 = indexMetaData61.getMappings();
        int int63 = indexMetaData61.getNumberOfShards();
        long long64 = indexMetaData61.getVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings65 = indexScopedSettings23.copy(settings53, indexMetaData61);
        java.lang.String str66 = indexScopedSettings23.nodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting67 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue68 = indexScopedSettings23.get(timeValueSetting67);
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer69 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(timeValueSetting67, timeValueConsumer69);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_all" + "'", str16, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(sizeValue29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + state51 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state51.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(strImmutableOpenMap62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(indexScopedSettings65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(timeValueSetting67);
        org.junit.Assert.assertNotNull(timeValue68);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int2 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.index("index.version.upgraded");
        int int5 = builder4.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder4.numberOfReplicas((int) (byte) 10);
        int int8 = builder7.numberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = builder7.mapping("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder7.version((long) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder7.creationDate((long) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder14.removeAllAliases();
        int int16 = builder14.numberOfShards();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = builder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must specify numberOfShards for index [index.version.upgraded]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet5 = null; // flaky: indexMetaData0.activeAllocationIds((int) (short) -1);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.version((long) 1);
        org.elasticsearch.common.settings.Settings settings11 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate12 = null;
        org.elasticsearch.common.settings.Settings settings13 = settings11.filter(strPredicate12);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = builder8.settings(settings11);
        org.elasticsearch.common.unit.SizeValue sizeValue16 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue17 = settings11.getAsSize("index.number_of_shards", sizeValue16);
        org.elasticsearch.index.IndexSettings indexSettings18 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings11);
        boolean boolean20 = indexMetaData0.isSameUUID("index.creation_date_string");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap21 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertNotNull(settings13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(sizeValue17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap21);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        int int16 = indexSettings12.getMaxRescoreWindow();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue17 = indexSettings12.getFlushThresholdSize();
        org.elasticsearch.common.unit.TimeValue timeValue18 = indexSettings12.getGlobalCheckpointInterval();
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings12.getRefreshInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(byteSizeValue17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(timeValue19);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        int int5 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long8 = indexMetaData7.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap9 = indexMetaData7.getMappings();
        int int10 = indexMetaData7.getTotalNumberOfShards();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData7.activeAllocationIds((int) (short) -1);
        int int13 = indexMetaData7.getNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff14 = indexMetaData0.diff(indexMetaData7);
        java.lang.String str15 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        long long17 = indexMetaData0.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_na_" + "'", str15, "_na_");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData3 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long4 = indexMetaData3.getVersion();
        org.elasticsearch.Version version5 = indexMetaData3.getUpgradedVersion();
        boolean boolean6 = indexMetaData0.equals((java.lang.Object) indexMetaData3);
        java.util.Set<java.lang.String> strSet8 = null; // flaky: indexMetaData0.activeAllocationIds((int) ' ');
        int int9 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.index.Index index11 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertNotNull(indexMetaData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(index11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        java.lang.String str15 = indexSettings12.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig16 = indexSettings12.getMergeSchedulerConfig();
        java.lang.String str17 = indexSettings12.customDataPath();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getNodeSettings();
        java.lang.String str19 = indexSettings12.customDataPath();
        boolean boolean20 = indexSettings12.isShadowReplicaIndex();
        org.elasticsearch.common.settings.Settings settings21 = indexSettings12.getNodeSettings();
        boolean boolean22 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings21);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_all" + "'", str15, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting14 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue15 = indexSettings12.getValue(timeValueSetting14);
        int int16 = indexSettings12.getMaxRescoreWindow();
        boolean boolean18 = indexSettings12.matchesIndexName("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings12.getTranslogSyncInterval();
        org.apache.lucene.index.MergePolicy mergePolicy20 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.settings.Settings settings21 = indexSettings12.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(mergePolicy20);
        org.junit.Assert.assertNotNull(settings21);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long12 = indexMetaData11.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap13 = indexMetaData11.getMappings();
        int int14 = indexMetaData11.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate16 = null;
        org.elasticsearch.common.settings.Settings settings17 = settings15.filter(strPredicate16);
        java.lang.String str19 = settings17.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap20 = settings17.getAsGroups();
        java.lang.String str22 = settings17.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData11, settings17);
        int int24 = indexSettings23.getMaxResultWindow();
        boolean boolean25 = indexSettings23.isQueryStringAnalyzeWildcard();
        java.lang.String str26 = indexSettings23.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig27 = indexSettings23.getMergeSchedulerConfig();
        java.lang.String str28 = indexSettings23.customDataPath();
        java.lang.String str29 = indexSettings23.customDataPath();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long31 = indexMetaData30.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap32 = indexMetaData30.getMappings();
        int int33 = indexMetaData30.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings34 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate35 = null;
        org.elasticsearch.common.settings.Settings settings36 = settings34.filter(strPredicate35);
        java.lang.String str38 = settings36.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap39 = settings36.getAsGroups();
        java.lang.String str41 = settings36.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings42 = new org.elasticsearch.index.IndexSettings(indexMetaData30, settings36);
        int int43 = indexSettings42.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting44 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue45 = indexSettings42.getValue(timeValueSetting44);
        boolean boolean46 = indexSettings42.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue47 = indexSettings42.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData48 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long49 = indexMetaData48.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap50 = indexMetaData48.getMappings();
        int int51 = indexMetaData48.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate53 = null;
        org.elasticsearch.common.settings.Settings settings54 = settings52.filter(strPredicate53);
        java.lang.String str56 = settings54.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap57 = settings54.getAsGroups();
        java.lang.String str59 = settings54.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings60 = new org.elasticsearch.index.IndexSettings(indexMetaData48, settings54);
        int int61 = indexSettings60.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting62 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue63 = indexSettings60.getValue(timeValueSetting62);
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings42.getValue(timeValueSetting62);
        org.elasticsearch.common.unit.TimeValue timeValue65 = indexSettings23.getValue(timeValueSetting62);
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer66 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer67 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(timeValueSetting62, timeValueConsumer66, timeValueConsumer67);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData70 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long71 = indexMetaData70.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap72 = indexMetaData70.getMappings();
        int int73 = indexMetaData70.getTotalNumberOfShards();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap74 = indexMetaData70.getActiveAllocationIds();
        org.elasticsearch.Version version75 = indexMetaData70.getCreationVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters76 = indexMetaData70.requireFilters();
        long long77 = indexMetaData70.getCreationDate();
        org.elasticsearch.common.settings.Settings settings78 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate79 = null;
        org.elasticsearch.common.settings.Settings settings80 = settings78.filter(strPredicate79);
        java.lang.String str82 = settings80.toDelimitedString('#');
        org.elasticsearch.index.IndexSettings indexSettings83 = new org.elasticsearch.index.IndexSettings(indexMetaData70, settings80);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = settings80.getAsMap();
        org.elasticsearch.common.settings.Settings settings86 = settings80.getAsSettings("primary_terms");
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap87 = settings80.getAsGroups();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap88 = settings80.getAsGroups();
        indexScopedSettings0.validate("index.data_path", settings80);
        java.lang.Boolean boolean92 = settings80.getAsBoolean("index.priority", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10000 + "'", int24 == 10000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_all" + "'", str26, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting44);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(indexMetaData48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting62);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(indexMetaData70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap74);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertNull(discoveryNodeFilters76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNotNull(settings78);
        org.junit.Assert.assertNotNull(settings80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(settings86);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertEquals("'" + boolean92 + "' != '" + false + "'", boolean92, false);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        java.lang.String str14 = indexSettings12.getUUID();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        org.apache.lucene.index.MergePolicy mergePolicy16 = indexSettings12.getMergePolicy();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher17 = indexSettings12.getParseFieldMatcher();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap19 = indexMetaData18.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder20 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData18);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData21);
        long long24 = indexMetaData21.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int26 = indexMetaData25.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff27 = indexMetaData21.diff(indexMetaData25);
        long long28 = indexMetaData21.getVersion();
        java.lang.String str29 = indexMetaData21.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long31 = indexMetaData30.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap32 = indexMetaData30.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData33 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long34 = indexMetaData33.getVersion();
        org.elasticsearch.Version version35 = indexMetaData33.getUpgradedVersion();
        boolean boolean36 = indexMetaData30.equals((java.lang.Object) indexMetaData33);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff37 = indexMetaData21.diff(indexMetaData30);
        int int38 = indexMetaData30.getNumberOfShards();
        org.elasticsearch.Version version39 = indexMetaData30.getUpgradedVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters40 = indexMetaData30.excludeFilters();
        long long41 = indexMetaData30.getVersion();
        boolean boolean42 = indexMetaData18.equals((java.lang.Object) long41);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_na_" + "'", str14, "_na_");
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergePolicy16);
        org.junit.Assert.assertNotNull(parseFieldMatcher17);
        org.junit.Assert.assertNotNull(indexMetaData18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(indexMetaData21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_na_" + "'", str29, "_na_");
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap32);
        org.junit.Assert.assertNotNull(indexMetaData33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(indexMetaDataDiff37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNull(discoveryNodeFilters40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.state(state8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.numberOfShards((int) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("");
        org.elasticsearch.common.settings.Settings.Builder builder14 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder14.putNull("");
        java.lang.String str18 = builder16.remove("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder11.settings(builder16);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder22 = builder20.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings26 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate27 = null;
        org.elasticsearch.common.settings.Settings settings28 = settings26.filter(strPredicate27);
        java.lang.String str30 = settings28.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder22.put(settings28);
        java.lang.String[] strArray38 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder22.putArray("", (java.util.List<java.lang.String>) strList39);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder41.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder41.replacePropertyPlaceholders();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder11.settings(builder41);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        int int49 = builder48.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder51 = builder48.index("index.version.upgraded");
        int int52 = builder51.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = builder51.numberOfReplicas((int) (byte) 10);
        int int55 = builder54.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder54.creationDate((long) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder54.version((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = builder61.version((long) 1);
        org.elasticsearch.common.settings.Settings settings64 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate65 = null;
        org.elasticsearch.common.settings.Settings settings66 = settings64.filter(strPredicate65);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder61.settings(settings64);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state68 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = builder67.state(state68);
        byte byte70 = state68.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = builder59.state(state68);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder72 = builder46.state(state68);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData74 = builder72.mapping("index.shadow_replicas");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder77 = builder72.primaryTerm(0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: you must set the number of shards before setting/reading primary terms");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + state68 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state68.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 0 + "'", byte70 == (byte) 0);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNull(mappingMetaData74);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        boolean boolean14 = indexSettings12.isTTLPurgeDisabled();
        org.elasticsearch.index.translog.Translog.Durability durability15 = indexSettings12.getTranslogDurability();
        boolean boolean16 = indexSettings12.isQueryStringLenient();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getTranslogSyncInterval();
        org.elasticsearch.common.settings.Settings settings18 = indexSettings12.getSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap20 = settings18.getGroups("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal setting prefix ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + durability15 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability15.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(settings18);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate1 = null;
        org.elasticsearch.common.settings.Settings settings2 = settings0.filter(strPredicate1);
        java.lang.String str4 = settings2.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings2);
        org.elasticsearch.common.settings.Settings settings7 = settings5.getByPrefix("index.uuid");
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate10 = null;
        org.elasticsearch.common.settings.Settings settings11 = settings9.filter(strPredicate10);
        java.lang.String str13 = settings11.toDelimitedString('#');
        java.util.Map<java.lang.String, java.lang.String> strMap14 = settings11.getAsMap();
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings11);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder16 = null;
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = settings17.getAsMap();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params20 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder21 = settings17.toXContent(xContentBuilder19, params20);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings15.toXContent(xContentBuilder16, params20);
        org.elasticsearch.common.settings.Settings settings24 = settings15.getAsSettings("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long27 = indexMetaData26.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap28 = indexMetaData26.getMappings();
        int int29 = indexMetaData26.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        java.lang.String str34 = settings32.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap35 = settings32.getAsGroups();
        java.lang.String str37 = settings32.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings38 = new org.elasticsearch.index.IndexSettings(indexMetaData26, settings32);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue39 = indexSettings38.getFlushThresholdSize();
        boolean boolean40 = indexSettings38.isQueryStringLenient();
        java.lang.String str41 = indexSettings38.getUUID();
        org.elasticsearch.common.unit.TimeValue timeValue42 = indexSettings38.getRefreshInterval();
        org.elasticsearch.common.unit.TimeValue timeValue43 = indexSettings38.getGlobalCheckpointInterval();
        org.elasticsearch.common.unit.TimeValue timeValue44 = settings24.getAsTime("index.version.created", timeValue43);
        org.elasticsearch.common.unit.TimeValue timeValue45 = settings5.getAsTime("index.blocks.write", timeValue44);
        java.lang.String str47 = settings5.toDelimitedString('#');
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(settings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(params20);
        org.junit.Assert.assertNull(xContentBuilder21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(byteSizeValue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_na_" + "'", str41, "_na_");
        org.junit.Assert.assertNotNull(timeValue42);
        org.junit.Assert.assertNotNull(timeValue43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) 1);
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.settings(settings4);
        org.elasticsearch.common.settings.Settings settings9 = settings4.getAsSettings("hi!");
        org.elasticsearch.common.unit.SizeValue sizeValue11 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue12 = settings4.getAsSize("primary_terms", sizeValue11);
        boolean boolean13 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings4);
        java.util.Set<java.lang.String> strSet14 = settings4.names();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNull(sizeValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        boolean boolean13 = indexMetaData0.isSameUUID("index.blocks.write");
        boolean boolean15 = indexMetaData0.isSameUUID("index.number_of_replicas");
        long long16 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap17 = indexMetaData0.getMappings();
        long long18 = indexMetaData0.getCreationDate();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap19 = indexMetaData0.getActiveAllocationIds();
        boolean boolean21 = indexMetaData0.isSameUUID("index.creation_date_string");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(strImmutableOpenMap17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings1 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap3 = settings1.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue5 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue6 = settings1.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue5);
        org.elasticsearch.common.settings.Settings settings7 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings1);
        org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long11 = indexMetaData10.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap12 = indexMetaData10.getMappings();
        int int13 = indexMetaData10.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate15 = null;
        org.elasticsearch.common.settings.Settings settings16 = settings14.filter(strPredicate15);
        java.lang.String str18 = settings16.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings16.getAsGroups();
        java.lang.String str21 = settings16.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings22 = new org.elasticsearch.index.IndexSettings(indexMetaData10, settings16);
        int int23 = indexSettings22.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting24 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue25 = indexSettings22.getValue(timeValueSetting24);
        boolean boolean26 = indexSettings22.isOnSharedFilesystem();
        org.elasticsearch.common.unit.TimeValue timeValue27 = indexSettings22.getRefreshInterval();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData28 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long29 = indexMetaData28.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap30 = indexMetaData28.getMappings();
        int int31 = indexMetaData28.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate33 = null;
        org.elasticsearch.common.settings.Settings settings34 = settings32.filter(strPredicate33);
        java.lang.String str36 = settings34.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap37 = settings34.getAsGroups();
        java.lang.String str39 = settings34.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings40 = new org.elasticsearch.index.IndexSettings(indexMetaData28, settings34);
        int int41 = indexSettings40.getNumberOfShards();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting42 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        org.elasticsearch.common.unit.TimeValue timeValue43 = indexSettings40.getValue(timeValueSetting42);
        org.elasticsearch.common.unit.TimeValue timeValue44 = indexSettings22.getValue(timeValueSetting42);
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer45 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer46 = null;
        indexScopedSettings0.addSettingsUpdateConsumer(timeValueSetting42, timeValueConsumer45, timeValueConsumer46);
        org.elasticsearch.common.settings.Setting<?> wildcardSetting49 = indexScopedSettings0.get("index.priority");
        org.elasticsearch.common.settings.Settings settings50 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap52 = settings50.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue54 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue55 = settings50.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue54);
        org.elasticsearch.common.settings.Settings settings56 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate57 = null;
        org.elasticsearch.common.settings.Settings settings58 = settings56.filter(strPredicate57);
        java.util.Set<java.lang.String> strSet59 = settings58.names();
        org.elasticsearch.common.settings.Settings settings60 = indexScopedSettings0.diff(settings50, settings58);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap61 = settings60.getAsGroups();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap63 = settings60.getAsGroups(true);
        java.util.Set<java.lang.String> strSet64 = settings60.names();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(sizeValue6);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexMetaData10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting24);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(indexMetaData28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(timeValueSetting42);
        org.junit.Assert.assertNotNull(timeValue43);
        org.junit.Assert.assertNotNull(timeValue44);
        org.junit.Assert.assertNotNull(wildcardSetting49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(sizeValue55);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strSet64);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        org.elasticsearch.index.translog.Translog.Durability durability14 = indexSettings12.getTranslogDurability();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig15 = indexSettings12.getMergeSchedulerConfig();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = indexSettings12.getIndexMetaData();
        org.elasticsearch.common.unit.TimeValue timeValue18 = indexSettings12.getRefreshInterval();
        boolean boolean19 = indexSettings12.isOnSharedFilesystem();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig20 = indexSettings12.getMergeSchedulerConfig();
        org.elasticsearch.common.unit.TimeValue timeValue21 = indexSettings12.getGlobalCheckpointInterval();
        boolean boolean22 = indexSettings12.isTTLPurgeDisabled();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + durability14 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability14.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(mergeSchedulerConfig15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(indexMetaData17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 100);
        long long4 = builder1.version();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.creationDate((long) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder9.version((long) 1);
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate13 = null;
        org.elasticsearch.common.settings.Settings settings14 = settings12.filter(strPredicate13);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder9.settings(settings12);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.state(state16);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder19 = builder15.numberOfShards(0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder19.version((long) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.version((long) 1);
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate28 = null;
        org.elasticsearch.common.settings.Settings settings29 = settings27.filter(strPredicate28);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder30 = builder24.settings(settings27);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state31 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder32 = builder30.state(state31);
        org.elasticsearch.common.settings.Settings settings33 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate34 = null;
        org.elasticsearch.common.settings.Settings settings35 = settings33.filter(strPredicate34);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = builder32.settings(settings33);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom38 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder36.putCustom("state-", custom38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder36.numberOfReplicas((int) (byte) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder36.version((long) 'a');
        org.elasticsearch.common.settings.Settings.Builder builder45 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder45.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings51 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate52 = null;
        org.elasticsearch.common.settings.Settings settings53 = settings51.filter(strPredicate52);
        java.lang.String str55 = settings53.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder47.put(settings53);
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = settings53.getAsStructuredMap();
        java.lang.String str59 = settings53.toDelimitedString('a');
        java.util.Set<java.lang.String> strSet60 = settings53.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = builder43.putActiveAllocationIds((-1), strSet60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder19.putActiveAllocationIds(10, strSet60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = builder1.putActiveAllocationIds((int) (short) 100, strSet60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = builder63.numberOfReplicas(10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder65.version((long) ' ');
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData68 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData68);
        long long71 = indexMetaData68.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData72 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int73 = indexMetaData72.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff74 = indexMetaData68.diff(indexMetaData72);
        long long75 = indexMetaData68.getVersion();
        java.lang.String str76 = indexMetaData68.getIndexUUID();
        org.elasticsearch.Version version77 = indexMetaData68.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state78 = indexMetaData68.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder79 = builder67.state(state78);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder82 = builder67.primaryTerm((int) ' ', 10L);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData83 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder84 = builder67.putMapping(mappingMetaData83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + state31 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state31.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(indexMetaData68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "_na_" + "'", str76, "_na_");
        org.junit.Assert.assertNotNull(version77);
        org.junit.Assert.assertTrue("'" + state78 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state78.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate1 = null;
        org.elasticsearch.common.settings.Settings settings2 = settings0.filter(strPredicate1);
        java.lang.String str4 = settings2.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap5 = settings2.getAsGroups();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap7 = settings2.getAsGroups(false);
        java.lang.String str9 = settings2.get("index.shared_filesystem");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData11);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap13 = indexMetaData11.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData11.mapping("index.creation_date_string");
        org.elasticsearch.Version version16 = indexMetaData11.getCreationVersion();
        org.elasticsearch.Version version17 = settings2.getAsVersion("state-", version16);
        org.elasticsearch.common.settings.Settings settings19 = settings2.getAsSettings("10");
        java.lang.Boolean boolean22 = settings19.getAsBoolean("_all", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(indexMetaData11);
        org.junit.Assert.assertNotNull(strImmutableOpenMap13);
        org.junit.Assert.assertNull(mappingMetaData15);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + false + "'", boolean22, false);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = settings8.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings settings14 = settings8.getByPrefix("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData16);
        org.elasticsearch.Version version18 = indexMetaData16.getUpgradedVersion();
        org.elasticsearch.Version version19 = settings14.getAsVersion("index.uuid", version18);
        java.util.Set<java.lang.String> strSet20 = settings14.names();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.lang.String[] strArray18 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder2.putArray("", (java.util.List<java.lang.String>) strList19);
        org.elasticsearch.common.settings.Settings.Builder builder24 = builder21.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("index.version.upgraded_string", "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder31 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder31.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder33.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings37 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate38 = null;
        org.elasticsearch.common.settings.Settings settings39 = settings37.filter(strPredicate38);
        java.lang.String str41 = settings39.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder33.put(settings39);
        org.elasticsearch.common.settings.Settings settings44 = settings39.getByPrefix("index.shadow_replicas");
        java.lang.String str46 = settings39.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings48 = settings39.getByPrefix("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder30.put(settings39);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder30.put("index.priority", 10.0d);
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder52.normalizePrefix("");
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder58 = builder54.put("index.shadow_replicas", (long) '4', byteSizeUnit57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        int int8 = indexMetaData0.getNumberOfShards();
        int int9 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData0.excludeFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters12 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData15 = indexMetaData0.mapping("index.number_of_replicas=0#index.number_of_shards=1#index.version.created=5000099#");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNull(discoveryNodeFilters12);
        org.junit.Assert.assertNull(mappingMetaData15);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings settings10 = builder9.build();
        java.util.Set<java.lang.String> strSet11 = settings10.names();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long13 = indexMetaData12.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap14 = indexMetaData12.getMappings();
        int int15 = indexMetaData12.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings18.getAsGroups();
        java.lang.String str23 = settings18.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings24 = new org.elasticsearch.index.IndexSettings(indexMetaData12, settings18);
        int int25 = indexSettings24.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig26 = indexSettings24.getMergeSchedulerConfig();
        boolean boolean28 = indexSettings24.matchesIndexName("index.number_of_shards");
        boolean boolean29 = settings10.equals((java.lang.Object) indexSettings24);
        org.elasticsearch.common.unit.TimeValue timeValue30 = indexSettings24.getGlobalCheckpointInterval();
        org.elasticsearch.common.unit.TimeValue timeValue31 = indexSettings24.getGlobalCheckpointInterval();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(indexMetaData12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(timeValue31);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = settings8.getAsMap();
        java.lang.String str15 = settings8.get("", "primary_terms");
        java.util.Set<java.lang.String> strSet16 = settings8.names();
        boolean boolean17 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings8);
        boolean boolean18 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "primary_terms" + "'", str15, "primary_terms");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        java.lang.String str15 = indexSettings12.getNodeName();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher16 = indexSettings12.getParseFieldMatcher();
        org.elasticsearch.index.translog.Translog.Durability durability17 = indexSettings12.getTranslogDurability();
        java.lang.String str18 = indexSettings12.customDataPath();
        boolean boolean19 = indexSettings12.isShadowReplicaIndex();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = indexSettings12.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData20);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap22 = indexMetaData20.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(parseFieldMatcher16);
        org.junit.Assert.assertTrue("'" + durability17 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability17.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexMetaData20);
        org.junit.Assert.assertNotNull(strImmutableOpenMap22);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (byte) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.primaryTerm((int) (byte) 1, (long) (short) 100);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state7);
        org.elasticsearch.common.settings.Settings.Builder builder10 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder10.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder15 = builder12.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate17 = null;
        org.elasticsearch.common.settings.Settings settings18 = settings16.filter(strPredicate17);
        java.lang.String str20 = settings18.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder12.put(settings18);
        org.elasticsearch.common.settings.Settings settings23 = settings18.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet24 = settings18.names();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder25 = builder8.putActiveAllocationIds(0, strSet24);
        int int26 = builder8.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder8.removeAllAliases();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings28 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings29.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue33 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue34 = settings29.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue33);
        org.elasticsearch.common.settings.Settings settings35 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings29);
        org.elasticsearch.common.settings.Settings settings36 = indexScopedSettings28.dryRun(settings35);
        org.elasticsearch.common.settings.Settings settings38 = settings35.getByPrefix("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder8.settings(settings35);
        int int40 = builder39.numberOfReplicas();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder42 = builder39.creationDate((-1L));
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(indexScopedSettings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(sizeValue34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        int int2 = indexMetaData0.getNumberOfReplicas();
        org.apache.lucene.util.Version version3 = indexMetaData0.getMinimumCompatibleVersion();
        long long4 = indexMetaData0.getCreationDate();
        org.elasticsearch.Version version5 = indexMetaData0.getCreationVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int7 = indexMetaData6.getTotalNumberOfShards();
        org.elasticsearch.Version version8 = indexMetaData6.getCreationVersion();
        long long9 = indexMetaData6.getVersion();
        org.elasticsearch.common.settings.Settings settings10 = indexMetaData6.getSettings();
        org.apache.lucene.util.Version version11 = indexMetaData6.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.Settings.Builder builder12 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder12.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder14.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        java.lang.String str22 = settings20.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder14.put(settings20);
        java.lang.String[] strArray30 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder14.putArray("", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder33.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder36.put("index.", (int) (byte) -1);
        org.elasticsearch.common.settings.Settings settings40 = builder36.build();
        boolean boolean41 = indexMetaData6.equals((java.lang.Object) builder36);
        org.elasticsearch.common.settings.Settings settings42 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate43 = null;
        org.elasticsearch.common.settings.Settings settings44 = settings42.filter(strPredicate43);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap45 = settings44.getAsGroups();
        org.elasticsearch.common.settings.Settings settings47 = settings44.getAsSettings("index.number_of_replicas");
        org.elasticsearch.Version version49 = null;
        org.elasticsearch.Version version50 = settings44.getAsVersion("index.creation_date_string", version49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = settings44.getAsMap();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData53 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData53);
        long long56 = indexMetaData53.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData57 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int58 = indexMetaData57.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff59 = indexMetaData53.diff(indexMetaData57);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData53);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData62 = indexMetaData53.mapping("index.number_of_shards");
        org.elasticsearch.common.settings.Settings settings63 = indexMetaData53.getSettings();
        org.elasticsearch.Version version64 = indexMetaData53.getUpgradedVersion();
        org.elasticsearch.Version version65 = settings44.getAsVersion("index.blocks.read", version64);
        boolean boolean66 = indexMetaData6.equals((java.lang.Object) version64);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff67 = indexMetaData0.diff(indexMetaData6);
        boolean boolean69 = indexMetaData6.isSameUUID("state-");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput70 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData6.writeTo(streamOutput70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(version3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(version5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNull(version11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNull(version50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(indexMetaData53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(mappingMetaData62);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(indexMetaDataDiff67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getNumberOfShards();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig14 = indexSettings12.getMergeSchedulerConfig();
        boolean boolean15 = indexSettings12.isWarmerEnabled();
        long long16 = indexSettings12.getGcDeletesInMillis();
        boolean boolean17 = indexSettings12.isDefaultAllowUnmappedFields();
        boolean boolean18 = indexSettings12.isTTLPurgeDisabled();
        org.elasticsearch.common.settings.Settings settings19 = indexSettings12.getSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60000L + "'", long16 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(settings19);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder7.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder7.put("state-", (double) (short) 0);
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder14.normalizePrefix("_na_");
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder14.loadFromSource("index.number_of_shards");
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder18.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder19.loadFromSource("index.data_path");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = builder19.internalMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = indexSettings12.getIndexMetaData();
        java.lang.String str15 = indexSettings12.getNodeName();
        org.elasticsearch.common.settings.Settings settings16 = indexSettings12.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getTranslogSyncInterval();
        int int18 = indexSettings12.getNumberOfReplicas();
        org.elasticsearch.common.unit.TimeValue timeValue19 = indexSettings12.getTranslogSyncInterval();
        org.elasticsearch.common.settings.Settings settings20 = indexSettings12.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue21 = indexSettings12.getRefreshInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexMetaData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(timeValue21);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long2 = indexMetaData1.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap3 = indexMetaData1.getMappings();
        int int4 = indexMetaData1.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate6 = null;
        org.elasticsearch.common.settings.Settings settings7 = settings5.filter(strPredicate6);
        java.lang.String str9 = settings7.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap10 = settings7.getAsGroups();
        java.lang.String str12 = settings7.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings13 = new org.elasticsearch.index.IndexSettings(indexMetaData1, settings7);
        int int14 = indexSettings13.getMaxResultWindow();
        boolean boolean15 = indexSettings13.isQueryStringAnalyzeWildcard();
        java.lang.String str16 = indexSettings13.getDefaultField();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig17 = indexSettings13.getMergeSchedulerConfig();
        java.lang.String str18 = indexSettings13.customDataPath();
        org.elasticsearch.common.settings.Settings settings19 = indexSettings13.getNodeSettings();
        indexScopedSettings0.validate(settings19);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap24 = settings22.getAsGroups(false);
        org.elasticsearch.common.unit.SizeValue sizeValue26 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue27 = settings22.getAsSize("index.shared_filesystem.recover_on_any_node", sizeValue26);
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings22);
        org.elasticsearch.common.settings.Settings settings29 = indexScopedSettings21.dryRun(settings28);
        java.lang.String str30 = indexScopedSettings21.nodeName();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting31 = org.elasticsearch.index.IndexSettings.INDEX_GC_DELETES_SETTING;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer32 = null;
        java.util.function.Consumer<org.elasticsearch.common.unit.TimeValue> timeValueConsumer33 = null;
        indexScopedSettings21.addSettingsUpdateConsumer(timeValueSetting31, timeValueConsumer32, timeValueConsumer33);
        java.lang.String str35 = indexScopedSettings21.nodeName();
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate37 = null;
        org.elasticsearch.common.settings.Settings settings38 = settings36.filter(strPredicate37);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap39 = settings38.getAsGroups();
        org.elasticsearch.common.settings.Settings settings41 = settings38.getAsSettings("index.auto_expand_replicas");
        boolean boolean42 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings38);
        boolean boolean43 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings38);
        org.elasticsearch.common.settings.Settings settings44 = indexScopedSettings21.dryRun(settings38);
        org.elasticsearch.common.settings.Settings settings45 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings44);
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder46.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder48.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate53 = null;
        org.elasticsearch.common.settings.Settings settings54 = settings52.filter(strPredicate53);
        java.lang.String str56 = settings54.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder48.put(settings54);
        org.elasticsearch.common.settings.Settings settings59 = settings54.getByPrefix("index.shadow_replicas");
        java.util.Set<java.lang.String> strSet60 = settings59.names();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData62 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long63 = indexMetaData62.getVersion();
        org.elasticsearch.Version version64 = indexMetaData62.getUpgradedVersion();
        org.elasticsearch.Version version65 = settings59.getAsVersion("", version64);
        org.elasticsearch.common.settings.Settings settings66 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings59);
        java.lang.Boolean boolean69 = settings59.getAsBoolean("index.priority", (java.lang.Boolean) true);
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings59);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(settings7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_all" + "'", str16, "_all");
        org.junit.Assert.assertNotNull(mergeSchedulerConfig17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(sizeValue27);
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(timeValueSetting31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(indexMetaData62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertEquals("'" + boolean69 + "' != '" + true + "'", boolean69, true);
        org.junit.Assert.assertNotNull(settings70);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version((long) 1);
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder21 = builder15.settings(settings18);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state22 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder23 = builder21.state(state22);
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate25 = null;
        org.elasticsearch.common.settings.Settings settings26 = settings24.filter(strPredicate25);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = builder23.settings(settings24);
        java.lang.Boolean boolean30 = settings24.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = settings24.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder11.put(settings24);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = builder32.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder35 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder37.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings41 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate42 = null;
        org.elasticsearch.common.settings.Settings settings43 = settings41.filter(strPredicate42);
        java.lang.String str45 = settings43.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder37.put(settings43);
        java.lang.String[] strArray53 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder37.putArray("", (java.util.List<java.lang.String>) strList54);
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder32.putArray("hi!", (java.util.List<java.lang.String>) strList54);
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder57.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder57.put("index.shadow_replicas", true);
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder57.put("index.number_of_replicas", (float) (short) 0);
        org.elasticsearch.common.unit.ByteSizeUnit byteSizeUnit67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder68 = builder64.put("5000099", (long) (short) -1, byteSizeUnit67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + state22 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state22.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(settings26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder7.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder11.put("index.number_of_replicas=04index.number_of_shards=14index.version.created=50000994", (double) 0L);
        org.elasticsearch.common.settings.Settings.Builder builder16 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder18 = builder16.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder18.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings22 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate23 = null;
        org.elasticsearch.common.settings.Settings settings24 = settings22.filter(strPredicate23);
        java.lang.String str26 = settings24.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder18.put(settings24);
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder27.normalizePrefix("index.auto_expand_replicas");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = builder29.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder31 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder31.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder33.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings37 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate38 = null;
        org.elasticsearch.common.settings.Settings settings39 = settings37.filter(strPredicate38);
        java.lang.String str41 = settings39.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder33.put(settings39);
        java.lang.String[] strArray49 = new java.lang.String[] { "index.auto_expand_replicas", "index.shared_filesystem.recover_on_any_node", "index.", "index.auto_expand_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder33.putArray("", (java.util.List<java.lang.String>) strList50);
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder52.put("index.shadow_replicas", 100L);
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder52.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder52.normalizePrefix("index.version.created_string");
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder58.put("index.auto_expand_replicas", 0);
        org.elasticsearch.common.settings.Settings.Builder builder62 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder64 = builder62.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder67 = builder64.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder64.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder71 = builder69.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings settings72 = builder71.build();
        java.util.Set<java.lang.String> strSet73 = settings72.names();
        java.lang.String[] strArray75 = settings72.getAsArray("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder58.put((java.lang.Object[]) strArray75);
        org.elasticsearch.common.settings.Settings.Builder builder77 = builder29.put((java.lang.Object[]) strArray75);
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder14.putArray("index.number_of_replicas=0aindex.number_of_shards=1aindex.version.created=5000099a", strArray75);
        org.elasticsearch.common.settings.Settings.Builder builder79 = builder78.replacePropertyPlaceholders();
        java.lang.String str81 = builder78.get("100.0");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(settings22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        boolean boolean14 = indexSettings12.isQueryStringAnalyzeWildcard();
        boolean boolean15 = indexSettings12.isTTLPurgeDisabled();
        org.elasticsearch.Version version16 = indexSettings12.getIndexVersionCreated();
        org.elasticsearch.common.unit.TimeValue timeValue17 = indexSettings12.getGlobalCheckpointInterval();
        java.lang.String str18 = indexSettings12.customDataPath();
        boolean boolean19 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean20 = indexSettings12.isDefaultAllowUnmappedFields();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(version16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int13 = indexSettings12.getMaxResultWindow();
        int int14 = indexSettings12.getMaxResultWindow();
        org.apache.lucene.index.MergePolicy mergePolicy15 = indexSettings12.getMergePolicy();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = indexSettings12.getIndexMetaData();
        org.apache.lucene.util.Version version17 = indexMetaData16.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(mergePolicy15);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNull(version17);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder2.normalizePrefix("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder7.normalizePrefix("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder12 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder14 = builder12.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = builder14.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate19 = null;
        org.elasticsearch.common.settings.Settings settings20 = settings18.filter(strPredicate19);
        java.lang.String str22 = settings20.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder14.put(settings20);
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder23.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder27 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder29 = builder27.version((long) 1);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate31 = null;
        org.elasticsearch.common.settings.Settings settings32 = settings30.filter(strPredicate31);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder33 = builder27.settings(settings30);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state34 = org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder35 = builder33.state(state34);
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate37 = null;
        org.elasticsearch.common.settings.Settings settings38 = settings36.filter(strPredicate37);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder35.settings(settings36);
        java.lang.Boolean boolean42 = settings36.getAsBoolean("index.blocks.read", (java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = settings36.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder23.put(settings36);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = builder44.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder11.put(strMap45);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder11.put("index.version.upgraded_string", (int) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder49.put("index.shared_filesystem", 10);
        org.elasticsearch.common.settings.Settings.Builder builder54 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder54.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder56.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder61 = builder56.normalizePrefix("index.blocks.read");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = builder56.internalMap();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("primary_terms");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder65.version((long) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = builder65.creationDate((long) (short) 1);
        java.lang.Class<?> wildcardClass70 = builder65.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder71 = builder56.put("index.number_of_shards", (java.lang.Class) wildcardClass70);
        org.elasticsearch.common.settings.Settings.Builder builder73 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder75 = builder73.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder75.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder80 = builder75.normalizePrefix("index.blocks.read");
        java.lang.String[] strArray83 = new java.lang.String[] { "index.number_of_shards" };
        org.elasticsearch.common.settings.Settings.Builder builder84 = builder80.putArray("archived.", strArray83);
        org.elasticsearch.common.settings.Settings.Builder builder85 = builder71.extendArray("index.blocks.read", strArray83);
        java.lang.Class<?> wildcardClass86 = builder71.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder87 = builder52.put("primary_terms", (java.lang.Class) wildcardClass86);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + state34 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state34.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertEquals("'" + boolean42 + "' != '" + false + "'", boolean42, false);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData3 = indexMetaData0.mapping("index.number_of_replicas=0aindex.number_of_shards=1aindex.version.created=5000099a");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(mappingMetaData3);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("primary_terms", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate7 = null;
        org.elasticsearch.common.settings.Settings settings8 = settings6.filter(strPredicate7);
        java.lang.String str10 = settings8.toDelimitedString('#');
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder2.put(settings8);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder11.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder11.put("index.shared_filesystem.recover_on_any_node", (double) (byte) 1);
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("-1", "index.data_path");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder0.put("_na_", "primary_terms");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = builder0.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder0.put("index.creation_date", (int) (short) 100);
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder0.putNull("index.version.created_string");
        java.lang.String str13 = builder0.get("index.creation_date_string");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        long long1 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap2 = indexMetaData0.getMappings();
        int int3 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.EMPTY;
        java.util.function.Predicate<java.lang.String> strPredicate5 = null;
        org.elasticsearch.common.settings.Settings settings6 = settings4.filter(strPredicate5);
        java.lang.String str8 = settings6.toDelimitedString('#');
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap9 = settings6.getAsGroups();
        java.lang.String str11 = settings6.get("index.blocks.read");
        org.elasticsearch.index.IndexSettings indexSettings12 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.lang.String str13 = indexSettings12.getNodeName();
        org.elasticsearch.index.translog.Translog.Durability durability14 = indexSettings12.getTranslogDurability();
        int int15 = indexSettings12.getNumberOfShards();
        boolean boolean16 = indexSettings12.isQueryStringAllowLeadingWildcard();
        boolean boolean17 = indexSettings12.isQueryStringAnalyzeWildcard();
        int int18 = indexSettings12.getNumberOfReplicas();
        boolean boolean19 = indexSettings12.isTTLPurgeDisabled();
        long long20 = indexSettings12.getGcDeletesInMillis();
        java.lang.String str21 = indexSettings12.getNodeName();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue22 = indexSettings12.getFlushThresholdSize();
        int int23 = indexSettings12.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + durability14 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability14.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(byteSizeValue22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long3 = indexMetaData0.primaryTerm(0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int5 = indexMetaData4.getTotalNumberOfShards();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff6 = indexMetaData0.diff(indexMetaData4);
        long long7 = indexMetaData0.getVersion();
        java.lang.String str8 = indexMetaData0.getIndexUUID();
        org.elasticsearch.Version version9 = indexMetaData0.getCreationVersion();
        java.util.Set<java.lang.String> strSet11 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 100);
        boolean boolean13 = indexMetaData0.isSameUUID("index.blocks.write");
        org.elasticsearch.common.settings.Settings settings14 = indexMetaData0.getSettings();
        long long15 = indexMetaData0.getCreationDate();
        int int16 = indexMetaData0.getTotalNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(indexMetaDataDiff6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_na_" + "'", str8, "_na_");
        org.junit.Assert.assertNotNull(version9);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder2.put("index.number_of_shards", (float) (short) 10);
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder5.loadFromSource("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder10 = builder5.put("index.shared_filesystem.recover_on_any_node", "index.");
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder5.put("index.version.minimum_compatible", 100.0d);
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder15 = builder13.put(objDictionary14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }
}
