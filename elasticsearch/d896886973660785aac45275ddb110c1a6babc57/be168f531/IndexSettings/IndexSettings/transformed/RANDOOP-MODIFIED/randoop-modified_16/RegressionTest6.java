import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder47.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder47.put("index.number_of_shards=10 index.shared_filesystem.recover_on_any_node=index.data_path index.version.minimum_compatible=60000.0 ", false);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.logging.ESLogger eSLogger62 = indexSettings57.getlogger();
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = indexSettings57.indexMetaData;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(eSLogger62);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(indexMetaData64);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        long long58 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.syncInterval;
        org.elasticsearch.Version version60 = indexSettings57.getIndexVersionCreated();
        indexSettings57.setMaxRescoreWindow(1);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting63 = indexSettings57.getINDEX_GC_DELETES_SETTING();
        org.elasticsearch.Version version64 = indexSettings57.getversion();
        indexSettings57.setMaxRefreshListeners((int) ' ');
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 60000L + "'", long58 == 60000L);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertNotNull(timeValueSetting63);
        org.junit.Assert.assertNotNull(version64);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putCustom("active_allocations", custom7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.index("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state12 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder10.state(state12);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder10.putAlias(builder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + state12 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state12.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder6 = builder0.put("index.auto_expand_replicas", 1.0d);
        org.elasticsearch.common.settings.Settings.Builder builder8 = builder6.putNull("index.blocks.read_only");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder10 = builder8.put(objDictionary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (-1));
        int int6 = builder1.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.numberOfReplicas((int) (short) -1);
        int int9 = builder8.getRoutingNumShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.setRoutingNumShards((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.removeAlias("index.auto_expand_replicas");
        int int14 = builder13.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder15.version(10000L);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long8 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        int int62 = indexSettings57.getNumberOfReplicas();
        boolean boolean63 = indexSettings57.getwarmerEnabled();
        int int64 = indexSettings57.maxRescoreWindow;
        indexSettings57.setMaxRefreshListeners((int) '4');
        boolean boolean67 = indexSettings57.queryStringAllowLeadingWildcard;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting68 = indexSettings57.getALLOW_UNMAPPED();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig69 = indexSettings57.mergePolicyConfig;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10000 + "'", int64 == 10000);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(booleanSetting68);
        org.junit.Assert.assertNotNull(mergePolicyConfig69);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getTranslogDurability();
        boolean boolean64 = indexSettings57.getisShadowReplicaIndex();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting65 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher66 = indexSettings57.getParseFieldMatcher();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting67 = indexSettings57.getINDEX_TRANSLOG_SYNC_INTERVAL_SETTING();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData68 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap69 = indexMetaData68.getAliases();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intSetting65);
        org.junit.Assert.assertNotNull(parseFieldMatcher66);
        org.junit.Assert.assertNotNull(timeValueSetting67);
        org.junit.Assert.assertNotNull(indexMetaData68);
        org.junit.Assert.assertNotNull(strImmutableOpenMap69);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate(100L);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray17 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray18 = settings10.getAsArray("active_allocations", strArray17);
        java.lang.String str20 = settings10.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings10);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap23 = settings10.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder28 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder28.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean33 = indexScopedSettings4.updateSettings(settings10, builder24, builder31, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder24.put("index.number_of_shards", 10L);
        java.lang.String[] strArray45 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder36.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList46);
        org.elasticsearch.common.settings.Settings settings49 = builder36.build();
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder36.loadFromSource("index.version.created");
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder51.put("hi!", (int) '4');
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder54.loadFromSource("index.creation_date");
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder56.normalizePrefix("index.version.upgraded");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder1.settings(builder58);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.lang.String str62 = indexSettings57.defaultField;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting63 = indexSettings57.getALLOW_UNMAPPED();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting64 = indexSettings57.getQUERY_STRING_ALLOW_LEADING_WILDCARD();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "_all" + "'", str62, "_all");
        org.junit.Assert.assertNotNull(booleanSetting63);
        org.junit.Assert.assertNotNull(booleanSetting64);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap6 = indexMetaData0.getMappings();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings7.getScope();
        boolean boolean10 = indexScopedSettings7.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params14 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = settings12.toXContent(xContentBuilder13, params14);
        boolean boolean16 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings12);
        indexScopedSettings7.validate("index.shared_filesystem.recover_on_any_node", settings12);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray27 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray28 = settings20.getAsArray("active_allocations", strArray27);
        java.lang.String str30 = settings20.toDelimitedString('4');
        indexScopedSettings18.validate("index.number_of_shards", settings20);
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings20);
        org.elasticsearch.common.settings.Settings settings33 = indexScopedSettings7.archiveUnknownOrBrokenSettings(settings20);
        org.elasticsearch.common.settings.Settings settings35 = settings20.getByPrefix("index.priority");
        java.lang.String[] strArray37 = null;
        java.lang.String[] strArray39 = settings35.getAsArray("archived.", strArray37, (java.lang.Boolean) false);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap42 = settings35.getGroups("index.auto_expand_replicas", true);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap45 = settings35.getGroups("index.number_of_replicas=0 index.number_of_shards=1 index.version.created=5000099 ", true);
        org.elasticsearch.index.IndexSettings indexSettings46 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings35);
        indexSettings46.warmerEnabled = false;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(params14);
        org.junit.Assert.assertNull(xContentBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray7 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray8 = settings0.getAsArray("active_allocations", strArray7);
        boolean boolean9 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings0);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = settings0.getAsStructuredMap();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.elasticsearch.common.settings.Settings settings62 = indexSettings57.getSettings();
        indexSettings57.setMaxResultWindow((int) (byte) 100);
        java.lang.String str65 = indexSettings57.getNodeName();
        int int66 = indexSettings57.numberOfShards;
        java.lang.String str67 = indexSettings57.customDataPath();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        org.elasticsearch.common.unit.TimeValue timeValue53 = null; // flaky: indexSettings52.refreshInterval;
// flaky:         indexSettings52.maxResultWindow = (short) -1;
        org.elasticsearch.common.unit.TimeValue timeValue56 = null; // flaky: indexSettings52.refreshInterval;
