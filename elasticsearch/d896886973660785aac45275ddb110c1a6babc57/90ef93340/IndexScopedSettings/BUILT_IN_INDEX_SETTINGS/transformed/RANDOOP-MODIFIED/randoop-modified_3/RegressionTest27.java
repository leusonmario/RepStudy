import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings1.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings0.updateSettings(settings16, builder17, builder18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass9 = strPredicate8.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings0.updateSettings(settings16, builder17, builder18, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.copy(settings8, indexMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = indexScopedSettings19.updateDynamicSettings(settings20, builder21, builder22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str9 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validate("hi!", settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings14.getScope();
        java.lang.Class<?> wildcardClass19 = property18.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        java.lang.String str6 = indexScopedSettings1.nodeName();
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings15.getScope();
        boolean boolean18 = indexScopedSettings15.isPrivateSetting("archived.");
        java.lang.String str19 = indexScopedSettings15.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings15, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings13.archiveUnknownOrBrokenSettings(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings13, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings0.updateDynamicSettings(settings11, builder12, builder13, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings8.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings8.nodeName();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings8.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateSettings(settings13, builder14, builder15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings17.validateSettingKey(setting18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings6.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings6.get("hi!");
        java.lang.String str13 = indexScopedSettings6.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strPredicate14);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings7.dryRun(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings9.get("");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings16.get("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings16.copy(settings19, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings10, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings0.updateDynamicSettings(settings16, builder17, builder18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings8.copy(settings11, indexMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings12.applySettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings10.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings16.getScope();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings16.applySettings(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        java.lang.String str6 = indexScopedSettings1.nodeName();
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings10.get("");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings10.getScope();
        boolean boolean18 = indexScopedSettings10.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings10, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str19 = indexScopedSettings18.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings18.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings18.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertNotNull(strPredicate21);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.lang.String str17 = indexScopedSettings14.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings18.archiveUnknownOrBrokenSettings(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str13 = indexScopedSettings12.nodeName();
        java.lang.String str14 = indexScopedSettings12.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings12.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validate(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings8.get("");
        boolean boolean12 = indexScopedSettings8.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings8.diff(settings13, settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("archived.");
        boolean boolean7 = indexScopedSettings1.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        boolean boolean12 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings1.validate(builder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings9.get("");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        boolean boolean12 = indexScopedSettings1.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings1.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings0.updateDynamicSettings(settings11, builder12, builder13, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings13.get("");
        boolean boolean17 = indexScopedSettings13.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting setting19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings13.validateSettingKey(setting19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        boolean boolean21 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate23 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting24 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strPredicate23);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings8.get("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings8.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings13.updateDynamicSettings(settings14, builder15, builder16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings15.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings12.dryRun(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings15.applySettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.copy(settings12, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("hi!");
        java.lang.String str16 = indexScopedSettings12.nodeName();
        java.lang.String str17 = indexScopedSettings12.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings18.getScope();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings18.validate(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings14.getScope();
        boolean boolean18 = indexScopedSettings14.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validate("", settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str17 = indexScopedSettings16.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings16.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate19 = indexScopedSettings18.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNotNull(strPredicate19);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings0.updateDynamicSettings(settings16, builder17, builder18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.Class<?> wildcardClass16 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.dryRun(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings17.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings17.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings17, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings1.getScope();
        boolean boolean9 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings1.getScope();
        boolean boolean12 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings13, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean18 = indexScopedSettings16.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strPredicate18);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str7 = indexScopedSettings5.nodeName();
        boolean boolean9 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validateSettingKey(setting11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.applySettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        boolean boolean20 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateDynamicSettings(settings10, builder11, builder12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings5.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings5.get("archived.");
        java.lang.String str13 = indexScopedSettings5.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings10.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings14.get("archived.");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validate("archived.", settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings0.updateDynamicSettings(settings11, builder12, builder13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.dryRun(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("");
        boolean boolean10 = indexScopedSettings6.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings6.getScope();
        java.lang.String str12 = indexScopedSettings6.nodeName();
        java.lang.String str13 = indexScopedSettings6.nodeName();
        java.lang.String str14 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings15.validate(builder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings14.copy(settings15, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateSettings(settings10, builder11, builder12, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("");
        boolean boolean9 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings10.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings10.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings11, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("");
        boolean boolean13 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings1.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting setting14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validateSettingKey(setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings18.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings3.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings3.isPrivateSetting("archived.");
        boolean boolean10 = indexScopedSettings3.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings3.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings3.archiveUnknownOrBrokenSettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings2.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings2.getScope();
        boolean boolean6 = indexScopedSettings2.isPrivateSetting("hi!");
        java.lang.String str7 = indexScopedSettings2.nodeName();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings2.updateDynamicSettings(settings8, builder9, builder10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings8.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str17 = indexScopedSettings16.nodeName();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings16.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings0.updateSettings(settings14, builder15, builder16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("");
        boolean boolean9 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings1.dryRun(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("archived.");
        boolean boolean10 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings11.isPrivateSetting("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings11, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings9.dryRun(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass7 = property6.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings7.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings7.archiveUnknownOrBrokenSettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings10.archiveUnknownOrBrokenSettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings8.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings12.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings12.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings12.get("");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings12.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings12.validate(builder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings14, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass9 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings16.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean21 = indexScopedSettings16.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = null;
        org.elasticsearch.common.settings.Settings.Builder builder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = indexScopedSettings16.updateSettings(settings22, builder23, builder24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting setting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings5 = indexScopedSettings0.diff(settings3, settings4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings11.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings14.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("archived.");
        boolean boolean14 = indexScopedSettings10.isPrivateSetting("hi!");
        java.lang.String str15 = indexScopedSettings10.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings16.copy(settings17, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings10.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings1.getScope();
        boolean boolean12 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean14 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean18 = indexScopedSettings1.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str20 = indexScopedSettings1.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean23 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings25 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strPredicate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings5.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings1.get("");
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str8 = indexScopedSettings1.nodeName();
        boolean boolean10 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str12 = indexScopedSettings1.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings0.updateSettings(settings9, builder10, builder11, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings14.dryRun(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = wildcardSetting9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings1.getScope();
        boolean boolean11 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings10.validate(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str14 = indexScopedSettings1.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings14.applySettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings17.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings18.validate(builder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings0.diff(settings10, settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.copy(settings13, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.copy(settings10, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings2.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings2.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings2.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings11.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings11.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings11.updateDynamicSettings(settings16, builder17, builder18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings2.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings2, indexMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass12 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings15.get("hi!");
        boolean boolean20 = indexScopedSettings15.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings19.validate(builder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.dryRun(settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.copy(settings8, indexMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.applySettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings0.updateDynamicSettings(settings8, builder9, builder10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting setting8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        boolean boolean7 = indexScopedSettings1.hasDynamicSetting("");
        java.lang.String str8 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings8.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str15 = indexScopedSettings8.nodeName();
        boolean boolean17 = indexScopedSettings8.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.applySettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings23 = indexScopedSettings0.copy(settings21, indexMetaData22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings15.copy(settings16, indexMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str13 = indexScopedSettings12.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str15 = indexScopedSettings12.nodeName();
        boolean boolean17 = indexScopedSettings12.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings12.copy(settings18, indexMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.diff(settings18, settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(strPredicate17);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings12.hasDynamicSetting("hi!");
        java.lang.String str16 = indexScopedSettings12.nodeName();
        java.lang.String str17 = indexScopedSettings12.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings18.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet21 = indexScopedSettings18.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNotNull(wildcardSettingSet21);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexScopedSettings5.updateDynamicSettings(settings7, builder8, builder9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("hi!");
        java.lang.String str12 = indexScopedSettings1.nodeName();
        boolean boolean14 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings1.get("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNull(wildcardSetting19);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.lang.String str17 = indexScopedSettings14.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings18.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet21 = indexScopedSettings18.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings18.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings18.get("");
        boolean boolean27 = indexScopedSettings18.hasDynamicSetting("");
        boolean boolean29 = indexScopedSettings18.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings31 = indexScopedSettings18.applySettings(settings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNotNull(wildcardSettingSet21);
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertNull(wildcardSetting25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings6, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings8.get("hi!");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validate("hi!", settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.diff(settings13, settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings1.hasDynamicSetting("hi!");
        boolean boolean6 = indexScopedSettings1.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings1.hasDynamicSetting("archived.");
        java.lang.String str10 = indexScopedSettings1.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings1.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings1.get("");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNull(wildcardSetting19);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings2.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings2.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings2.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings2.diff(settings9, settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings15.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings15.copy(settings18, indexMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings8.nodeName();
        java.lang.String str10 = indexScopedSettings8.nodeName();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings8.updateDynamicSettings(settings11, builder12, builder13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings1.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings1.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings2.getScope();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings2.copy(settings5, indexMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.Class<?> wildcardClass9 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings7.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings7.getScope();
        java.lang.Class<?> wildcardClass15 = indexScopedSettings7.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strPredicate18);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.isPrivateSetting("archived.");
        boolean boolean8 = indexScopedSettings4.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings4.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings4.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings14.diff(settings15, settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.copy(settings9, indexMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(strPredicate8);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings1.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings1.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings0.updateSettings(settings15, builder16, builder17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings5.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings5.get("");
        java.lang.String str12 = indexScopedSettings5.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings5.get("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings5.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings10.hasDynamicSetting("hi!");
        boolean boolean17 = indexScopedSettings10.isPrivateSetting("archived.");
        java.lang.String str18 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings10.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = wildcardSetting20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(wildcardSetting20);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.lang.String str17 = indexScopedSettings14.nodeName();
        java.lang.String str18 = indexScopedSettings14.nodeName();
        java.lang.String str19 = indexScopedSettings14.nodeName();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings14.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet21 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet22 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet21);
        org.junit.Assert.assertNotNull(wildcardSettingSet22);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validate("", settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings0.updateSettings(settings9, builder10, builder11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings5.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings5.get("");
        java.lang.String str12 = indexScopedSettings5.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings5.get("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings5.updateDynamicSettings(settings16, builder17, builder18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean18 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings0.copy(settings20, indexMetaData21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting setting11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings14.get("");
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validate(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        boolean boolean11 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.applySettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings7.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNull(wildcardSetting4);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings9.updateSettings(settings10, builder11, builder12, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings15.archiveUnknownOrBrokenSettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings12.applySettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings0.applySettings(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        boolean boolean7 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings8, indexMetaData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validate(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet20 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = indexScopedSettings0.updateSettings(settings21, builder22, builder23, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet20);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("");
        java.lang.String str10 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = indexScopedSettings0.updateDynamicSettings(settings19, builder20, builder21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNotNull(strPredicate18);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.diff(settings19, settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings16.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings16.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings14.dryRun(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean18 = indexScopedSettings9.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = indexScopedSettings9.updateSettings(settings19, builder20, builder21, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str10 = indexScopedSettings9.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings9.getScope();
        boolean boolean15 = indexScopedSettings9.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings7.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings0.applySettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings7.diff(settings8, settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.lang.String str17 = indexScopedSettings14.nodeName();
        java.lang.String str18 = indexScopedSettings14.nodeName();
        java.lang.String str19 = indexScopedSettings14.nodeName();
        org.elasticsearch.common.settings.Setting setting20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validateSettingKey(setting20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings6.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings10.applySettings(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = wildcardSetting14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean18 = indexScopedSettings9.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validate(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings0.diff(settings17, settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings9.updateSettings(settings10, builder11, builder12, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings10.get("archived.");
        boolean boolean17 = indexScopedSettings10.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings8.get("");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings8.diff(settings11, settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings8.updateSettings(settings11, builder12, builder13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.diff(settings18, settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate19 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings20.validate(builder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings11.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings11.dryRun(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings3.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings9.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("hi!");
        java.lang.String str12 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean17 = indexScopedSettings1.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet20 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings23 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings8.applySettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        boolean boolean11 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("archived.");
        boolean boolean7 = indexScopedSettings1.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str17 = indexScopedSettings16.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings14.get("");
        boolean boolean19 = indexScopedSettings14.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings20.archiveUnknownOrBrokenSettings(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings5.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings5.applySettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings9.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean18 = indexScopedSettings9.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings0.updateDynamicSettings(settings14, builder15, builder16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str14 = indexScopedSettings10.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings13, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings1.get("archived.");
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("");
        boolean boolean10 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting setting11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.copy(settings7, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.applySettings(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strPredicate18);
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings0.dryRun(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        java.lang.String str17 = indexScopedSettings14.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings18.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet21 = indexScopedSettings18.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings18.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings18.get("");
        boolean boolean27 = indexScopedSettings18.hasDynamicSetting("");
        boolean boolean29 = indexScopedSettings18.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting31 = indexScopedSettings18.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property32 = indexScopedSettings18.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNotNull(wildcardSettingSet21);
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertNull(wildcardSetting25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardSetting31);
        org.junit.Assert.assertTrue("'" + property32 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property32.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateSettings(settings10, builder11, builder12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings12.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strPredicate15);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings1.get("hi!");
        java.lang.String str10 = indexScopedSettings1.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings12.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings12, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        java.lang.String str6 = indexScopedSettings1.nodeName();
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings1.nodeName();
        java.lang.String str12 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings1.getScope();
        boolean boolean15 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.copy(settings18, indexMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str12 = indexScopedSettings11.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings5.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass9 = indexScopedSettings5.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("archived.");
        java.lang.Class<?> wildcardClass13 = indexScopedSettings10.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings10.getScope();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings10.validate("archived.", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings2.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings2.getScope();
        boolean boolean6 = indexScopedSettings2.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings2.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.applySettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.copy(settings11, indexMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings5.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings5.get("archived.");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validate(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings0.diff(settings11, settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings.Builder builder6 = null;
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = indexScopedSettings0.updateDynamicSettings(settings5, builder6, builder7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

