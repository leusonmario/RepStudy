import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings7.get("");
        boolean boolean11 = indexScopedSettings7.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings7.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings7.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings15.hasDynamicSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings15, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings3.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings6.getScope();
        java.lang.String str9 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings6.updateDynamicSettings(settings10, builder11, builder12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings7.updateDynamicSettings(settings8, builder9, builder10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings16.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(strPredicate17);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings6.get("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings6.updateSettings(settings12, builder13, builder14, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings15.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str5 = indexScopedSettings3.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings3.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.lang.String str3 = indexScopedSettings1.nodeName();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings1.isPrivateSetting("archived.");
        java.lang.String str11 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings12.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings12.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings12.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings8.nodeName();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings8.archiveUnknownOrBrokenSettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings11.archiveUnknownOrBrokenSettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings13.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings13.applySettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(strPredicate14);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings7.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validate(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("archived.");
        java.lang.Class<?> wildcardClass10 = indexScopedSettings6.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("hi!");
        java.lang.String str9 = indexScopedSettings1.nodeName();
        boolean boolean11 = indexScopedSettings1.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings15.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings15.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings15.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings20.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str22 = indexScopedSettings20.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings24 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings20, indexMetaData23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting setting16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
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
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validateSettingKey(setting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("archived.");
        boolean boolean11 = indexScopedSettings6.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings7.validate(builder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("hi!");
        boolean boolean10 = indexScopedSettings6.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str12 = indexScopedSettings6.nodeName();
        java.lang.String str13 = indexScopedSettings6.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str15 = indexScopedSettings6.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings7.get("hi!");
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings5.get("archived.");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings5.updateDynamicSettings(settings13, builder14, builder15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.lang.String str13 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings9.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.copy(settings14, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings7 = indexScopedSettings3.dryRun(settings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(strPredicate5);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("archived.");
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("");
        boolean boolean13 = indexScopedSettings7.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings7.validate("archived.", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings3.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings3.updateDynamicSettings(settings8, builder9, builder10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
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
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.lang.String str13 = indexScopedSettings9.nodeName();
        boolean boolean15 = indexScopedSettings9.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings9.getScope();
        boolean boolean18 = indexScopedSettings9.isPrivateSetting("");
        boolean boolean20 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str22 = indexScopedSettings21.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting setting7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validateSettingKey(setting7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        boolean boolean8 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings9.get("hi!");
        org.elasticsearch.common.settings.Setting setting13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validateSettingKey(setting13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings6.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings11.nodeName();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings11.updateSettings(settings14, builder15, builder16, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings3.get("");
        boolean boolean7 = indexScopedSettings3.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings3.get("hi!");
        java.lang.String str10 = indexScopedSettings3.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings3.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("hi!");
        boolean boolean10 = indexScopedSettings6.isPrivateSetting("");
        boolean boolean12 = indexScopedSettings6.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings3.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings3.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings8.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings8.updateSettings(settings14, builder15, builder16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings10.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("hi!");
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings7.get("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings7.getScope();
        boolean boolean16 = indexScopedSettings7.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings7.updateDynamicSettings(settings17, builder18, builder19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings5.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("archived.");
        boolean boolean11 = indexScopedSettings5.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings3.get("");
        boolean boolean7 = indexScopedSettings3.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings3.get("hi!");
        java.lang.String str10 = indexScopedSettings3.nodeName();
        java.lang.String str11 = indexScopedSettings3.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings3.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings3.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validate(builder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings9.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings9.isPrivateSetting("hi!");
        java.lang.String str16 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings9.updateSettings(settings17, builder18, builder19, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str12 = indexScopedSettings11.nodeName();
        boolean boolean14 = indexScopedSettings11.isPrivateSetting("");
        boolean boolean16 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings11.dryRun(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str14 = indexScopedSettings13.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings13.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean17 = indexScopedSettings13.isPrivateSetting("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.Class<?> wildcardClass9 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings15.get("archived.");
        java.lang.Class<?> wildcardClass18 = indexScopedSettings15.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings1.hasDynamicSetting("archived.");
        boolean boolean14 = indexScopedSettings1.hasDynamicSetting("");
        java.lang.String str15 = indexScopedSettings1.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("hi!");
        boolean boolean8 = indexScopedSettings4.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings4.get("archived.");
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validate(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
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
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean18 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNotNull(strPredicate17);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.lang.String str13 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet20 = indexScopedSettings19.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean22 = indexScopedSettings19.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNotNull(wildcardSettingSet20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings8.nodeName();
        org.elasticsearch.common.settings.Setting setting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validateSettingKey(setting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings7.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings7.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings7.get("");
        java.lang.String str10 = indexScopedSettings7.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings7.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings14, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting setting14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings10.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.hasDynamicSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings8.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings8.get("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings8.diff(settings12, settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings4.getScope();
        java.lang.String str10 = indexScopedSettings4.nodeName();
        boolean boolean12 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings4.updateDynamicSettings(settings13, builder14, builder15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings6.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings6.archiveUnknownOrBrokenSettings(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings14.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings14.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings19.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str21 = indexScopedSettings19.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings19.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet23 = indexScopedSettings19.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings19.diff(settings24, settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertNotNull(wildcardSettingSet23);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting setting9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings13.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings9.getScope();
        boolean boolean15 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings9.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str12 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings10.getScope();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings10, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings1.get("archived.");
        java.lang.String str5 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings6, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str11 = indexScopedSettings1.nodeName();
        boolean boolean13 = indexScopedSettings1.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings3.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings3.getScope();
        boolean boolean10 = indexScopedSettings3.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str6 = indexScopedSettings4.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings4.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings4.getScope();
        boolean boolean11 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings6.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str9 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings6.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings0.updateSettings(settings8, builder9, builder10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strPredicate7);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings9.dryRun(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings15.copy(settings17, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings8.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings7.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings1.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str5 = indexScopedSettings4.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings4.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        boolean boolean9 = indexScopedSettings4.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str11 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str13 = indexScopedSettings12.nodeName();
        java.lang.String str14 = indexScopedSettings12.nodeName();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings12.copy(settings15, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.lang.String str3 = indexScopedSettings1.nodeName();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings1.get("archived.");
        java.lang.String str13 = indexScopedSettings1.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings0.updateSettings(settings11, builder12, builder13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateDynamicSettings(settings13, builder14, builder15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        boolean boolean14 = indexScopedSettings9.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean18 = indexScopedSettings9.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate19 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strPredicate19);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str12 = indexScopedSettings11.nodeName();
        boolean boolean14 = indexScopedSettings11.isPrivateSetting("");
        boolean boolean16 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validate(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings3.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = indexScopedSettings3.updateDynamicSettings(settings8, builder9, builder10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings6.updateSettings(settings10, builder11, builder12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings14.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings14.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings14.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(strPredicate20);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str12 = indexScopedSettings11.nodeName();
        boolean boolean14 = indexScopedSettings11.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings11.getScope();
        java.lang.Class<?> wildcardClass16 = property15.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet21 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet22 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings25 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean27 = indexScopedSettings25.isPrivateSetting("");
        java.lang.String str28 = indexScopedSettings25.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting30 = indexScopedSettings25.get("");
        org.elasticsearch.common.settings.Settings settings31 = null;
        org.elasticsearch.common.settings.Settings.Builder builder32 = null;
        org.elasticsearch.common.settings.Settings.Builder builder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = indexScopedSettings25.updateDynamicSettings(settings31, builder32, builder33, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(strPredicate20);
        org.junit.Assert.assertNotNull(wildcardSettingSet21);
        org.junit.Assert.assertNotNull(wildcardSettingSet22);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNotNull(indexScopedSettings25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(wildcardSetting30);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings6.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validate(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings1.isPrivateSetting("archived.");
        boolean boolean8 = indexScopedSettings1.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings1.get("hi!");
        boolean boolean15 = indexScopedSettings1.hasDynamicSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings0.applySettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass14 = indexScopedSettings12.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings7.nodeName();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings7.updateSettings(settings9, builder10, builder11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings4.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings4.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings4.getScope();
        java.lang.Class<?> wildcardClass12 = property11.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings7.nodeName();
        boolean boolean10 = indexScopedSettings7.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings11.get("archived.");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings11.updateSettings(settings14, builder15, builder16, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings9.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings9.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        boolean boolean11 = indexScopedSettings7.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings7.get("");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings7.updateDynamicSettings(settings14, builder15, builder16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        java.lang.String str8 = indexScopedSettings6.nodeName();
        boolean boolean10 = indexScopedSettings6.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting setting11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validateSettingKey(setting11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.isPrivateSetting("hi!");
        boolean boolean5 = indexScopedSettings1.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings1.getScope();
        boolean boolean12 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings1.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings1.get("");
        boolean boolean8 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings9, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings4.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings3.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings6.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings6.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validate(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validate("", settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        boolean boolean8 = indexScopedSettings5.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validate(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = indexScopedSettings0.updateDynamicSettings(settings18, builder19, builder20, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = indexScopedSettings0.updateSettings(settings18, builder19, builder20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateDynamicSettings(settings10, builder11, builder12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings8.updateSettings(settings11, builder12, builder13, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings6.applySettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strPredicate8);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings10.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings10.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings10.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(strPredicate20);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting setting13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validateSettingKey(setting13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings0.updateSettings(settings17, builder18, builder19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings4.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings4.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("hi!");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings9.applySettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings8.getScope();
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
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings0.updateSettings(settings12, builder13, builder14, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str5 = indexScopedSettings4.nodeName();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings4.dryRun(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexScopedSettings5.updateDynamicSettings(settings7, builder8, builder9, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str18 = indexScopedSettings16.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNull(wildcardSetting6);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet1 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(wildcardSettingSet1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