// flaky:         indexSettings52.gcDeletesInMillis = (-1);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
// flaky:         org.junit.Assert.assertNotNull(timeValue53);
// flaky:         org.junit.Assert.assertNotNull(timeValue56);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder2 = builder0.replacePropertyPlaceholders();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        boolean boolean62 = indexSettings57.getqueryStringLenient();
        org.elasticsearch.common.logging.ESLogger eSLogger63 = indexSettings57.getlogger();
        java.lang.String str64 = indexSettings57.defaultField;
        java.lang.String str65 = indexSettings57.defaultField;
        java.lang.String str66 = indexSettings57.getDefaultField();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting67 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        int int68 = indexSettings57.getNumberOfShards();
        org.elasticsearch.common.unit.TimeValue timeValue69 = indexSettings57.getRefreshInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(eSLogger63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "_all" + "'", str64, "_all");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "_all" + "'", str65, "_all");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "_all" + "'", str66, "_all");
        org.junit.Assert.assertNotNull(booleanSetting67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(timeValue69);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.requireFilters();
        long long3 = indexMetaData0.getCreationDate();
        org.elasticsearch.index.Index index4 = indexMetaData0.getMergeSourceIndex();
        org.apache.lucene.util.Version version5 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(index4);
        org.junit.Assert.assertNull(version5);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting62 = indexSettings57.getINDEX_TTL_DISABLE_PURGE_SETTING();
        boolean boolean63 = indexSettings57.isQueryStringAnalyzeWildcard();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting64 = indexSettings57.getQUERY_STRING_LENIENT_SETTING();
        boolean boolean65 = indexSettings57.getqueryStringAnalyzeWildcard();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue66 = indexSettings57.flushThresholdSize;
        org.elasticsearch.common.unit.TimeValue timeValue67 = indexSettings57.refreshInterval;
        org.elasticsearch.common.unit.TimeValue timeValue68 = indexSettings57.getRefreshInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(booleanSetting62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(booleanSetting64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(byteSizeValue66);
        org.junit.Assert.assertNotNull(timeValue67);
        org.junit.Assert.assertNotNull(timeValue68);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date");
        boolean boolean8 = indexMetaData0.isSameUUID("index.version.created");
        org.apache.lucene.util.Version version9 = indexMetaData0.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(version9);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        long long7 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.upgraded");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray19 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray20 = settings12.getAsArray("active_allocations", strArray19);
        java.lang.String str22 = settings12.toDelimitedString('4');
        indexScopedSettings10.validate("index.number_of_shards", settings12);
        java.util.function.Predicate<java.lang.String> strPredicate24 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings25 = settings12.filter(strPredicate24);
        org.elasticsearch.common.unit.TimeValue timeValue27 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue28 = settings25.getAsTime("index.number_of_replicas", timeValue27);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray37 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray38 = settings30.getAsArray("active_allocations", strArray37);
        java.lang.String[] strArray39 = settings25.getAsArray("index.blocks.metadata", strArray38);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder40 = builder9.settings(settings25);
        org.elasticsearch.index.IndexSettings indexSettings41 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings25);
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig42 = indexSettings41.getmergePolicyConfig();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting43 = indexSettings41.getINDEX_WARMER_ENABLED_SETTING();
        boolean boolean45 = indexSettings41.matchesIndexName("index.number_of_replicas.0=index.uuid#index.number_of_replicas.1=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.2=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.3=index.number_of_shards#index.number_of_replicas.4=index.version.upgraded_string#index.number_of_replicas.5=index.version.minimum_compatible#index.number_of_replicas.6=index.data_path#index.number_of_shards=10#index.shared_filesystem.recover_on_any_node=index.data_path#index.version.created=index.uuid#");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strPredicate24);
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mergePolicyConfig42);
        org.junit.Assert.assertNotNull(booleanSetting43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray11 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray12 = settings4.getAsArray("active_allocations", strArray11);
        java.lang.String str14 = settings4.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings4);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap17 = settings4.getAsGroups(true);
        boolean boolean18 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings4);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue20 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue21 = settings4.getAsBytesSize("100.0", byteSizeValue20);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap23 = settings4.getGroups("_na_");
        org.elasticsearch.index.IndexSettings indexSettings24 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings4);
        org.elasticsearch.Version version25 = indexMetaData0.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters27 = indexMetaData26.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters28 = indexMetaData26.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state29 = indexMetaData26.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings30 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property31 = indexScopedSettings30.getScope();
        boolean boolean33 = indexScopedSettings30.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting35 = indexScopedSettings30.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings36 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property37 = indexScopedSettings36.getScope();
        boolean boolean39 = indexScopedSettings36.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting41 = indexScopedSettings36.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings42 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray49 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray50 = settings42.getAsArray("active_allocations", strArray49);
        java.lang.String str52 = settings42.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings53 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings42);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap55 = settings42.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder56 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder56.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder60 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder63 = builder60.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean65 = indexScopedSettings36.updateSettings(settings42, builder56, builder63, "index.shared_filesystem");
        java.lang.Object obj66 = null;
        boolean boolean67 = settings42.equals(obj66);
        org.elasticsearch.common.settings.Settings settings68 = indexScopedSettings30.dryRun(settings42);
        org.elasticsearch.common.settings.Settings settings70 = settings68.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate71 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings72 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property73 = indexScopedSettings72.getScope();
        boolean boolean75 = indexScopedSettings72.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting77 = indexScopedSettings72.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings78 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData26, settings70, strPredicate71, indexScopedSettings72);
        org.elasticsearch.common.settings.Settings settings79 = null; // flaky: indexSettings78.getNodeSettings();
        org.elasticsearch.index.IndexSettings indexSettings80 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings79);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteSizeValue21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(version25);
        org.junit.Assert.assertNotNull(indexMetaData26);
        org.junit.Assert.assertNull(discoveryNodeFilters27);
        org.junit.Assert.assertNull(discoveryNodeFilters28);
        org.junit.Assert.assertTrue("'" + state29 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state29.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings30);
        org.junit.Assert.assertTrue("'" + property31 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property31.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(wildcardSetting35);
        org.junit.Assert.assertNotNull(indexScopedSettings36);
        org.junit.Assert.assertTrue("'" + property37 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property37.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(wildcardSetting41);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(settings68);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNotNull(indexScopedSettings72);
        org.junit.Assert.assertTrue("'" + property73 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property73.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(wildcardSetting77);
// flaky:         org.junit.Assert.assertNotNull(settings79);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters53 = indexMetaData0.requireFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder54 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int55 = builder54.numberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder57 = builder54.creationDate((long) (byte) 1);
        org.elasticsearch.common.settings.Settings settings58 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder59 = builder54.settings(settings58);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder62 = builder59.primaryTerm(0, 0L);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
        org.junit.Assert.assertNull(discoveryNodeFilters53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.putCustom("active_allocations", custom7);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.index("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder10.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state13 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        byte byte14 = state13.id();
        byte byte15 = state13.id();
        byte byte16 = state13.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = builder11.state(state13);
        byte byte18 = state13.id();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + state13 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state13.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.logging.ESLogger eSLogger62 = indexSettings57.getlogger();
        boolean boolean63 = indexSettings57.warmerEnabled;
        boolean boolean64 = indexSettings57.getqueryStringAnalyzeWildcard();
        java.lang.String str65 = indexSettings57.defaultField;
        indexSettings57.setMaxResultWindow(32);
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig68 = indexSettings57.getmergePolicyConfig();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(eSLogger62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "_all" + "'", str65, "_all");
        org.junit.Assert.assertNotNull(mergePolicyConfig68);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("index.=null4index.blocks.metadata=10.04index.creation_date_string=null4index.shared_filesystem.recover_on_any_node.0=index.shared_filesystem.recover_on_any_node4index.shared_filesystem.recover_on_any_node.1=index.version.upgraded_string4index.shared_filesystem.recover_on_any_node.2=active_allocations4index.shared_filesystem.recover_on_any_node.3=archived.4", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray16 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray17 = settings9.getAsArray("active_allocations", strArray16);
        java.lang.String str19 = settings9.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        boolean boolean22 = settings21.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = builder24.numberOfReplicas((int) (short) 10);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap7 = indexMetaData0.getAliases();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData0.getAliases();
        java.util.Set<java.lang.String> strSet10 = null; // flaky: indexMetaData0.activeAllocationIds((int) (byte) 1);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap7);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        int int1 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean4 = indexMetaData0.isSameUUID("index.number_of_replicas=0 index.number_of_shards=1 index.version.created=5000099 ");
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap5 = indexMetaData0.getActiveAllocationIds();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap5);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData60 = indexSettings57.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.apache.lucene.util.Version version62 = indexMetaData60.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.apache.lucene.util.Version version65 = indexMetaData60.getMinimumCompatibleVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(indexMetaData60);
        org.junit.Assert.assertNull(version62);
        org.junit.Assert.assertNull(version65);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.common.settings.Settings settings5 = indexMetaData0.getSettings();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings6.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings12 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray19 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray20 = settings12.getAsArray("active_allocations", strArray19);
        java.lang.String str22 = settings12.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings23 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings12);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap25 = settings12.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean35 = indexScopedSettings6.updateSettings(settings12, builder26, builder33, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder26.put("index.number_of_shards", 10L);
        java.lang.String[] strArray47 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder38.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList48);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder38.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings54 = builder38.build();
        org.elasticsearch.common.settings.Settings settings56 = settings54.getAsSettings("index.priority");
        java.lang.String str58 = settings56.toDelimitedString(' ');
        org.elasticsearch.index.IndexSettings indexSettings59 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings56);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting60 = indexSettings59.getQUERY_STRING_LENIENT_SETTING();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting61 = indexSettings59.getINDEX_GC_DELETES_SETTING();
        boolean boolean62 = indexSettings59.getwarmerEnabled();
        boolean boolean63 = indexSettings59.warmerEnabled;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(settings23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(settings54);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(booleanSetting60);
        org.junit.Assert.assertNotNull(timeValueSetting61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) (byte) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.removeAlias("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.numberOfShards((int) (short) 10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.numberOfReplicas((int) (short) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder9.putCustom("index.blocks.write", custom11);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder9.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.numberOfShards(0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = builder13.primaryTerm((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        int int7 = builder6.getRoutingNumShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.Version version63 = indexSettings57.getversion();
        boolean boolean64 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher65 = indexSettings57.parseFieldMatcher;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parseFieldMatcher65);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.Version version59 = indexSettings57.getversion();
        indexSettings57.warmerEnabled = true;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting62 = indexSettings57.getINDEX_REFRESH_INTERVAL_SETTING();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting63 = indexSettings57.getINDEX_CHECK_ON_STARTUP();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(timeValueSetting62);
        org.junit.Assert.assertNotNull(strSetting63);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData9.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters11 = indexMetaData9.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff13 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData0.requireFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff16 = indexMetaData0.readDiffFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNull(discoveryNodeFilters11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData58 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters59 = indexMetaData58.getInitialRecoveryFilters();
        int int60 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.index.Index index61 = indexMetaData58.getMergeSourceIndex();
        int int62 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff63 = indexMetaData0.diff(indexMetaData58);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData66 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder68 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.index.Index index69 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(indexMetaData58);
        org.junit.Assert.assertNull(discoveryNodeFilters59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(index61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff63);
        org.junit.Assert.assertNull(mappingMetaData66);
        org.junit.Assert.assertNull(index69);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        boolean boolean1 = org.elasticsearch.common.settings.AbstractScopedSettings.isValidKey("false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 1);
        int int4 = builder1.numberOfReplicas();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder1.mapping("index.blocks.metadata");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(mappingMetaData6);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putCustom("index.creation_date", custom8);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder6.numberOfReplicas(32);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = builder11.version((long) (byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder16 = builder13.primaryTerm(0, 0L);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        int int65 = indexSettings57.getMaxRescoreWindow();
        int int66 = indexSettings57.getMaxRescoreWindow();
        indexSettings57.maxRescoreWindow = ' ';
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData69 = indexSettings57.indexMetaData;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder70 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData69);
        org.elasticsearch.common.settings.Settings settings71 = indexMetaData69.getSettings();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap73 = settings71.getAsGroups(true);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10000 + "'", int66 == 10000);
        org.junit.Assert.assertNotNull(indexMetaData69);
        org.junit.Assert.assertNotNull(settings71);
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData60 = indexSettings57.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.apache.lucene.util.Version version62 = indexMetaData60.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder63 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData60);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder66 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(indexMetaData60);
        org.junit.Assert.assertNull(version62);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        long long58 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher59 = indexSettings57.getParseFieldMatcher();
        org.elasticsearch.common.settings.Settings settings60 = indexSettings57.getNodeSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = settings60.getAsStructuredMap();
        java.lang.String str63 = settings60.toDelimitedString('#');
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings64 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData65 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters66 = indexMetaData65.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters67 = indexMetaData65.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state68 = indexMetaData65.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder69 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData65);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters70 = indexMetaData65.requireFilters();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData72 = indexMetaData65.mapping("10.0");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData65);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings74 = new org.elasticsearch.common.settings.IndexScopedSettings(settings60, indexScopedSettings64, indexMetaData65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 60000L + "'", long58 == 60000L);
        org.junit.Assert.assertNotNull(parseFieldMatcher59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "index.number_of_replicas.0=index.uuid#index.number_of_replicas.1=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.2=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.3=index.number_of_shards#index.number_of_replicas.4=index.version.upgraded_string#index.number_of_replicas.5=index.version.minimum_compatible#index.number_of_replicas.6=index.data_path#index.number_of_shards=10#index.shared_filesystem.recover_on_any_node=index.data_path#index.version.created=index.uuid#" + "'", str63, "index.number_of_replicas.0=index.uuid#index.number_of_replicas.1=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.2=index.shared_filesystem.recover_on_any_node#index.number_of_replicas.3=index.number_of_shards#index.number_of_replicas.4=index.version.upgraded_string#index.number_of_replicas.5=index.version.minimum_compatible#index.number_of_replicas.6=index.data_path#index.number_of_shards=10#index.shared_filesystem.recover_on_any_node=index.data_path#index.version.created=index.uuid#");
        org.junit.Assert.assertNotNull(indexMetaData65);
        org.junit.Assert.assertNull(discoveryNodeFilters66);
        org.junit.Assert.assertNull(discoveryNodeFilters67);
        org.junit.Assert.assertTrue("'" + state68 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state68.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters70);
        org.junit.Assert.assertNull(mappingMetaData72);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder33.put("index.number_of_replicas", 1);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder33.put("index.blocks.write", (double) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        boolean boolean62 = indexSettings57.getdefaultAllowUnmappedFields();
        java.lang.String str63 = indexSettings57.getDefaultField();
        boolean boolean64 = indexSettings57.warmerEnabled;
        boolean boolean65 = indexSettings57.isShadowReplicaIndex;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.index.translog.Translog.Durability> durabilitySetting66 = indexSettings57.getINDEX_TRANSLOG_DURABILITY_SETTING();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "_all" + "'", str63, "_all");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(durabilitySetting66);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = builder10.index("100.0");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder35.put("state-", (int) '#');
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder38.put("=index.shared_filesystem#index.version.createdindex.shared_filesystem.recover_on_any_node=index.data_path#", "index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData43 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters44 = indexMetaData43.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters45 = indexMetaData43.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData43);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap47 = indexMetaData43.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData43);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings49 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property50 = indexScopedSettings49.getScope();
        boolean boolean52 = indexScopedSettings49.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting54 = indexScopedSettings49.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings55 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property56 = indexScopedSettings55.getScope();
        boolean boolean58 = indexScopedSettings55.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting60 = indexScopedSettings55.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings61 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray68 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray69 = settings61.getAsArray("active_allocations", strArray68);
        java.lang.String str71 = settings61.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings72 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings61);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap74 = settings61.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder75 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder75.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder79 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder82 = builder79.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean84 = indexScopedSettings55.updateSettings(settings61, builder75, builder82, "index.shared_filesystem");
        java.lang.Object obj85 = null;
        boolean boolean86 = settings61.equals(obj85);
        org.elasticsearch.common.settings.Settings settings87 = indexScopedSettings49.dryRun(settings61);
        org.elasticsearch.index.IndexSettings indexSettings88 = new org.elasticsearch.index.IndexSettings(indexMetaData43, settings61);
        org.elasticsearch.Version version89 = indexSettings88.getIndexVersionCreated();
        org.elasticsearch.common.settings.Settings.Builder builder90 = builder38.put("index.priority", version89);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(indexMetaData43);
        org.junit.Assert.assertNull(discoveryNodeFilters44);
        org.junit.Assert.assertNull(discoveryNodeFilters45);
        org.junit.Assert.assertNotNull(strImmutableOpenMap47);
        org.junit.Assert.assertNotNull(indexScopedSettings49);
        org.junit.Assert.assertTrue("'" + property50 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property50.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(wildcardSetting54);
        org.junit.Assert.assertNotNull(indexScopedSettings55);
        org.junit.Assert.assertTrue("'" + property56 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property56.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(wildcardSetting60);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(settings72);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(settings87);
        org.junit.Assert.assertNotNull(version89);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        int int62 = indexSettings57.getNumberOfReplicas();
        boolean boolean63 = indexSettings57.getwarmerEnabled();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = indexSettings57.getIndexMetaData();
        boolean boolean65 = indexSettings57.getisShadowReplicaIndex();
        indexSettings57.setTTLPurgeDisabled(true);
        org.apache.lucene.index.MergePolicy mergePolicy68 = indexSettings57.getMergePolicy();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(indexMetaData64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(mergePolicy68);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.putNull("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder37.putNull("index.creation_date_string");
        org.elasticsearch.common.settings.Settings settings41 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray48 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray49 = settings41.getAsArray("active_allocations", strArray48);
        java.lang.String str51 = settings41.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings52 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings41);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap54 = settings41.getAsGroups(true);
        boolean boolean55 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings41);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = settings41.getAsMap();
        java.lang.String[] strArray58 = settings41.getAsArray("index.version.created");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder37.extendArray("index.auto_expand_replicas", strArray58);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(settings41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.unit.TimeValue timeValue61 = org.elasticsearch.index.IndexSettings.DEFAULT_GC_DELETES;
        indexSettings57.refreshInterval = timeValue61;
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getdurability();
        int int64 = indexSettings57.numberOfShards;
        org.elasticsearch.index.translog.Translog.Durability durability65 = indexSettings57.getTranslogDurability();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + durability65 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability65.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = indexMetaData0.primaryTerm((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData8 = indexMetaData0.mappingOrDefault("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version10 = indexMetaData0.getCreationVersion();
        int int11 = indexMetaData0.getTotalNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder12 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNull(mappingMetaData8);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.Version version63 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getDEFAULT_REFRESH_INTERVAL();
        boolean boolean65 = indexSettings57.queryStringAllowLeadingWildcard;
        boolean boolean66 = indexSettings57.warmerEnabled;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("index.shared_filesystem");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("index.creation_date");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData60 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.unit.TimeValue timeValue61 = indexSettings57.getDEFAULT_GC_DELETES();
        indexSettings57.setTTLPurgeDisabled(false);
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getDEFAULT_GC_DELETES();
        boolean boolean65 = indexSettings57.isShadowReplicaIndex;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(indexMetaData60);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (-1));
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.removeAlias("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder6.creationDate((long) 100);
        int int11 = builder6.numberOfReplicas();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.unit.TimeValue timeValue61 = org.elasticsearch.index.IndexSettings.DEFAULT_GC_DELETES;
        indexSettings57.refreshInterval = timeValue61;
        boolean boolean63 = indexSettings57.isIndexUsingShadowReplicas();
        indexSettings57.warmerEnabled = true;
        indexSettings57.setwarmerEnabled(false);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting68 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(booleanSetting68);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.elasticsearch.common.settings.Settings settings0 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder1 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params2 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder3 = settings0.toXContent(xContentBuilder1, params2);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap6 = settings0.getGroups("index.shared_filesystem", true);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = settings0.getAsMap();
        java.util.Set<java.lang.String> strSet8 = settings0.names();
        org.junit.Assert.assertNotNull(settings0);
        org.junit.Assert.assertNotNull(params2);
        org.junit.Assert.assertNull(xContentBuilder3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        long long58 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting59 = indexSettings57.getMAX_REFRESH_LISTENERS_PER_SHARD();
        org.elasticsearch.common.settings.Settings settings60 = indexSettings57.getNodeSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 60000L + "'", long58 == 60000L);
        org.junit.Assert.assertNotNull(intSetting59);
        org.junit.Assert.assertNotNull(settings60);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings2 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray9 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray10 = settings2.getAsArray("active_allocations", strArray9);
        java.lang.String str12 = settings2.toDelimitedString('4');
        indexScopedSettings0.validate("index.number_of_shards", settings2);
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters17 = indexMetaData16.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData16.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state19 = indexMetaData16.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings20.getScope();
        boolean boolean23 = indexScopedSettings20.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings20.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings26 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property27 = indexScopedSettings26.getScope();
        boolean boolean29 = indexScopedSettings26.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting31 = indexScopedSettings26.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray39 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray40 = settings32.getAsArray("active_allocations", strArray39);
        java.lang.String str42 = settings32.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings43 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings32);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap45 = settings32.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder50 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder50.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean55 = indexScopedSettings26.updateSettings(settings32, builder46, builder53, "index.shared_filesystem");
        java.lang.Object obj56 = null;
        boolean boolean57 = settings32.equals(obj56);
        org.elasticsearch.common.settings.Settings settings58 = indexScopedSettings20.dryRun(settings32);
        org.elasticsearch.common.settings.Settings settings60 = settings58.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate61 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings62 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property63 = indexScopedSettings62.getScope();
        boolean boolean65 = indexScopedSettings62.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting67 = indexScopedSettings62.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings68 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData16, settings60, strPredicate61, indexScopedSettings62);
        org.elasticsearch.common.settings.Settings settings69 = indexScopedSettings0.applySettings(settings60);
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = settings69.getAsStructuredMap();
        boolean boolean71 = org.elasticsearch.cluster.metadata.IndexMetaData.isOnSharedFilesystem(settings69);
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = settings69.getAsStructuredMap();
        org.elasticsearch.common.settings.Settings.Builder builder74 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder75 = builder74.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder78 = builder75.put("index.blocks.metadata", (double) 10.0f);
        java.lang.String[] strArray84 = new java.lang.String[] { "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "active_allocations", "archived." };
        org.elasticsearch.common.settings.Settings.Builder builder85 = builder75.extendArray("index.shared_filesystem.recover_on_any_node", strArray84);
        java.lang.String[] strArray86 = settings69.getAsArray("index.version.created", strArray84);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexMetaData16);
        org.junit.Assert.assertNull(discoveryNodeFilters17);
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state19.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardSetting25);
        org.junit.Assert.assertNotNull(indexScopedSettings26);
        org.junit.Assert.assertTrue("'" + property27 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property27.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardSetting31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(indexScopedSettings62);
        org.junit.Assert.assertTrue("'" + property63 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property63.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(wildcardSetting67);
        org.junit.Assert.assertNotNull(settings69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = builder32.internalMap();
        org.elasticsearch.common.settings.Settings settings34 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder32.put("index.number_of_replicas", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder37.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder37.put("10.0", "index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder37.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder37.normalizePrefix("10.0");
        java.lang.String str47 = builder45.remove("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder45.normalizePrefix("index.data_path");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        org.elasticsearch.Version version62 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.index.translog.Translog.Durability> durabilitySetting63 = indexSettings57.getINDEX_TRANSLOG_DURABILITY_SETTING();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig64 = indexSettings57.getmergePolicyConfig();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(version62);
        org.junit.Assert.assertNotNull(durabilitySetting63);
        org.junit.Assert.assertNotNull(mergePolicyConfig64);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int29 = indexSettings28.getMaxRescoreWindow();
        boolean boolean30 = indexSettings28.queryStringAllowLeadingWildcard;
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig31 = indexSettings28.mergeSchedulerConfig;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig31);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        byte byte4 = state3.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.state(state3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder1.version(0L);
        org.elasticsearch.cluster.metadata.AliasMetaData.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.putAlias(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder1.loadFromSource("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = settings6.getAsMap();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str20 = indexScopedSettings19.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings19.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Function<java.lang.String, java.lang.String> strFunction22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder3.putProperties(strMap18, strPredicate21, strFunction22);
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder3.put("index.number_of_shards", false);
        java.lang.String str28 = builder26.get("index.version.created_string");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strPredicate21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        long long53 = 0L; // flaky: indexSettings52.gcDeletesInMillis;
        org.elasticsearch.common.unit.TimeValue timeValue54 = null; // flaky: indexSettings52.refreshInterval;
        boolean boolean55 = false; // flaky: indexSettings52.queryStringAllowLeadingWildcard;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 60000L + "'", long53 == 60000L);
// flaky:         org.junit.Assert.assertNotNull(timeValue54);
// flaky:         org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder6 = builder3.put("active_allocations", (double) 0.0f);
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder3.put("", (float) (short) 100);
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder3.put("_na_", "index.version.created");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = builder3.internalMap();
        java.nio.file.Path path14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder15 = builder3.loadFromPath(path14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.Version version63 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue64 = indexSettings57.getFlushThresholdSize();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings65 = indexSettings57.getScopedSettings();
        boolean boolean67 = indexScopedSettings65.hasDynamicSetting("index.");
        boolean boolean69 = indexScopedSettings65.hasDynamicSetting("index.=null4index.blocks.metadata=10.04index.creation_date_string=null4index.shared_filesystem.recover_on_any_node.0=index.shared_filesystem.recover_on_any_node4index.shared_filesystem.recover_on_any_node.1=index.version.upgraded_string4index.shared_filesystem.recover_on_any_node.2=active_allocations4index.shared_filesystem.recover_on_any_node.3=archived.4");
        java.lang.String str70 = indexScopedSettings65.nodeName();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNull(byteSizeValue64);
        org.junit.Assert.assertNotNull(indexScopedSettings65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getTranslogDurability();
        boolean boolean64 = indexSettings57.getisShadowReplicaIndex();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting65 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher66 = indexSettings57.getParseFieldMatcher();
        indexSettings57.setTTLPurgeDisabled(false);
        org.elasticsearch.Version version69 = indexSettings57.getIndexVersionCreated();
        org.apache.lucene.index.MergePolicy mergePolicy70 = indexSettings57.getMergePolicy();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intSetting65);
        org.junit.Assert.assertNotNull(parseFieldMatcher66);
        org.junit.Assert.assertNotNull(version69);
        org.junit.Assert.assertNotNull(mergePolicy70);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.Version version63 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings64 = indexSettings57.scopedSettings;
        java.lang.String str65 = indexSettings57.defaultField;
        boolean boolean67 = indexSettings57.matchesIndexName("index.blocks.write");
        boolean boolean68 = indexSettings57.TTLPurgeDisabled;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(indexScopedSettings64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "_all" + "'", str65, "_all");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state10 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings11.getScope();
        boolean boolean14 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params18 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder19 = settings16.toXContent(xContentBuilder17, params18);
        boolean boolean20 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings16);
        indexScopedSettings11.validate("index.shared_filesystem.recover_on_any_node", settings16);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings24 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray31 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray32 = settings24.getAsArray("active_allocations", strArray31);
        java.lang.String str34 = settings24.toDelimitedString('4');
        indexScopedSettings22.validate("index.number_of_shards", settings24);
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings24);
        org.elasticsearch.common.settings.Settings settings37 = indexScopedSettings11.archiveUnknownOrBrokenSettings(settings24);
        org.elasticsearch.common.settings.Settings settings39 = settings24.getByPrefix("index.priority");
        java.lang.String[] strArray41 = null;
        java.lang.String[] strArray43 = settings39.getAsArray("archived.", strArray41, (java.lang.Boolean) false);
        java.lang.String str46 = settings39.get("index.auto_expand_replicas", "index.creation_date_string");
        org.elasticsearch.index.IndexSettings indexSettings47 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings39);
        boolean boolean48 = indexSettings47.isQueryStringAnalyzeWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + state10 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state10.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(params18);
        org.junit.Assert.assertNull(xContentBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertNotNull(settings24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(settings37);
        org.junit.Assert.assertNotNull(settings39);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "index.creation_date_string" + "'", str46, "index.creation_date_string");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("state-", (double) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder50.loadFromSource("index.blocks.read");
        java.lang.String str54 = builder50.get("index.auto_expand_replicas");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder56 = builder50.put(objDictionary55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder3 = builder0.putNull("index.");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.index.translog.Translog.Durability durability59 = null;
        indexSettings57.durability = durability59;
        indexSettings57.setwarmerEnabled(false);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting63 = indexSettings57.getINDEX_GC_DELETES_SETTING();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(timeValueSetting63);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int6 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData5.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData5.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state8 = indexMetaData5.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData5);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData5.mapping("index.creation_date");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings12.getScope();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings12.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray25 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray26 = settings18.getAsArray("active_allocations", strArray25);
        java.lang.String str28 = settings18.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings18.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder32 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder36 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder36.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean41 = indexScopedSettings12.updateSettings(settings18, builder32, builder39, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.put("index.number_of_shards", 10L);
        java.lang.String[] strArray53 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder44.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList54);
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder44.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings60 = builder44.build();
        java.lang.Boolean boolean63 = settings60.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue65 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue66 = settings60.getAsBytesSize("index.blocks.read", byteSizeValue65);
        org.elasticsearch.index.IndexSettings indexSettings67 = new org.elasticsearch.index.IndexSettings(indexMetaData5, settings60);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings68 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray77 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray78 = settings70.getAsArray("active_allocations", strArray77);
        java.lang.String str80 = settings70.toDelimitedString('4');
        indexScopedSettings68.validate("index.number_of_shards", settings70);
        java.util.function.Predicate<java.lang.String> strPredicate82 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings83 = settings70.filter(strPredicate82);
        org.elasticsearch.common.unit.TimeValue timeValue85 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue86 = settings83.getAsTime("index.number_of_replicas", timeValue85);
        java.lang.Boolean boolean89 = settings83.getAsBoolean("_all", (java.lang.Boolean) true);
        org.elasticsearch.index.IndexSettings indexSettings90 = new org.elasticsearch.index.IndexSettings(indexMetaData5, settings83);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting91 = indexSettings90.getINDEX_TTL_DISABLE_PURGE_SETTING();
        org.elasticsearch.common.unit.TimeValue timeValue92 = indexSettings90.getDEFAULT_REFRESH_INTERVAL();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue93 = indexSettings90.getFlushThresholdSize();
        boolean boolean94 = indexMetaData0.equals((java.lang.Object) byteSizeValue93);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertTrue("'" + state8 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state8.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertEquals("'" + boolean63 + "' != '" + false + "'", boolean63, false);
        org.junit.Assert.assertNull(byteSizeValue66);
        org.junit.Assert.assertNotNull(indexScopedSettings68);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strPredicate82);
        org.junit.Assert.assertNotNull(settings83);
        org.junit.Assert.assertNotNull(timeValue85);
        org.junit.Assert.assertNotNull(timeValue86);
        org.junit.Assert.assertEquals("'" + boolean89 + "' != '" + true + "'", boolean89, true);
        org.junit.Assert.assertNotNull(booleanSetting91);
        org.junit.Assert.assertNotNull(timeValue92);
        org.junit.Assert.assertNotNull(byteSizeValue93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData1 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData1.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters3 = indexMetaData1.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state4 = indexMetaData1.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData1.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData1);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData1.getState();
        boolean boolean11 = indexMetaData1.isSameUUID("index.version.upgraded");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<org.elasticsearch.index.shard.ShardId> shardIdSet13 = org.elasticsearch.cluster.metadata.IndexMetaData.selectShrinkShards(52, indexMetaData1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the number of target shards (0) must be greater than the shard id: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNull(discoveryNodeFilters3);
        org.junit.Assert.assertTrue("'" + state4 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state4.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.putNull("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder35.put("", true);
        java.lang.String str42 = builder35.remove("state-");
        java.util.Dictionary<java.lang.Object, java.lang.Object> objDictionary43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder44 = builder35.put(objDictionary43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.version((long) '#');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.version((long) (-1));
        java.lang.String str6 = builder5.index();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap53 = indexMetaData0.getCustoms();
        int int54 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.apache.lucene.util.Version version56 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters57 = indexMetaData0.includeFilters();
        long long58 = indexMetaData0.getVersion();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
        org.junit.Assert.assertNotNull(strImmutableOpenMap53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(version56);
        org.junit.Assert.assertNull(discoveryNodeFilters57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder20.loadFromSource("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder39.index("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom45 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder43.putCustom("", custom45);
        java.lang.Class<?> wildcardClass47 = builder43.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder20.put("archived.", (java.lang.Class) wildcardClass47);
        java.lang.String str50 = builder48.get("index.shadow_replicas");
        java.lang.String str52 = builder48.get("index.version.minimum_compatible");
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder48.putNull("index.priority");
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder48.put("active_allocations", "index.version.upgraded");
        org.elasticsearch.common.settings.Settings.Builder builder60 = builder57.put("index.number_of_shards=10 index.shared_filesystem.recover_on_any_node=index.data_path index.version.minimum_compatible=60000.0 ", (long) (short) 1);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.Version version63 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings64 = indexSettings57.scopedSettings;
        boolean boolean66 = indexScopedSettings64.hasDynamicSetting("primary_terms");
        java.util.function.Predicate<java.lang.String> strPredicate67 = indexScopedSettings64.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNotNull(indexScopedSettings64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strPredicate67);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray16 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray17 = settings9.getAsArray("active_allocations", strArray16);
        java.lang.String str19 = settings9.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        boolean boolean22 = settings21.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings21);
        long long24 = indexSettings23.gcDeletesInMillis;
        org.apache.lucene.index.MergePolicy mergePolicy25 = indexSettings23.getMergePolicy();
        indexSettings23.setwarmerEnabled(true);
        indexSettings23.setTTLPurgeDisabled(true);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting30 = indexSettings23.getINDEX_GC_DELETES_SETTING();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60000L + "'", long24 == 60000L);
        org.junit.Assert.assertNotNull(mergePolicy25);
        org.junit.Assert.assertNotNull(timeValueSetting30);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.lang.String str62 = indexSettings57.defaultField;
        java.lang.String str63 = indexSettings57.customDataPath();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "_all" + "'", str62, "_all");
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting64 = indexSettings57.getINDEX_REFRESH_INTERVAL_SETTING();
        org.elasticsearch.common.logging.ESLogger eSLogger65 = indexSettings57.getlogger();
        org.elasticsearch.common.unit.TimeValue timeValue66 = null;
        indexSettings57.setRefreshInterval(timeValue66);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValueSetting64);
        org.junit.Assert.assertNotNull(eSLogger65);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder20.putNull("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder20.putNull("index.shared_filesystem");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        boolean boolean29 = indexSettings28.getqueryStringAllowLeadingWildcard();
        java.lang.String str30 = indexSettings28.getUUID();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue31 = indexSettings28.flushThresholdSize;
        org.elasticsearch.common.settings.Settings settings32 = indexSettings28.nodeSettings;
        org.apache.lucene.index.MergePolicy mergePolicy33 = indexSettings28.getMergePolicy();
        boolean boolean34 = indexSettings28.isQueryStringAnalyzeWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_na_" + "'", str30, "_na_");
        org.junit.Assert.assertNotNull(byteSizeValue31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(mergePolicy33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
        org.elasticsearch.common.settings.Settings settings8 = indexMetaData7.getSettings();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = null;
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = settings10.toXContent(xContentBuilder11, params12);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap16 = settings10.getGroups("index.shared_filesystem", true);
        java.lang.Object obj17 = null;
        boolean boolean18 = settings10.equals(obj17);
        org.elasticsearch.common.settings.Settings settings20 = settings10.getByPrefix("primary_terms");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = settings10.getAsStructuredMap();
        java.lang.String str24 = settings10.get("index.shared_filesystem", "");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings26 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property27 = indexScopedSettings26.getScope();
        boolean boolean29 = indexScopedSettings26.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting31 = indexScopedSettings26.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray39 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray40 = settings32.getAsArray("active_allocations", strArray39);
        java.lang.String str42 = settings32.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings43 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings32);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap45 = settings32.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder46 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder50 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder50.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean55 = indexScopedSettings26.updateSettings(settings32, builder46, builder53, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings57 = settings32.getByPrefix("index.version.upgraded_string");
        java.lang.Object obj58 = null;
        boolean boolean59 = settings32.equals(obj58);
        java.util.Set<java.lang.String> strSet60 = settings32.names();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder61 = null;
        org.elasticsearch.common.settings.Settings settings62 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder63 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params64 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder65 = settings62.toXContent(xContentBuilder63, params64);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder66 = settings32.toXContent(xContentBuilder61, params64);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder67 = settings10.toXContent(xContentBuilder25, params64);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder68 = settings8.toXContent(xContentBuilder9, params64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexMetaData7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(params12);
        org.junit.Assert.assertNull(xContentBuilder13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(indexScopedSettings26);
        org.junit.Assert.assertTrue("'" + property27 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property27.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardSetting31);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(settings57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertNotNull(params64);
        org.junit.Assert.assertNull(xContentBuilder65);
        org.junit.Assert.assertNull(xContentBuilder66);
        org.junit.Assert.assertNull(xContentBuilder67);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder32.put("index.shared_filesystem.recover_on_any_node", "");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = builder48.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder48.put("index.number_of_replicas", (long) 10);
        org.elasticsearch.common.settings.Settings settings53 = builder52.build();
        java.util.concurrent.TimeUnit timeUnit56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder57 = builder52.put("", (long) (short) 10, timeUnit56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(settings53);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfReplicas((int) 'a');
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = builder1.mapping("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.numberOfShards(1000);
        java.lang.String str9 = builder1.index();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "index.version.minimum_compatible" + "'", str9, "index.version.minimum_compatible");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig63 = indexSettings57.mergePolicyConfig;
        java.lang.String str64 = indexSettings57.defaultField;
        boolean boolean65 = indexSettings57.isDefaultAllowUnmappedFields();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertNotNull(mergePolicyConfig63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "_all" + "'", str64, "_all");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.Version version6 = indexMetaData0.getUpgradedVersion();
        int int7 = indexMetaData0.getRoutingNumShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(version6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = builder8.putCustom("index.blocks.write", custom10);
        long long13 = builder11.primaryTerm(0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap6 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData0.getInitialRecoveryFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(strImmutableOpenMap6);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        org.elasticsearch.common.settings.Settings settings62 = indexMetaData61.getSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state63 = indexMetaData61.getState();
        java.lang.String str64 = indexMetaData61.getIndexUUID();
        int int65 = indexMetaData61.getTotalNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertTrue("'" + state63 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state63.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "_na_" + "'", str64, "_na_");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder7.put("index.version.minimum_compatible", true);
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder7.normalizePrefix("index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder40.put("index.blocks.write", "index.shadow_replicas");
        java.lang.String[] strArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder46 = builder40.putArray("index.auto_expand_replicas", strArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        boolean boolean62 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getTranslogDurability();
        org.elasticsearch.common.settings.Settings settings64 = indexSettings57.settings;
        org.elasticsearch.common.unit.TimeValue timeValue65 = indexSettings57.refreshInterval;
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting66 = indexSettings57.getMAX_REFRESH_LISTENERS_PER_SHARD();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(intSetting66);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        int int4 = indexMetaData0.getRoutingNumShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.util.function.Predicate<java.lang.String> strPredicate29 = indexSettings28.getindexNameMatcher();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = indexSettings28.getIndexMetaData();
        indexSettings28.setEnableWarmer(false);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strPredicate29);
        org.junit.Assert.assertNotNull(indexMetaData30);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings48 = builder32.build();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings49 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings51 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray58 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray59 = settings51.getAsArray("active_allocations", strArray58);
        java.lang.String str61 = settings51.toDelimitedString('4');
        indexScopedSettings49.validate("index.number_of_shards", settings51);
        java.util.function.Predicate<java.lang.String> strPredicate63 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings64 = settings51.filter(strPredicate63);
        org.elasticsearch.common.settings.Settings settings65 = settings48.filter(strPredicate63);
        java.lang.String str67 = settings48.toDelimitedString(' ');
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNotNull(indexScopedSettings49);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(strPredicate63);
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "index.number_of_replicas.0=index.uuid index.number_of_replicas.1=index.shared_filesystem.recover_on_any_node index.number_of_replicas.2=index.shared_filesystem.recover_on_any_node index.number_of_replicas.3=index.number_of_shards index.number_of_replicas.4=index.version.upgraded_string index.number_of_replicas.5=index.version.minimum_compatible index.number_of_replicas.6=index.data_path index.number_of_shards=10 index.shared_filesystem.recover_on_any_node=index.data_path index.version.created=index.uuid " + "'", str67, "index.number_of_replicas.0=index.uuid index.number_of_replicas.1=index.shared_filesystem.recover_on_any_node index.number_of_replicas.2=index.shared_filesystem.recover_on_any_node index.number_of_replicas.3=index.number_of_shards index.number_of_replicas.4=index.version.upgraded_string index.number_of_replicas.5=index.version.minimum_compatible index.number_of_replicas.6=index.data_path index.number_of_shards=10 index.shared_filesystem.recover_on_any_node=index.data_path index.version.created=index.uuid ");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder27.putNull("index.blocks.metadata");
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder27.putNull("index.");
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder27.normalizePrefix("false");
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder27.put("index.blocks.write", "10");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.numberOfShards((int) (short) 1);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.putCustom("index.shared_filesystem", custom5);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder6.creationDate(60000L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = builder8.index("");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mappingOrDefault("");
        int int11 = indexMetaData0.getRoutingNumShards();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = indexMetaData0.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.elasticsearch.common.settings.Settings settings62 = indexSettings57.getSettings();
        indexSettings57.setMaxResultWindow((int) (byte) 100);
        boolean boolean65 = indexSettings57.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher66 = indexSettings57.parseFieldMatcher;
        java.util.function.Predicate<java.lang.String> strPredicate67 = indexSettings57.indexNameMatcher;
        boolean boolean68 = indexSettings57.defaultAllowUnmappedFields;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(parseFieldMatcher66);
        org.junit.Assert.assertNotNull(strPredicate67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings63 = indexSettings57.getScopedSettings();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters65 = indexMetaData64.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters66 = indexMetaData64.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state67 = indexMetaData64.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder68 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData64);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters69 = indexMetaData64.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap70 = indexMetaData64.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder71 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData64);
        int int72 = indexMetaData64.getRoutingNumShards();
        boolean boolean73 = indexSettings57.updateIndexMetaData(indexMetaData64);
        java.lang.String str74 = indexSettings57.getDefaultField();
        org.elasticsearch.index.translog.Translog.Durability durability75 = indexSettings57.durability;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(indexScopedSettings63);
        org.junit.Assert.assertNotNull(indexMetaData64);
        org.junit.Assert.assertNull(discoveryNodeFilters65);
        org.junit.Assert.assertNull(discoveryNodeFilters66);
        org.junit.Assert.assertTrue("'" + state67 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state67.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters69);
        org.junit.Assert.assertNotNull(strImmutableOpenMap70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "_all" + "'", str74, "_all");
        org.junit.Assert.assertTrue("'" + durability75 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability75.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder20.loadFromSource("index.number_of_replicas");
        org.elasticsearch.common.settings.Settings settings35 = builder34.build();
        boolean boolean36 = settings35.isEmpty();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(settings35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        int int59 = indexSettings57.getMaxResultWindow();
        int int60 = indexSettings57.getMaxResultWindow();
        org.elasticsearch.common.unit.TimeValue timeValue61 = indexSettings57.getTranslogSyncInterval();
        org.elasticsearch.Version version62 = indexSettings57.getversion();
        indexSettings57.setTTLPurgeDisabled(true);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10000 + "'", int59 == 10000);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10000 + "'", int60 == 10000);
        org.junit.Assert.assertNotNull(timeValue61);
        org.junit.Assert.assertNotNull(version62);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = builder32.internalMap();
        org.elasticsearch.common.settings.Settings settings34 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder32.put("index.number_of_replicas", "index.number_of_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder37.normalizePrefix("index.auto_expand_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder37.put("10.0", "index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder37.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder37.normalizePrefix("10.0");
        java.lang.String str47 = builder45.remove("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder45.put("index.number_of_shards", false);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        java.util.function.Predicate<java.lang.String> strPredicate29 = indexSettings28.getindexNameMatcher();
        indexSettings28.setMaxRefreshListeners((int) (short) 0);
        int int32 = indexSettings28.getNumberOfShards();
        indexSettings28.setwarmerEnabled(false);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strPredicate29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings settings4 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray11 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray12 = settings4.getAsArray("active_allocations", strArray11);
        java.lang.String str14 = settings4.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings15 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings4);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap17 = settings4.getAsGroups(true);
        boolean boolean18 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings4);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue20 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue21 = settings4.getAsBytesSize("100.0", byteSizeValue20);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap23 = settings4.getGroups("_na_");
        org.elasticsearch.index.IndexSettings indexSettings24 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings4);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters26 = indexMetaData25.getInitialRecoveryFilters();
        boolean boolean28 = indexMetaData25.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings29 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings31 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray38 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray39 = settings31.getAsArray("active_allocations", strArray38);
        java.lang.String str41 = settings31.toDelimitedString('4');
        indexScopedSettings29.validate("index.number_of_shards", settings31);
        java.util.function.Predicate<java.lang.String> strPredicate43 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings44 = settings31.filter(strPredicate43);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder45 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params46 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder47 = settings31.toXContent(xContentBuilder45, params46);
        org.elasticsearch.Version version49 = null;
        org.elasticsearch.Version version50 = settings31.getAsVersion("index.blocks.metadata", version49);
        java.util.function.Predicate<java.lang.String> strPredicate51 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings52 = settings31.filter(strPredicate51);
        org.elasticsearch.index.IndexSettings indexSettings53 = new org.elasticsearch.index.IndexSettings(indexMetaData25, settings31);
        boolean boolean54 = indexSettings53.getqueryStringAllowLeadingWildcard();
        java.lang.String str55 = indexSettings53.getUUID();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue56 = indexSettings53.flushThresholdSize;
        indexSettings24.flushThresholdSize = byteSizeValue56;
        org.elasticsearch.index.translog.Translog.Durability durability58 = indexSettings24.getTranslogDurability();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(settings15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteSizeValue21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(indexMetaData25);
        org.junit.Assert.assertNull(discoveryNodeFilters26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings29);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strPredicate43);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(params46);
        org.junit.Assert.assertNull(xContentBuilder47);
        org.junit.Assert.assertNull(version50);
        org.junit.Assert.assertNotNull(strPredicate51);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "_na_" + "'", str55, "_na_");
        org.junit.Assert.assertNotNull(byteSizeValue56);
        org.junit.Assert.assertTrue("'" + durability58 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability58.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData5 = builder3.mapping("index.number_of_replicas=0 index.number_of_shards=1 index.version.created=5000099 ");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = builder3.build();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(mappingMetaData5);
        org.junit.Assert.assertNotNull(indexMetaData6);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.Version version59 = indexSettings57.getversion();
        boolean boolean60 = indexSettings57.warmerEnabled;
        boolean boolean61 = indexSettings57.queryStringAllowLeadingWildcard;
        org.apache.lucene.index.MergePolicy mergePolicy62 = indexSettings57.getMergePolicy();
        boolean boolean63 = indexSettings57.warmerEnabled;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(mergePolicy62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder32.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.shadow_replicas", (long) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder49.put("", false);
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder49.put("false", (-1.0f));
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder49.put("=index.shared_filesystem#index.version.createdindex.shared_filesystem.recover_on_any_node=index.data_path#", 32L);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("100.0");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate((long) 100);
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.putAlias(aliasMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder7.index("archived.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData58 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters59 = indexMetaData58.getInitialRecoveryFilters();
        int int60 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.index.Index index61 = indexMetaData58.getMergeSourceIndex();
        int int62 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff63 = indexMetaData0.diff(indexMetaData58);
        boolean boolean65 = indexMetaData58.isSameUUID("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("active_allocations");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom69 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder70 = builder67.putCustom("index.version.upgraded_string", custom69);
        boolean boolean71 = indexMetaData58.equals((java.lang.Object) builder67);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(indexMetaData58);
        org.junit.Assert.assertNull(discoveryNodeFilters59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(index61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.Version version63 = indexSettings57.getversion();
        java.lang.String str64 = indexSettings57.customDataPath();
        org.elasticsearch.common.unit.TimeValue timeValue65 = indexSettings57.syncInterval;
        int int66 = indexSettings57.maxRefreshListeners;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1000 + "'", int66 == 1000);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.Version version59 = indexSettings57.getversion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings60 = indexSettings57.getScopedSettings();
        org.elasticsearch.Version version61 = indexSettings57.getIndexVersionCreated();
        indexSettings57.setwarmerEnabled(false);
        indexSettings57.setMaxResultWindow(0);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting66 = indexSettings57.getQUERY_STRING_ALLOW_LEADING_WILDCARD();
        org.elasticsearch.Version version67 = indexSettings57.getversion();
        boolean boolean68 = indexSettings57.queryStringAnalyzeWildcard;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(indexScopedSettings60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(booleanSetting66);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        int int29 = indexSettings28.getMaxRescoreWindow();
        boolean boolean30 = indexSettings28.queryStringAllowLeadingWildcard;
        org.elasticsearch.common.unit.TimeValue timeValue31 = indexSettings28.getsyncInterval();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings32 = indexSettings28.scopedSettings;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings33 = indexScopedSettings32.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(indexScopedSettings32);
        org.junit.Assert.assertNotNull(indexScopedSettings33);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        boolean boolean62 = indexSettings57.getqueryStringLenient();
        org.elasticsearch.common.logging.ESLogger eSLogger63 = indexSettings57.getlogger();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = indexSettings57.indexMetaData;
        org.elasticsearch.common.unit.TimeValue timeValue65 = indexSettings57.getRefreshInterval();
        org.elasticsearch.Version version66 = indexSettings57.getIndexVersionCreated();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(eSLogger63);
        org.junit.Assert.assertNotNull(indexMetaData64);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(version66);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.requireFilters();
        int int3 = indexMetaData0.getNumberOfReplicas();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters4 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = indexMetaData0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(discoveryNodeFilters4);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.Version version59 = indexSettings57.getversion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings60 = indexSettings57.getScopedSettings();
        org.elasticsearch.Version version61 = indexSettings57.getIndexVersionCreated();
        indexSettings57.setwarmerEnabled(false);
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig64 = indexSettings57.mergeSchedulerConfig;
        int int65 = indexSettings57.maxRefreshListeners;
        indexSettings57.maxRefreshListeners = '4';
        org.elasticsearch.common.unit.TimeValue timeValue68 = indexSettings57.getTranslogSyncInterval();
        boolean boolean69 = indexSettings57.warmerEnabled;
        indexSettings57.warmerEnabled = true;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher72 = indexSettings57.getParseFieldMatcher();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(version59);
        org.junit.Assert.assertNotNull(indexScopedSettings60);
        org.junit.Assert.assertNotNull(version61);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1000 + "'", int65 == 1000);
        org.junit.Assert.assertNotNull(timeValue68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(parseFieldMatcher72);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings31 = settings6.getByPrefix("index.version.upgraded_string");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = null;
        org.elasticsearch.common.settings.Settings settings33 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params35 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = settings33.toXContent(xContentBuilder34, params35);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder37 = settings31.toXContent(xContentBuilder32, params35);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = settings31.getAsMap();
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap41 = settings31.getGroups("index.number_of_replicas", true);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertNotNull(params35);
        org.junit.Assert.assertNull(xContentBuilder36);
        org.junit.Assert.assertNull(xContentBuilder37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        long long58 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher59 = indexSettings57.getParseFieldMatcher();
        indexSettings57.maxResultWindow = 10;
        boolean boolean62 = indexSettings57.getqueryStringLenient();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting63 = indexSettings57.getINDEX_CHECK_ON_STARTUP();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 60000L + "'", long58 == 60000L);
        org.junit.Assert.assertNotNull(parseFieldMatcher59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSetting63);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder32.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.shadow_replicas", (long) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder49.put("", false);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = builder49.internalMap();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
// flaky:         indexSettings52.setMaxRefreshListeners(1);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.loadFromSource("index.version.created");
        org.elasticsearch.common.settings.Settings settings48 = builder47.build();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(settings48);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings6.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings12.getScope();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings12.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray25 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray26 = settings18.getAsArray("active_allocations", strArray25);
        java.lang.String str28 = settings18.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap31 = settings18.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder32 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder36 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder36.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean41 = indexScopedSettings12.updateSettings(settings18, builder32, builder39, "index.shared_filesystem");
        java.lang.Object obj42 = null;
        boolean boolean43 = settings18.equals(obj42);
        org.elasticsearch.common.settings.Settings settings44 = indexScopedSettings6.dryRun(settings18);
        org.elasticsearch.index.IndexSettings indexSettings45 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings18);
        org.elasticsearch.Version version46 = indexSettings45.getIndexVersionCreated();
        indexSettings45.gcDeletesInMillis = 52;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher49 = indexSettings45.parseFieldMatcher;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(parseFieldMatcher49);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.common.settings.Settings settings2 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.settings(settings2);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder3.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        org.junit.Assert.assertNotNull(settings2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.elasticsearch.Version version8 = indexMetaData0.getUpgradedVersion();
        org.apache.lucene.util.Version version9 = indexMetaData0.getMinimumCompatibleVersion();
        int int10 = indexMetaData0.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting60 = indexSettings57.getMAX_RESULT_WINDOW_SETTING();
        java.util.function.Predicate<java.lang.String> strPredicate61 = indexSettings57.getindexNameMatcher();
        org.elasticsearch.index.translog.Translog.Durability durability62 = indexSettings57.durability;
        boolean boolean63 = indexSettings57.isShadowReplicaIndex;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(intSetting60);
        org.junit.Assert.assertNotNull(strPredicate61);
        org.junit.Assert.assertTrue("'" + durability62 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability62.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting60 = indexSettings57.getMAX_RESULT_WINDOW_SETTING();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.elasticsearch.index.translog.Translog.Durability durability62 = indexSettings57.getTranslogDurability();
        indexSettings57.setEnableWarmer(false);
        boolean boolean65 = indexSettings57.isQueryStringAllowLeadingWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(intSetting60);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertTrue("'" + durability62 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability62.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData4.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters6 = indexMetaData4.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap8 = indexMetaData4.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData4);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData11 = indexMetaData4.mapping("index.blocks.read_only");
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff12 = indexMetaData0.diff(indexMetaData4);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings13.getScope();
        boolean boolean16 = indexScopedSettings13.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings13.get("active_allocations");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting20 = org.elasticsearch.cluster.metadata.IndexMetaData.INDEX_BLOCKS_WRITE_SETTING;
        java.util.function.Consumer<java.lang.Boolean> booleanConsumer21 = null;
        indexScopedSettings13.addSettingsUpdateConsumer(booleanSetting20, booleanConsumer21);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings23 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings23.getScope();
        boolean boolean26 = indexScopedSettings23.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting28 = indexScopedSettings23.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings29 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray36 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray37 = settings29.getAsArray("active_allocations", strArray36);
        java.lang.String str39 = settings29.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings29);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap42 = settings29.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder43 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder43.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder47 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean52 = indexScopedSettings23.updateSettings(settings29, builder43, builder50, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder43.put("index.number_of_shards", 10L);
        java.lang.String str57 = builder55.remove("");
        org.elasticsearch.common.settings.Settings settings58 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray65 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray66 = settings58.getAsArray("active_allocations", strArray65);
        java.lang.String str68 = settings58.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings69 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings58);
        org.elasticsearch.common.settings.Settings settings70 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings58);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue72 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue73 = settings70.getAsBytesSize("index.creation_date", byteSizeValue72);
        org.elasticsearch.common.settings.Settings.Builder builder74 = builder55.put(settings70);
        org.elasticsearch.common.settings.Settings settings75 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder76 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params77 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder78 = settings75.toXContent(xContentBuilder76, params77);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap81 = settings75.getGroups("index.shared_filesystem", true);
        java.lang.Object obj82 = null;
        boolean boolean83 = settings75.equals(obj82);
        org.elasticsearch.common.settings.Settings settings84 = indexScopedSettings13.diff(settings70, settings75);
        java.util.Map<java.lang.String, java.lang.Object> strMap85 = settings70.getAsStructuredMap();
        boolean boolean86 = settings70.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings87 = new org.elasticsearch.index.IndexSettings(indexMetaData4, settings70);
        boolean boolean88 = indexSettings87.isShadowReplicaIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexMetaData4);
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNull(discoveryNodeFilters6);
        org.junit.Assert.assertNotNull(strImmutableOpenMap8);
        org.junit.Assert.assertNull(mappingMetaData11);
        org.junit.Assert.assertNotNull(indexMetaDataDiff12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertNotNull(booleanSetting20);
        org.junit.Assert.assertNotNull(indexScopedSettings23);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardSetting28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(settings69);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertNull(byteSizeValue73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(settings75);
        org.junit.Assert.assertNotNull(params77);
        org.junit.Assert.assertNull(xContentBuilder78);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(settings84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        int int65 = indexSettings57.getMaxRescoreWindow();
        int int66 = indexSettings57.getMaxRescoreWindow();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig67 = indexSettings57.mergePolicyConfig;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData68 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters69 = indexMetaData68.getInitialRecoveryFilters();
        boolean boolean71 = indexMetaData68.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap72 = indexMetaData68.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state73 = indexMetaData68.getState();
        indexSettings57.indexMetaData = indexMetaData68;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder75 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData68);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10000 + "'", int66 == 10000);
        org.junit.Assert.assertNotNull(mergePolicyConfig67);
        org.junit.Assert.assertNotNull(indexMetaData68);
        org.junit.Assert.assertNull(discoveryNodeFilters69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap72);
        org.junit.Assert.assertTrue("'" + state73 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state73.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        java.lang.String str4 = indexMetaData0.getIndexUUID();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.util.Set<java.lang.String> strSet7 = null; // flaky: indexMetaData0.activeAllocationIds((int) 'a');
        int int8 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_na_" + "'", str4, "_na_");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        long long58 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher59 = indexSettings57.getParseFieldMatcher();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting60 = indexSettings57.getALLOW_UNMAPPED();
        boolean boolean61 = indexSettings57.isIndexUsingShadowReplicas();
        boolean boolean62 = indexSettings57.warmerEnabled;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig63 = indexSettings57.getmergePolicyConfig();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getDEFAULT_REFRESH_INTERVAL();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting65 = indexSettings57.getQUERY_STRING_ALLOW_LEADING_WILDCARD();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 60000L + "'", long58 == 60000L);
        org.junit.Assert.assertNotNull(parseFieldMatcher59);
        org.junit.Assert.assertNotNull(booleanSetting60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(mergePolicyConfig63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertNotNull(booleanSetting65);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder32.loadFromSource("index.number_of_shards");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = builder46.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder46.put("index.number_of_shards=10 index.shared_filesystem.recover_on_any_node=index.data_path index.version.minimum_compatible=60000.0 ", (double) (byte) 10);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        int int65 = indexSettings57.getMaxRescoreWindow();
        org.elasticsearch.common.unit.TimeValue timeValue66 = indexSettings57.getsyncInterval();
        int int67 = indexSettings57.getMaxResultWindow();
        org.elasticsearch.index.translog.Translog.Durability durability68 = indexSettings57.durability;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertNotNull(timeValue66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10000 + "'", int67 == 10000);
        org.junit.Assert.assertTrue("'" + durability68 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability68.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings45 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings47 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray54 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray55 = settings47.getAsArray("active_allocations", strArray54);
        java.lang.String str57 = settings47.toDelimitedString('4');
        indexScopedSettings45.validate("index.number_of_shards", settings47);
        java.util.function.Predicate<java.lang.String> strPredicate59 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings60 = settings47.filter(strPredicate59);
        org.elasticsearch.common.unit.TimeValue timeValue62 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue63 = settings60.getAsTime("index.number_of_replicas", timeValue62);
        org.elasticsearch.common.settings.Settings settings65 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray72 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray73 = settings65.getAsArray("active_allocations", strArray72);
        java.lang.String[] strArray74 = settings60.getAsArray("index.blocks.metadata", strArray73);
        org.elasticsearch.common.settings.Settings.Builder builder75 = builder44.put(settings60);
        java.lang.String str78 = settings60.get("index.shared_filesystem", "index.version.minimum_compatible");
        org.elasticsearch.common.settings.Settings settings80 = settings60.getAsSettings("index.version.created_string");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(indexScopedSettings45);
        org.junit.Assert.assertNotNull(settings47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strPredicate59);
        org.junit.Assert.assertNotNull(settings60);
        org.junit.Assert.assertNotNull(timeValue62);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "index.version.minimum_compatible" + "'", str78, "index.version.minimum_compatible");
        org.junit.Assert.assertNotNull(settings80);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings8.getScope();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings8.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray21 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray22 = settings14.getAsArray("active_allocations", strArray21);
        java.lang.String str24 = settings14.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings25 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings14);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap27 = settings14.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder28 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder31 = builder28.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder32 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder32.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean37 = indexScopedSettings8.updateSettings(settings14, builder28, builder35, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder28.put("index.number_of_shards", 10L);
        java.lang.String[] strArray49 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder40.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList50);
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder40.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings56 = builder40.build();
        java.lang.Boolean boolean59 = settings56.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue61 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue62 = settings56.getAsSize("", sizeValue61);
        org.elasticsearch.index.IndexSettings indexSettings63 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings56);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder65 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = builder65.numberOfReplicas((int) (byte) 10);
        boolean boolean68 = indexMetaData0.equals((java.lang.Object) builder67);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder69 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params70 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder.toXContent(indexMetaData0, xContentBuilder69, params70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(settings25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(settings56);
        org.junit.Assert.assertEquals("'" + boolean59 + "' != '" + false + "'", boolean59, false);
        org.junit.Assert.assertNull(sizeValue62);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        boolean boolean62 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting63 = indexSettings57.getDEFAULT_FIELD_SETTING();
        int int64 = indexSettings57.maxResultWindow;
        org.elasticsearch.Version version65 = indexSettings57.getIndexVersionCreated();
        org.elasticsearch.common.unit.TimeValue timeValue66 = indexSettings57.getsyncInterval();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSetting63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10000 + "'", int64 == 10000);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertNotNull(timeValue66);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.uuid");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.creationDate(100L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.putCustom("100.0", custom5);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap29 = indexMetaData0.getMappings();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings30 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray39 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray40 = settings32.getAsArray("active_allocations", strArray39);
        java.lang.String str42 = settings32.toDelimitedString('4');
        indexScopedSettings30.validate("index.number_of_shards", settings32);
        java.util.function.Predicate<java.lang.String> strPredicate44 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings45 = settings32.filter(strPredicate44);
        org.elasticsearch.common.unit.TimeValue timeValue47 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue48 = settings45.getAsTime("index.number_of_replicas", timeValue47);
        java.lang.String str50 = settings45.get("index.");
        org.elasticsearch.index.IndexSettings indexSettings51 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings45);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder52 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings53 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property54 = indexScopedSettings53.getScope();
        boolean boolean56 = indexScopedSettings53.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings58 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder59 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params60 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder61 = settings58.toXContent(xContentBuilder59, params60);
        boolean boolean62 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings58);
        indexScopedSettings53.validate("index.shared_filesystem.recover_on_any_node", settings58);
        java.lang.String str66 = settings58.get("index.version.upgraded_string", "index.creation_date");
        java.lang.String[] strArray68 = settings58.getAsArray("_all");
        org.elasticsearch.index.IndexSettings indexSettings69 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings58);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strImmutableOpenMap29);
        org.junit.Assert.assertNotNull(indexScopedSettings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strPredicate44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(timeValue48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(indexScopedSettings53);
        org.junit.Assert.assertTrue("'" + property54 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property54.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(settings58);
        org.junit.Assert.assertNotNull(params60);
        org.junit.Assert.assertNull(xContentBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "index.creation_date" + "'", str66, "index.creation_date");
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap53 = indexMetaData0.getCustoms();
        int int54 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder55 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder56 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
        org.junit.Assert.assertNotNull(strImmutableOpenMap53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.unit.TimeValue timeValue63 = indexSettings57.refreshInterval;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting64 = indexSettings57.getQUERY_STRING_LENIENT_SETTING();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.index.translog.Translog.Durability> durabilitySetting65 = indexSettings57.getINDEX_TRANSLOG_DURABILITY_SETTING();
        indexSettings57.maxRefreshListeners = (byte) -1;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(booleanSetting64);
        org.junit.Assert.assertNotNull(durabilitySetting65);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        int int62 = indexSettings57.getMaxRescoreWindow();
        java.lang.String str63 = indexSettings57.defaultField;
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        boolean boolean65 = indexSettings57.getqueryStringAnalyzeWildcard();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting66 = indexSettings57.getDEFAULT_FIELD_SETTING();
        int int67 = indexSettings57.getNumberOfReplicas();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10000 + "'", int62 == 10000);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "_all" + "'", str63, "_all");
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strSetting66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters58 = indexMetaData0.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNull(discoveryNodeFilters58);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.version.minimum_compatible");
        org.apache.lucene.util.Version version8 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray16 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray17 = settings9.getAsArray("active_allocations", strArray16);
        java.lang.String str19 = settings9.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue24 = settings21.getAsBytesSize("index.creation_date", byteSizeValue23);
        org.elasticsearch.index.IndexSettings indexSettings25 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings21);
        org.elasticsearch.common.io.stream.StreamInput streamInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData27 = indexMetaData0.readFrom(streamInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(version8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertNull(byteSizeValue24);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting61 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.elasticsearch.common.settings.Settings settings62 = indexSettings57.getSettings();
        indexSettings57.setMaxResultWindow((int) (byte) 100);
        boolean boolean65 = indexSettings57.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher66 = indexSettings57.parseFieldMatcher;
        java.lang.String str67 = indexSettings57.defaultField;
        boolean boolean68 = indexSettings57.getqueryStringLenient();
        org.elasticsearch.common.settings.Settings settings69 = indexSettings57.settings;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(booleanSetting61);
        org.junit.Assert.assertNotNull(settings62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(parseFieldMatcher66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "_all" + "'", str67, "_all");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(settings69);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray30 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder7.putArray("index.creation_date", (java.util.List<java.lang.String>) strList31);
        org.elasticsearch.common.settings.Settings.Builder builder35 = builder7.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder35.putNull("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder35.put("", true);
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder35.put("false", "_all");
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder43.put("index.auto_expand_replicas", false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder47.put("state-", (double) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder50.loadFromSource("index.blocks.read");
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder50.loadFromSource("index.blocks.read_only");
        java.nio.file.Path path55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder56 = builder50.loadFromPath(path55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        indexSettings57.gcDeletesInMillis = (short) 10;
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting63 = indexSettings57.getMAX_RESULT_WINDOW_SETTING();
        boolean boolean64 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.common.settings.Settings settings65 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray72 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray73 = settings65.getAsArray("active_allocations", strArray72);
        java.lang.String str75 = settings65.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings76 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings65);
        org.elasticsearch.common.settings.Settings settings77 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings65);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue79 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue80 = settings65.getAsBytesSize("", byteSizeValue79);
        indexSettings57.settings = settings65;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(intSetting63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(settings65);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(settings76);
        org.junit.Assert.assertNotNull(settings77);
        org.junit.Assert.assertNull(byteSizeValue80);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder2 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = builder2.putAlias(aliasMetaData3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder47.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder47.put("active_allocations", false);
        org.elasticsearch.common.settings.Settings settings52 = builder51.build();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(settings52);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = indexMetaData0.mapping("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData10 = indexMetaData0.mappingOrDefault("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder11 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap12 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters14 = indexMetaData13.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters15 = indexMetaData13.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state16 = indexMetaData13.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder17 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters18 = indexMetaData13.includeFilters();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap19 = indexMetaData13.getAliases();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData21 = indexMetaData13.mappingOrDefault("index.creation_date");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder22 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData13);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff23 = indexMetaData0.diff(indexMetaData13);
        org.elasticsearch.cluster.metadata.IndexMetaData.State state24 = indexMetaData0.getState();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData6);
        org.junit.Assert.assertNull(mappingMetaData10);
        org.junit.Assert.assertNotNull(strImmutableOpenMap12);
        org.junit.Assert.assertNotNull(indexMetaData13);
        org.junit.Assert.assertNull(discoveryNodeFilters14);
        org.junit.Assert.assertNull(discoveryNodeFilters15);
        org.junit.Assert.assertTrue("'" + state16 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state16.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters18);
        org.junit.Assert.assertNotNull(strImmutableOpenMap19);
        org.junit.Assert.assertNull(mappingMetaData21);
        org.junit.Assert.assertNotNull(indexMetaDataDiff23);
        org.junit.Assert.assertTrue("'" + state24 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state24.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("archived.", (double) (byte) -1);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder20.normalizePrefix("100.0");
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder34.putNull("state-");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.registerPrototype("100.0", custom1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder32.put("index.auto_expand_replicas", (float) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder32.put("", (float) (-1));
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        java.lang.String[] strArray10 = new java.lang.String[] { "index.shared_filesystem.recover_on_any_node", "index.version.upgraded_string", "active_allocations", "archived." };
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder1.extendArray("index.shared_filesystem.recover_on_any_node", strArray10);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder13 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.data_path");
        org.elasticsearch.common.settings.Settings settings14 = org.elasticsearch.common.settings.Settings.EMPTY;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder15 = builder13.settings(settings14);
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder11.put(settings14);
        java.lang.String str18 = builder11.remove("index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder11.put("index.creation_date_string", true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(settings14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings3.getScope();
        boolean boolean6 = indexScopedSettings3.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings3.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray16 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray17 = settings9.getAsArray("active_allocations", strArray16);
        java.lang.String str19 = settings9.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap22 = settings9.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder23 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder26 = builder23.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder27 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder30 = builder27.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean32 = indexScopedSettings3.updateSettings(settings9, builder23, builder30, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings34 = settings9.getByPrefix("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder36 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder38 = builder36.numberOfReplicas((int) 'a');
        boolean boolean39 = settings9.equals((java.lang.Object) 'a');
        org.elasticsearch.common.settings.Settings settings40 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.index.IndexSettings indexSettings41 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings40);
        int int42 = indexMetaData0.getRoutingFactor();
        long long43 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap44 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder45 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(settings34);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(settings40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap44);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        boolean boolean65 = indexSettings57.isShadowReplicaIndex;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting66 = indexSettings57.getQUERY_STRING_ANALYZE_WILDCARD();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting67 = indexSettings57.getMAX_REFRESH_LISTENERS_PER_SHARD();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig68 = indexSettings57.getMergeSchedulerConfig();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(booleanSetting66);
        org.junit.Assert.assertNotNull(intSetting67);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig68);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_shards=10#index.shared_filesystem.recover_on_any_node=index.data_path#");
        int int2 = builder1.numberOfShards();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray12 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray13 = settings5.getAsArray("active_allocations", strArray12);
        java.lang.String str15 = settings5.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean18 = settings17.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings19 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings17);
        org.apache.lucene.util.Version version20 = indexMetaData0.getMinimumCompatibleVersion();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings21.getScope();
        boolean boolean24 = indexScopedSettings21.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting26 = indexScopedSettings21.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray34 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray35 = settings27.getAsArray("active_allocations", strArray34);
        java.lang.String str37 = settings27.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings38 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings27);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap40 = settings27.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder41 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder41.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder45 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder45.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean50 = indexScopedSettings21.updateSettings(settings27, builder41, builder48, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings52 = settings27.getByPrefix("index.version.upgraded_string");
        java.lang.String[] strArray54 = null;
        java.lang.String[] strArray56 = settings27.getAsArray("", strArray54, (java.lang.Boolean) false);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings27);
        org.elasticsearch.common.settings.Setting<org.elasticsearch.index.translog.Translog.Durability> durabilitySetting58 = indexSettings57.getINDEX_TRANSLOG_DURABILITY_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = indexSettings57.flushThresholdSize;
        int int60 = indexSettings57.getMaxResultWindow();
        boolean boolean61 = indexSettings57.getwarmerEnabled();
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.TimeValue> timeValueSetting62 = indexSettings57.getINDEX_REFRESH_INTERVAL_SETTING();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(version20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardSetting26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(settings38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(settings52);
        org.junit.Assert.assertNull(strArray56);
        org.junit.Assert.assertNotNull(durabilitySetting58);
        org.junit.Assert.assertNotNull(byteSizeValue59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10000 + "'", int60 == 10000);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(timeValueSetting62);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData58 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters59 = indexMetaData58.getInitialRecoveryFilters();
        int int60 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.index.Index index61 = indexMetaData58.getMergeSourceIndex();
        int int62 = indexMetaData58.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff63 = indexMetaData0.diff(indexMetaData58);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder64 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData66 = indexMetaData0.mapping("index.version.created");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder67 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder68 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters69 = indexMetaData0.requireFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(indexMetaData58);
        org.junit.Assert.assertNull(discoveryNodeFilters59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(index61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff63);
        org.junit.Assert.assertNull(mappingMetaData66);
        org.junit.Assert.assertNull(discoveryNodeFilters69);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        long long29 = indexMetaData0.getCreationDate();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData30 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters31 = indexMetaData30.getInitialRecoveryFilters();
        boolean boolean33 = indexMetaData30.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings34 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings36 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray43 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray44 = settings36.getAsArray("active_allocations", strArray43);
        java.lang.String str46 = settings36.toDelimitedString('4');
        indexScopedSettings34.validate("index.number_of_shards", settings36);
        java.util.function.Predicate<java.lang.String> strPredicate48 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings49 = settings36.filter(strPredicate48);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder50 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params51 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder52 = settings36.toXContent(xContentBuilder50, params51);
        org.elasticsearch.Version version54 = null;
        org.elasticsearch.Version version55 = settings36.getAsVersion("index.blocks.metadata", version54);
        java.util.function.Predicate<java.lang.String> strPredicate56 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings57 = settings36.filter(strPredicate56);
        org.elasticsearch.index.IndexSettings indexSettings58 = new org.elasticsearch.index.IndexSettings(indexMetaData30, settings36);
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff59 = indexMetaData0.diff(indexMetaData30);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder60 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int61 = indexMetaData0.getNumberOfShards();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(indexMetaData30);
        org.junit.Assert.assertNull(discoveryNodeFilters31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings34);
        org.junit.Assert.assertNotNull(settings36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strPredicate48);
        org.junit.Assert.assertNotNull(settings49);
        org.junit.Assert.assertNotNull(params51);
        org.junit.Assert.assertNull(xContentBuilder52);
        org.junit.Assert.assertNull(version55);
        org.junit.Assert.assertNotNull(strPredicate56);
        org.junit.Assert.assertNotNull(settings57);
        org.junit.Assert.assertNotNull(indexMetaDataDiff59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mappingOrDefault("index.version.minimum_compatible");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters10 = indexMetaData9.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings11.getScope();
        boolean boolean14 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings11.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray24 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray25 = settings17.getAsArray("active_allocations", strArray24);
        java.lang.String str27 = settings17.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings28 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings17);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap30 = settings17.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder31 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder31.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder35 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder38 = builder35.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean40 = indexScopedSettings11.updateSettings(settings17, builder31, builder38, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder43 = builder31.put("index.number_of_shards", 10L);
        java.lang.String[] strArray52 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        org.elasticsearch.common.settings.Settings.Builder builder55 = builder43.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList53);
        org.elasticsearch.common.settings.Settings.Builder builder58 = builder43.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings59 = builder43.build();
        java.lang.Boolean boolean62 = settings59.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue64 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue65 = settings59.getAsSize("", sizeValue64);
        org.elasticsearch.index.IndexSettings indexSettings66 = new org.elasticsearch.index.IndexSettings(indexMetaData9, settings59);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData67 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters68 = indexMetaData67.getInitialRecoveryFilters();
        int int69 = indexMetaData67.getNumberOfReplicas();
        org.elasticsearch.index.Index index70 = indexMetaData67.getMergeSourceIndex();
        int int71 = indexMetaData67.getNumberOfReplicas();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff72 = indexMetaData9.diff(indexMetaData67);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder73 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData9);
        java.util.Set<java.lang.String> strSet75 = null; // flaky: indexMetaData9.activeAllocationIds((int) 'a');
        int int76 = indexMetaData9.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder77 = org.elasticsearch.cluster.metadata.IndexMetaData.builder(indexMetaData9);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap78 = indexMetaData9.getMappings();
        org.elasticsearch.cluster.Diff<org.elasticsearch.cluster.metadata.IndexMetaData> indexMetaDataDiff79 = indexMetaData0.diff(indexMetaData9);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap80 = indexMetaData0.getMappings();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder81 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(indexMetaData9);
        org.junit.Assert.assertNull(discoveryNodeFilters10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(settings28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(settings59);
        org.junit.Assert.assertEquals("'" + boolean62 + "' != '" + false + "'", boolean62, false);
        org.junit.Assert.assertNull(sizeValue65);
        org.junit.Assert.assertNotNull(indexMetaData67);
        org.junit.Assert.assertNull(discoveryNodeFilters68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(index70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(indexMetaDataDiff72);
        org.junit.Assert.assertNull(strSet75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(strImmutableOpenMap78);
        org.junit.Assert.assertNotNull(indexMetaDataDiff79);
        org.junit.Assert.assertNotNull(strImmutableOpenMap80);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shadow_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        byte byte4 = state3.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.state(state3);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder1.removeAllAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.index("10");
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        boolean boolean62 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getTranslogDurability();
        org.elasticsearch.common.settings.Settings settings64 = indexSettings57.settings;
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap66 = settings64.getGroups("false");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        long long4 = indexMetaData0.getVersion();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap5 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = builder6.build();
        org.elasticsearch.cluster.metadata.AliasMetaData aliasMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder6.putAlias(aliasMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(strImmutableOpenMap5);
        org.junit.Assert.assertNotNull(indexMetaData7);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.elasticsearch.common.settings.Settings.Builder builder0 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder1 = builder0.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder4 = builder1.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder7 = builder4.put("100.0", (double) (short) 1);
        org.elasticsearch.common.settings.Settings.Builder builder8 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder8.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder12 = builder9.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder13 = builder12.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder16 = builder12.put("index.shared_filesystem", (float) (short) 100);
        org.elasticsearch.common.settings.Settings.Builder builder19 = builder16.put("index.data_path", true);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = builder19.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder21 = builder7.put(strMap20);
        java.lang.String str23 = builder21.remove("index.auto_expand_replicas");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.common.settings.Settings settings5 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray12 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray13 = settings5.getAsArray("active_allocations", strArray12);
        java.lang.String str15 = settings5.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings5);
        boolean boolean18 = settings17.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings19 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings17);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting20 = indexSettings19.getQUERY_STRING_LENIENT_SETTING();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(booleanSetting20);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.index.translog.Translog.Durability durability59 = null;
        indexSettings57.durability = durability59;
        java.util.function.Predicate<java.lang.String> strPredicate61 = indexSettings57.indexNameMatcher;
        boolean boolean62 = indexSettings57.getwarmerEnabled();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig63 = indexSettings57.getMergeSchedulerConfig();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData64 = indexSettings57.indexMetaData;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(strPredicate61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig63);
        org.junit.Assert.assertNotNull(indexMetaData64);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings4.getScope();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings4.get("active_allocations");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        java.lang.Object obj40 = null;
        boolean boolean41 = settings16.equals(obj40);
        org.elasticsearch.common.settings.Settings settings42 = indexScopedSettings4.dryRun(settings16);
        org.elasticsearch.common.settings.Settings settings44 = settings42.getByPrefix("index.creation_date_string");
        java.util.function.Predicate<java.lang.String> strPredicate45 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings46 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property47 = indexScopedSettings46.getScope();
        boolean boolean49 = indexScopedSettings46.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting51 = indexScopedSettings46.get("active_allocations");
        org.elasticsearch.index.IndexSettings indexSettings52 = null; // flaky: new org.elasticsearch.index.IndexSettings(indexMetaData0, settings44, strPredicate45, indexScopedSettings46);
        int int53 = indexMetaData0.getRoutingFactor();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap54 = indexMetaData0.getMappings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings42);
        org.junit.Assert.assertNotNull(settings44);
        org.junit.Assert.assertNotNull(indexScopedSettings46);
        org.junit.Assert.assertTrue("'" + property47 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property47.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(wildcardSetting51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(strImmutableOpenMap54);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        java.util.function.Predicate<java.lang.String> strPredicate62 = indexSettings57.getindexNameMatcher();
        java.lang.String str63 = indexSettings57.getNodeName();
        int int64 = indexSettings57.numberOfShards;
        org.elasticsearch.common.settings.Setting<org.elasticsearch.common.unit.ByteSizeValue> byteSizeValueSetting65 = indexSettings57.getINDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE_SETTING();
        indexSettings57.maxRefreshListeners = (byte) 10;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(strPredicate62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(byteSizeValueSetting65);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder32.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder46.put("index.data_path", (double) 0.0f);
        org.elasticsearch.common.settings.Settings.Builder builder51 = builder46.loadFromSource("index.version.created");
        org.elasticsearch.common.settings.Settings.Builder builder52 = builder51.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder52.normalizePrefix("active_allocations");
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder54.put("primary_terms", (-1.0f));
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = org.elasticsearch.cluster.metadata.IndexMetaData.builder("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.State state5 = org.elasticsearch.cluster.metadata.IndexMetaData.State.fromId((byte) 0);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder6 = builder3.state(state5);
        byte byte7 = state5.id();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = builder1.state(state5);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + state5 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state5.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData62 = indexSettings57.getIndexMetaData();
        org.elasticsearch.Version version63 = indexMetaData62.getUpgradedVersion();
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData65 = indexMetaData62.mapping("index.version.minimum_compatible");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput66 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexMetaData62.writeTo(streamOutput66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(indexMetaData62);
        org.junit.Assert.assertNotNull(version63);
        org.junit.Assert.assertNull(mappingMetaData65);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings.Builder builder4 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder5 = builder4.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder8 = builder5.put("index.blocks.metadata", (double) 10.0f);
        org.elasticsearch.common.settings.Settings.Builder builder9 = builder8.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings.Builder builder11 = builder8.loadFromSource("index.creation_date_string");
        java.lang.String[] strArray34 = new java.lang.String[] { "index.version.minimum_compatible", "index.version.upgraded_string", "index.", "index.shared_filesystem", "state-", "index.version.minimum_compatible", "active_allocations", "index.version.created_string", "index.shared_filesystem", "", "index.shared_filesystem.recover_on_any_node", "archived.", "state-", "index.version.created", "active_allocations", "index.uuid", "index.version.created_string", "state-", "state-", "index.creation_date", "index.blocks.read_only" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder11.putArray("index.creation_date", (java.util.List<java.lang.String>) strList35);
        org.elasticsearch.common.settings.Settings.Builder builder39 = builder11.putNull("index.blocks.read_only");
        org.elasticsearch.common.settings.Settings.Builder builder41 = builder39.putNull("index.version.upgraded_string");
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder39.put("", true);
        java.lang.String str46 = builder39.remove("state-");
        boolean boolean47 = indexMetaData0.equals((java.lang.Object) builder39);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder48 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings49 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property50 = indexScopedSettings49.getScope();
        boolean boolean52 = indexScopedSettings49.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting54 = indexScopedSettings49.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings55 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray62 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray63 = settings55.getAsArray("active_allocations", strArray62);
        java.lang.String str65 = settings55.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings66 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings55);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap68 = settings55.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder69 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder72 = builder69.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder73 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder76 = builder73.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean78 = indexScopedSettings49.updateSettings(settings55, builder69, builder76, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings settings80 = settings55.getByPrefix("index.version.upgraded_string");
        java.lang.Boolean boolean83 = settings80.getAsBoolean("index.auto_expand_replicas", (java.lang.Boolean) false);
        org.elasticsearch.index.IndexSettings indexSettings84 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings80);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings49);
        org.junit.Assert.assertTrue("'" + property50 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property50.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(wildcardSetting54);
        org.junit.Assert.assertNotNull(settings55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(settings66);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(settings80);
        org.junit.Assert.assertEquals("'" + boolean83 + "' != '" + false + "'", boolean83, false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.common.settings.Settings settings9 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray16 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray17 = settings9.getAsArray("active_allocations", strArray16);
        java.lang.String str19 = settings9.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings20 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        org.elasticsearch.common.settings.Settings settings21 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings9);
        boolean boolean22 = settings21.isEmpty();
        org.elasticsearch.index.IndexSettings indexSettings23 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings21);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder24 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap25 = indexMetaData0.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder26 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(settings9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(settings20);
        org.junit.Assert.assertNotNull(settings21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap25);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.unit.TimeValue timeValue63 = indexSettings57.refreshInterval;
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting64 = indexSettings57.getQUERY_STRING_LENIENT_SETTING();
        indexSettings57.setMaxRescoreWindow((int) (short) 10);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting67 = indexSettings57.getMAX_RESULT_WINDOW_SETTING();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig68 = indexSettings57.getMergeSchedulerConfig();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(timeValue63);
        org.junit.Assert.assertNotNull(booleanSetting64);
        org.junit.Assert.assertNotNull(intSetting67);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig68);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenIntMap<java.util.Set<java.lang.String>> strSetImmutableOpenIntMap4 = indexMetaData0.getActiveAllocationIds();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str6 = builder5.index();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strSetImmutableOpenIntMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder32.put("index.auto_expand_replicas", (float) (byte) 10);
        org.elasticsearch.common.settings.Settings.Builder builder53 = builder32.put("index.shared_filesystem.recover_on_any_node", (int) ' ');
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        int int8 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        java.lang.String str10 = indexMetaData0.getIndexUUID();
        java.util.Set<java.lang.String> strSet12 = null; // flaky: indexMetaData0.activeAllocationIds(10000);
        long long13 = indexMetaData0.getVersion();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder14 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        int int15 = indexMetaData0.getNumberOfShards();
        org.elasticsearch.index.Index index16 = indexMetaData0.getMergeSourceIndex();
        org.elasticsearch.index.Index index17 = indexMetaData0.getMergeSourceIndex();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_na_" + "'", str10, "_na_");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(index16);
        org.junit.Assert.assertNull(index17);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        long long4 = indexMetaData0.getVersion();
        boolean boolean6 = indexMetaData0.isSameUUID("archived.");
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        long long62 = indexSettings57.gcDeletesInMillis;
        org.elasticsearch.common.settings.Settings settings63 = indexSettings57.getSettings();
        org.elasticsearch.common.unit.TimeValue timeValue64 = indexSettings57.getsyncInterval();
        int int65 = indexSettings57.getMaxRescoreWindow();
        int int66 = indexSettings57.getMaxRescoreWindow();
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig67 = indexSettings57.mergePolicyConfig;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData68 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters69 = indexMetaData68.getInitialRecoveryFilters();
        boolean boolean71 = indexMetaData68.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap72 = indexMetaData68.getCustoms();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state73 = indexMetaData68.getState();
        indexSettings57.indexMetaData = indexMetaData68;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue75 = indexSettings57.flushThresholdSize;
        org.elasticsearch.common.logging.ESLogger eSLogger76 = indexSettings57.getlogger();
        boolean boolean77 = indexSettings57.isQueryStringAllowLeadingWildcard();
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig78 = indexSettings57.mergeSchedulerConfig;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 60000L + "'", long62 == 60000L);
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(timeValue64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10000 + "'", int66 == 10000);
        org.junit.Assert.assertNotNull(mergePolicyConfig67);
        org.junit.Assert.assertNotNull(indexMetaData68);
        org.junit.Assert.assertNull(discoveryNodeFilters69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strImmutableOpenMap72);
        org.junit.Assert.assertTrue("'" + state73 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state73.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(byteSizeValue75);
        org.junit.Assert.assertNotNull(eSLogger76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig78);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.AliasMetaData> strImmutableOpenMap4 = indexMetaData0.getAliases();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = indexMetaData0.mapping("index.blocks.read_only");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder8 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters9 = indexMetaData0.includeFilters();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNull(discoveryNodeFilters9);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder20.loadFromSource("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder37 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder39 = builder37.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder41 = builder39.index("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder43 = builder41.removeAlias("index.number_of_replicas");
        org.elasticsearch.cluster.metadata.IndexMetaData.Custom custom45 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder46 = builder43.putCustom("", custom45);
        java.lang.Class<?> wildcardClass47 = builder43.getClass();
        org.elasticsearch.common.settings.Settings.Builder builder48 = builder20.put("archived.", (java.lang.Class) wildcardClass47);
        java.lang.String[] strArray62 = new java.lang.String[] { "active_allocations", "index.shared_filesystem", "index.uuid", "", "index.uuid", "index.version.created", "index.shared_filesystem.recover_on_any_node", "index.number_of_replicas", "index.shared_filesystem", "index.shared_filesystem.recover_on_any_node", "index.number_of_replicas", "index." };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        org.elasticsearch.common.settings.Settings.Builder builder65 = builder48.putArray("index.priority", (java.util.List<java.lang.String>) strList63);
        org.elasticsearch.common.settings.Settings.Builder builder68 = builder48.put("index.blocks.read", 1000);
        org.elasticsearch.common.settings.Settings.Builder builder69 = builder68.replacePropertyPlaceholders();
        org.elasticsearch.common.settings.Settings settings70 = builder68.build();
        boolean boolean71 = settings70.isEmpty();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(settings70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings17 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings6);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap19 = settings6.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder20 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder23 = builder20.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder24 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder27 = builder24.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean29 = indexScopedSettings0.updateSettings(settings6, builder20, builder27, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder32 = builder20.put("index.number_of_shards", 10L);
        java.lang.String[] strArray41 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        org.elasticsearch.common.settings.Settings.Builder builder44 = builder32.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList42);
        org.elasticsearch.common.settings.Settings settings45 = builder32.build();
        org.elasticsearch.common.settings.Settings.Builder builder47 = builder32.putNull("");
        org.elasticsearch.common.settings.Settings.Builder builder50 = builder32.put("index.version.created_string", (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = builder32.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder54 = builder32.put("archived.", "index.number_of_shards");
        org.elasticsearch.common.settings.Settings.Builder builder56 = builder32.loadFromSource("index.shadow_replicas");
        org.elasticsearch.common.settings.Settings.Builder builder59 = builder32.put("index.blocks.read", 0.0d);
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(settings17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        boolean boolean62 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.index.translog.Translog.Durability durability63 = indexSettings57.getTranslogDurability();
        org.elasticsearch.Version version64 = indexSettings57.getversion();
        int int65 = indexSettings57.getMaxResultWindow();
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting66 = indexSettings57.getQUERY_STRING_ALLOW_LEADING_WILDCARD();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + durability63 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability63.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertNotNull(booleanSetting66);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        boolean boolean62 = indexSettings57.getqueryStringLenient();
        boolean boolean63 = indexSettings57.warmerEnabled;
        boolean boolean64 = indexSettings57.getisShadowReplicaIndex();
        int int65 = indexSettings57.numberOfShards;
        org.elasticsearch.common.settings.Settings settings66 = indexSettings57.getSettings();
        indexSettings57.warmerEnabled = false;
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(settings66);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.index.translog.Translog.Durability durability61 = indexSettings57.getTranslogDurability();
        boolean boolean62 = indexSettings57.hasCustomDataPath();
        org.elasticsearch.common.settings.Setting<java.lang.String> strSetting63 = indexSettings57.getDEFAULT_FIELD_SETTING();
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher64 = indexSettings57.getParseFieldMatcher();
        boolean boolean65 = indexSettings57.isQueryStringAnalyzeWildcard();
        boolean boolean66 = indexSettings57.getwarmerEnabled();
        org.elasticsearch.common.unit.TimeValue timeValue67 = indexSettings57.getDEFAULT_GC_DELETES();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertTrue("'" + durability61 + "' != '" + org.elasticsearch.index.translog.Translog.Durability.REQUEST + "'", durability61.equals(org.elasticsearch.index.translog.Translog.Durability.REQUEST));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strSetting63);
        org.junit.Assert.assertNotNull(parseFieldMatcher64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(timeValue67);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting58 = indexSettings57.getMAX_RESCORE_WINDOW_SETTING();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue59 = null;
        indexSettings57.flushThresholdSize = byteSizeValue59;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData61 = indexSettings57.getIndexMetaData();
        boolean boolean62 = indexSettings57.getdefaultAllowUnmappedFields();
        org.elasticsearch.common.settings.Setting<java.lang.Integer> intSetting63 = indexSettings57.getMAX_RESULT_WINDOW_SETTING();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings64 = indexSettings57.getScopedSettings();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(intSetting58);
        org.junit.Assert.assertNotNull(indexMetaData61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intSetting63);
        org.junit.Assert.assertNotNull(indexScopedSettings64);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.version.created_string");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder1.creationDate((long) (-1));
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData7 = builder1.mapping("index.data_path");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder9 = builder1.index("index.shared_filesystem");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings16 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray23 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray24 = settings16.getAsArray("active_allocations", strArray23);
        java.lang.String str26 = settings16.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings27 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings16);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap29 = settings16.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder30 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder33 = builder30.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder34 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder37 = builder34.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean39 = indexScopedSettings10.updateSettings(settings16, builder30, builder37, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder42 = builder30.put("index.number_of_shards", 10L);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = builder42.internalMap();
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder42.put("index.version.minimum_compatible", (double) 60000L);
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder47 = builder1.settings(builder46);
        java.util.concurrent.TimeUnit timeUnit50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings.Builder builder51 = builder46.put("index.number_of_shards", (long) (short) 100, timeUnit50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mappingMetaData7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(settings16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder4 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData0);
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters5 = indexMetaData0.includeFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters7 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters8 = indexMetaData6.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state9 = indexMetaData6.getState();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder10 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData6);
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData12 = indexMetaData6.mapping("index.creation_date");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings13.getScope();
        boolean boolean16 = indexScopedSettings13.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings13.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray26 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray27 = settings19.getAsArray("active_allocations", strArray26);
        java.lang.String str29 = settings19.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings19);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap32 = settings19.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder33 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder36 = builder33.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder37 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder40 = builder37.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean42 = indexScopedSettings13.updateSettings(settings19, builder33, builder40, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder45 = builder33.put("index.number_of_shards", 10L);
        java.lang.String[] strArray54 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        org.elasticsearch.common.settings.Settings.Builder builder57 = builder45.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList55);
        org.elasticsearch.common.settings.Settings.Builder builder60 = builder45.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings61 = builder45.build();
        java.lang.Boolean boolean64 = settings61.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue66 = null;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue67 = settings61.getAsBytesSize("index.blocks.read", byteSizeValue66);
        org.elasticsearch.index.IndexSettings indexSettings68 = new org.elasticsearch.index.IndexSettings(indexMetaData6, settings61);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings69 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings71 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray78 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray79 = settings71.getAsArray("active_allocations", strArray78);
        java.lang.String str81 = settings71.toDelimitedString('4');
        indexScopedSettings69.validate("index.number_of_shards", settings71);
        java.util.function.Predicate<java.lang.String> strPredicate83 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings84 = settings71.filter(strPredicate83);
        org.elasticsearch.common.unit.TimeValue timeValue86 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue87 = settings84.getAsTime("index.number_of_replicas", timeValue86);
        java.lang.Boolean boolean90 = settings84.getAsBoolean("_all", (java.lang.Boolean) true);
        org.elasticsearch.index.IndexSettings indexSettings91 = new org.elasticsearch.index.IndexSettings(indexMetaData6, settings84);
        org.elasticsearch.index.IndexSettings indexSettings92 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings84);
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(discoveryNodeFilters5);
        org.junit.Assert.assertNotNull(indexMetaData6);
        org.junit.Assert.assertNull(discoveryNodeFilters7);
        org.junit.Assert.assertNull(discoveryNodeFilters8);
        org.junit.Assert.assertTrue("'" + state9 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state9.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNull(mappingMetaData12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(settings61);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertNull(byteSizeValue67);
        org.junit.Assert.assertNotNull(indexScopedSettings69);
        org.junit.Assert.assertNotNull(settings71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strPredicate83);
        org.junit.Assert.assertNotNull(settings84);
        org.junit.Assert.assertNotNull(timeValue86);
        org.junit.Assert.assertNotNull(timeValue87);
        org.junit.Assert.assertEquals("'" + boolean90 + "' != '" + true + "'", boolean90, true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder1 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder("index.shared_filesystem.recover_on_any_node");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder3 = builder1.index("index.number_of_shards");
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder5 = builder3.removeAlias("index.version.upgraded_string");
        org.elasticsearch.cluster.metadata.MappingMetaData mappingMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder7 = builder3.putMapping(mappingMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        boolean boolean5 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("active_allocations");
        org.elasticsearch.common.settings.Settings settings8 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray15 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray16 = settings8.getAsArray("active_allocations", strArray15);
        java.lang.String str18 = settings8.toDelimitedString('4');
        org.elasticsearch.common.settings.Settings settings19 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings8);
        java.util.Map<java.lang.String, org.elasticsearch.common.settings.Settings> strMap21 = settings8.getAsGroups(true);
        org.elasticsearch.common.settings.Settings.Builder builder22 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder25 = builder22.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        org.elasticsearch.common.settings.Settings.Builder builder26 = org.elasticsearch.common.settings.Settings.builder();
        org.elasticsearch.common.settings.Settings.Builder builder29 = builder26.put("index.shared_filesystem.recover_on_any_node", "index.data_path");
        boolean boolean31 = indexScopedSettings2.updateSettings(settings8, builder22, builder29, "index.shared_filesystem");
        org.elasticsearch.common.settings.Settings.Builder builder34 = builder22.put("index.number_of_shards", 10L);
        java.lang.String[] strArray43 = new java.lang.String[] { "index.uuid", "index.shared_filesystem.recover_on_any_node", "index.shared_filesystem.recover_on_any_node", "index.number_of_shards", "index.version.upgraded_string", "index.version.minimum_compatible", "index.data_path" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        org.elasticsearch.common.settings.Settings.Builder builder46 = builder34.putArray("index.number_of_replicas", (java.util.List<java.lang.String>) strList44);
        org.elasticsearch.common.settings.Settings.Builder builder49 = builder34.put("index.version.created", "index.uuid");
        org.elasticsearch.common.settings.Settings settings50 = builder34.build();
        java.lang.Boolean boolean53 = settings50.getAsBoolean("index.version.upgraded", (java.lang.Boolean) false);
        org.elasticsearch.common.unit.SizeValue sizeValue55 = null;
        org.elasticsearch.common.unit.SizeValue sizeValue56 = settings50.getAsSize("", sizeValue55);
        org.elasticsearch.index.IndexSettings indexSettings57 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings50);
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher58 = indexSettings57.parseFieldMatcher;
        org.elasticsearch.common.unit.TimeValue timeValue59 = indexSettings57.refreshInterval;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData60 = indexSettings57.getIndexMetaData();
        org.elasticsearch.cluster.metadata.IndexMetaData.Builder builder61 = new org.elasticsearch.cluster.metadata.IndexMetaData.Builder(indexMetaData60);
        org.apache.lucene.util.Version version62 = indexMetaData60.getMinimumCompatibleVersion();
        long long63 = indexMetaData60.getCreationDate();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(settings8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(settings50);
        org.junit.Assert.assertEquals("'" + boolean53 + "' != '" + false + "'", boolean53, false);
        org.junit.Assert.assertNull(sizeValue56);
        org.junit.Assert.assertNotNull(parseFieldMatcher58);
        org.junit.Assert.assertNotNull(timeValue59);
        org.junit.Assert.assertNotNull(indexMetaData60);
        org.junit.Assert.assertNull(version62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1L) + "'", long63 == (-1L));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters2 = indexMetaData0.getInitialRecoveryFilters();
        org.elasticsearch.cluster.metadata.IndexMetaData.State state3 = indexMetaData0.getState();
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.IndexMetaData.Custom> strImmutableOpenMap4 = indexMetaData0.getCustoms();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        boolean boolean8 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings10 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = settings10.toXContent(xContentBuilder11, params12);
        boolean boolean14 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings10);
        indexScopedSettings5.validate("index.shared_filesystem.recover_on_any_node", settings10);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings18 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray25 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray26 = settings18.getAsArray("active_allocations", strArray25);
        java.lang.String str28 = settings18.toDelimitedString('4');
        indexScopedSettings16.validate("index.number_of_shards", settings18);
        org.elasticsearch.common.settings.Settings settings30 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings18);
        org.elasticsearch.common.settings.Settings settings31 = indexScopedSettings5.archiveUnknownOrBrokenSettings(settings18);
        org.elasticsearch.common.settings.Settings settings33 = settings18.getByPrefix("index.priority");
        org.elasticsearch.index.IndexSettings indexSettings34 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings18);
        java.lang.String str35 = indexSettings34.getUUID();
        indexSettings34.setTTLPurgeDisabled(false);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings38 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property39 = indexScopedSettings38.getScope();
        boolean boolean41 = indexScopedSettings38.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings43 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder44 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params45 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder46 = settings43.toXContent(xContentBuilder44, params45);
        boolean boolean47 = org.elasticsearch.cluster.metadata.IndexMetaData.isIndexUsingShadowReplicas(settings43);
        indexScopedSettings38.validate("index.shared_filesystem.recover_on_any_node", settings43);
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings49 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings51 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray58 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray59 = settings51.getAsArray("active_allocations", strArray58);
        java.lang.String str61 = settings51.toDelimitedString('4');
        indexScopedSettings49.validate("index.number_of_shards", settings51);
        org.elasticsearch.common.settings.Settings settings63 = org.elasticsearch.cluster.metadata.IndexMetaData.addHumanReadableSettings(settings51);
        org.elasticsearch.common.settings.Settings settings64 = indexScopedSettings38.archiveUnknownOrBrokenSettings(settings51);
        indexSettings34.settings = settings51;
        org.elasticsearch.index.MergeSchedulerConfig mergeSchedulerConfig66 = indexSettings34.getMergeSchedulerConfig();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertNull(discoveryNodeFilters2);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN + "'", state3.equals(org.elasticsearch.cluster.metadata.IndexMetaData.State.OPEN));
        org.junit.Assert.assertNotNull(strImmutableOpenMap4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(settings10);
        org.junit.Assert.assertNotNull(params12);
        org.junit.Assert.assertNull(xContentBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(settings18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(settings30);
        org.junit.Assert.assertNotNull(settings31);
        org.junit.Assert.assertNotNull(settings33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_na_" + "'", str35, "_na_");
        org.junit.Assert.assertNotNull(indexScopedSettings38);
        org.junit.Assert.assertTrue("'" + property39 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property39.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(settings43);
        org.junit.Assert.assertNotNull(params45);
        org.junit.Assert.assertNull(xContentBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings49);
        org.junit.Assert.assertNotNull(settings51);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(settings63);
        org.junit.Assert.assertNotNull(settings64);
        org.junit.Assert.assertNotNull(mergeSchedulerConfig66);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData0 = org.elasticsearch.cluster.metadata.IndexMetaData.PROTO;
        org.elasticsearch.cluster.node.DiscoveryNodeFilters discoveryNodeFilters1 = indexMetaData0.getInitialRecoveryFilters();
        boolean boolean3 = indexMetaData0.isSameUUID("index.version.upgraded_string");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings6 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray13 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray14 = settings6.getAsArray("active_allocations", strArray13);
        java.lang.String str16 = settings6.toDelimitedString('4');
        indexScopedSettings4.validate("index.number_of_shards", settings6);
        java.util.function.Predicate<java.lang.String> strPredicate18 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings19 = settings6.filter(strPredicate18);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder20 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params21 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder22 = settings6.toXContent(xContentBuilder20, params21);
        org.elasticsearch.Version version24 = null;
        org.elasticsearch.Version version25 = settings6.getAsVersion("index.blocks.metadata", version24);
        java.util.function.Predicate<java.lang.String> strPredicate26 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings27 = settings6.filter(strPredicate26);
        org.elasticsearch.index.IndexSettings indexSettings28 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings6);
        org.elasticsearch.common.collect.ImmutableOpenMap<java.lang.String, org.elasticsearch.cluster.metadata.MappingMetaData> strImmutableOpenMap29 = indexMetaData0.getMappings();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings30 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Settings settings32 = org.elasticsearch.common.settings.Settings.Builder.EMPTY_SETTINGS;
        java.lang.String[] strArray39 = new java.lang.String[] { "index.version.created_string", "index.version.minimum_compatible", "active_allocations", "index.number_of_replicas", "hi!" };
        java.lang.String[] strArray40 = settings32.getAsArray("active_allocations", strArray39);
        java.lang.String str42 = settings32.toDelimitedString('4');
        indexScopedSettings30.validate("index.number_of_shards", settings32);
        java.util.function.Predicate<java.lang.String> strPredicate44 = org.elasticsearch.common.settings.IndexScopedSettings.INDEX_SETTINGS_KEY_PREDICATE;
        org.elasticsearch.common.settings.Settings settings45 = settings32.filter(strPredicate44);
        org.elasticsearch.common.unit.TimeValue timeValue47 = org.elasticsearch.index.IndexSettings.DEFAULT_REFRESH_INTERVAL;
        org.elasticsearch.common.unit.TimeValue timeValue48 = settings45.getAsTime("index.number_of_replicas", timeValue47);
        java.lang.String str50 = settings45.get("index.");
        org.elasticsearch.index.IndexSettings indexSettings51 = new org.elasticsearch.index.IndexSettings(indexMetaData0, settings45);
        org.elasticsearch.common.settings.Setting<java.lang.Boolean> booleanSetting52 = indexSettings51.getQUERY_STRING_ALLOW_LEADING_WILDCARD();
        java.lang.String str53 = indexSettings51.getUUID();
        boolean boolean54 = indexSettings51.getwarmerEnabled();
        int int55 = indexSettings51.numberOfShards;
        org.elasticsearch.index.MergePolicyConfig mergePolicyConfig56 = indexSettings51.mergePolicyConfig;
        boolean boolean57 = indexSettings51.getqueryStringAllowLeadingWildcard();
        org.junit.Assert.assertNotNull(indexMetaData0);
        org.junit.Assert.assertNull(discoveryNodeFilters1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(settings19);
        org.junit.Assert.assertNotNull(params21);
        org.junit.Assert.assertNull(xContentBuilder22);
        org.junit.Assert.assertNull(version25);
        org.junit.Assert.assertNotNull(strPredicate26);
        org.junit.Assert.assertNotNull(settings27);
        org.junit.Assert.assertNotNull(strImmutableOpenMap29);
        org.junit.Assert.assertNotNull(indexScopedSettings30);
        org.junit.Assert.assertNotNull(settings32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strPredicate44);
        org.junit.Assert.assertNotNull(settings45);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(timeValue48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(booleanSetting52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_na_" + "'", str53, "_na_");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(mergePolicyConfig56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }
}
