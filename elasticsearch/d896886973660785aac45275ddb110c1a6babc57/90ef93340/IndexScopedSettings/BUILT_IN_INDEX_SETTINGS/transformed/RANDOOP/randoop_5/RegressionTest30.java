import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str16 = indexScopedSettings15.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = indexScopedSettings15.updateSettings(settings18, builder19, builder20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean3 = indexScopedSettings1.hasDynamicSetting("archived.");
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str10 = indexScopedSettings9.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings9.updateDynamicSettings(settings14, builder15, builder16, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings5.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings5.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings5.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings2.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings2.get("archived.");
        boolean boolean9 = indexScopedSettings2.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings2.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings2.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings4.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass9 = indexScopedSettings4.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings0.diff(settings8, settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("");
        boolean boolean14 = indexScopedSettings10.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings10.hasDynamicSetting("");
        java.lang.String str18 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str20 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(indexScopedSettings21);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = indexScopedSettings0.updateSettings(settings19, builder20, builder21, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings5.get("");
        boolean boolean10 = indexScopedSettings5.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings5.applySettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate8);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validateSettingKey(setting9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings11.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings11.updateSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings8.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = null;
        org.elasticsearch.common.settings.Settings.Builder builder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = indexScopedSettings0.updateSettings(settings22, builder23, builder24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strPredicate20);
        org.junit.Assert.assertNotNull(strPredicate21);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("hi!");
        java.lang.Class<?> wildcardClass14 = indexScopedSettings11.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings10.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings10.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings10.getScope();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings10.diff(settings16, settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings11.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings11.updateSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings6.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings6.updateDynamicSettings(settings12, builder13, builder14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings14.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings14.get("hi!");
        boolean boolean23 = indexScopedSettings14.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings11.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings7.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings7.getScope();
        boolean boolean14 = indexScopedSettings7.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass16 = strPredicate15.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting setting13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.lang.Class<?> wildcardClass16 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting setting16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings7.applySettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting26 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings28 = indexScopedSettings0.dryRun(settings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNull(wildcardSetting26);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet23 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean25 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean27 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertNotNull(wildcardSettingSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings12.archiveUnknownOrBrokenSettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.applySettings(settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean20 = indexScopedSettings0.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings2.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings3.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = indexScopedSettings3.updateDynamicSettings(settings6, builder7, builder8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet20 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNotNull(wildcardSettingSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        java.lang.String str5 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings1.get("archived.");
        boolean boolean9 = indexScopedSettings1.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str11 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings1.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings15.getINDEX_SETTINGS_KEY_PREDICATE();
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
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(strPredicate17);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean21 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean24 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings27 = indexScopedSettings0.copy(settings25, indexMetaData26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings1.getScope();
        boolean boolean16 = indexScopedSettings1.isPrivateSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.applySettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings4.get("");
        java.lang.String str7 = indexScopedSettings4.nodeName();
        boolean boolean9 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings4.applySettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings4.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings4, indexMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings4.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings4.validate(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean19 = indexScopedSettings16.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings16.get("");
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate("", settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardSetting13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings10.applySettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("archived.");
        boolean boolean9 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings11.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings11.get("archived.");
        org.elasticsearch.common.settings.Setting setting17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validateSettingKey(setting17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings7.getScope();
        boolean boolean10 = indexScopedSettings7.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.diff(settings12, settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("");
        boolean boolean14 = indexScopedSettings10.hasDynamicSetting("");
        boolean boolean16 = indexScopedSettings10.isPrivateSetting("hi!");
        boolean boolean18 = indexScopedSettings10.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet19 = indexScopedSettings10.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet19);
        org.junit.Assert.assertNotNull(strPredicate20);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings0.applySettings(settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.diff(settings6, settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings7.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings7.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings0.updateDynamicSettings(settings14, builder15, builder16, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings7.updateSettings(settings10, builder11, builder12, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet25 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet26 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property27 = indexScopedSettings0.getScope();
        java.lang.String str28 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNotNull(wildcardSettingSet25);
        org.junit.Assert.assertNotNull(wildcardSettingSet26);
        org.junit.Assert.assertTrue("'" + property27 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property27.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings11.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str14 = indexScopedSettings11.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings11.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean15 = indexScopedSettings13.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings13.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting2 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("archived.");
        boolean boolean13 = indexScopedSettings9.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean16 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.lang.Class<?> wildcardClass18 = indexScopedSettings17.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("archived.");
        boolean boolean13 = indexScopedSettings9.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean16 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings9.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings20.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings20.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertNull(wildcardSetting23);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings5.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings5.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings5.diff(settings15, settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(strPredicate14);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.copy(settings10, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings12.validateSettingKey(setting13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate20 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(strPredicate20);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings11.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate18 = indexScopedSettings16.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str19 = indexScopedSettings16.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings6.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings6.hasDynamicSetting("archived.");
        boolean boolean14 = indexScopedSettings6.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings10.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings14.dryRun(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings11.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.diff(settings14, settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings3.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings3.get("");
        boolean boolean10 = indexScopedSettings3.isPrivateSetting("");
        boolean boolean12 = indexScopedSettings3.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings0.updateDynamicSettings(settings9, builder10, builder11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass15 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings12.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings12.validate(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet23 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean25 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting27 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting29 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet30 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertNotNull(wildcardSettingSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardSetting27);
        org.junit.Assert.assertNull(wildcardSetting29);
        org.junit.Assert.assertNotNull(wildcardSettingSet30);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = null;
        org.elasticsearch.common.settings.Settings.Builder builder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = indexScopedSettings0.updateSettings(settings22, builder23, builder24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings21);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings11, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("archived.");
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
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings4, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings12.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("");
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        boolean boolean6 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings1.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate21);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("hi!");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.Class<?> wildcardClass8 = indexScopedSettings7.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings6.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings16.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean19 = indexScopedSettings16.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings16.get("");
        boolean boolean23 = indexScopedSettings16.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate24 = indexScopedSettings16.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strPredicate24);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings8 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet20 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.applySettings(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("archived.");
        boolean boolean11 = indexScopedSettings5.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings5.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings5.copy(settings12, indexMetaData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings0.updateDynamicSettings(settings14, builder15, builder16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings5.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings5.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings11.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings11.copy(settings15, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings10.get("hi!");
        boolean boolean16 = indexScopedSettings10.isPrivateSetting("archived.");
        boolean boolean18 = indexScopedSettings10.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting setting19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings10.validateSettingKey(setting19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings13.validate("archived.", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate19 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = indexScopedSettings0.updateSettings(settings20, builder21, builder22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNotNull(strPredicate19);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings13.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings14.updateDynamicSettings(settings16, builder17, builder18, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("archived.");
        boolean boolean11 = indexScopedSettings6.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings6.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings6.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting setting15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings5.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings5.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings5.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings5.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings5.getScope();
        boolean boolean13 = indexScopedSettings5.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting setting14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validateSettingKey(setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.diff(settings12, settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings15.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings15.getScope();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings15.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings15.validate(builder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings5.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings5.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings5.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings15.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
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
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings19.applySettings(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings5.hasDynamicSetting("archived.");
        java.lang.String str10 = indexScopedSettings5.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings4.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings4.diff(settings9, settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings10.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings10.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings10.diff(settings17, settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str14 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings9.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings14.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validateSettingKey(setting19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("archived.");
        boolean boolean13 = indexScopedSettings9.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean16 = indexScopedSettings9.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings9.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings14.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings14.get("hi!");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings14.validate(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.diff(settings15, settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings13.archiveUnknownOrBrokenSettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings13.get("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings13.diff(settings16, settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings11.get("hi!");
        boolean boolean17 = indexScopedSettings11.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings11.getScope();
        java.lang.String str19 = indexScopedSettings11.nodeName();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings11, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings0.updateDynamicSettings(settings15, builder16, builder17, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings12, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.applySettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings0.applySettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings1.isPrivateSetting("hi!");
        java.lang.String str6 = indexScopedSettings1.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings1.get("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str7 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.hasDynamicSetting("archived.");
        java.lang.Class<?> wildcardClass11 = indexScopedSettings8.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass14 = indexScopedSettings9.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardSetting20);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str13 = indexScopedSettings5.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str5 = indexScopedSettings4.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings7.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings14.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings6.get("");
        java.lang.String str9 = indexScopedSettings6.nodeName();
        java.lang.String str10 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings6.getScope();
        boolean boolean13 = indexScopedSettings6.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validate(builder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str10 = indexScopedSettings9.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validate("", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str16 = indexScopedSettings15.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings15.validate(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings4.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean12 = indexScopedSettings4.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings4.getScope();
        boolean boolean15 = indexScopedSettings4.hasDynamicSetting("archived.");
        java.lang.String str16 = indexScopedSettings4.nodeName();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings4.diff(settings17, settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.copy(settings5, indexMetaData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.applySettings(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings5.hasDynamicSetting("");
        boolean boolean10 = indexScopedSettings5.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings5.updateSettings(settings11, builder12, builder13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings18.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings6.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings6.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings6.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings6.get("hi!");
        boolean boolean15 = indexScopedSettings6.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings0.updateDynamicSettings(settings9, builder10, builder11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings4.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings4.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean12 = indexScopedSettings4.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings4.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings15.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.applySettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.dryRun(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings10.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings10.diff(settings12, settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings1.getScope();
        java.lang.String str5 = indexScopedSettings1.nodeName();
        boolean boolean7 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings6.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings6.get("");
        java.lang.String str12 = indexScopedSettings6.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting setting14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings6.validateSettingKey(setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateSettings(settings10, builder11, builder12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings16.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings16.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate(builder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings3.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings3.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings3.updateSettings(settings11, builder12, builder13, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings3.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings3.get("hi!");
        java.lang.String str7 = indexScopedSettings3.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings3.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str16 = indexScopedSettings11.nodeName();
        boolean boolean18 = indexScopedSettings11.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings11.copy(settings19, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings9.get("archived.");
        boolean boolean13 = indexScopedSettings9.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        java.lang.String str16 = indexScopedSettings14.nodeName();
        boolean boolean18 = indexScopedSettings14.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean21 = indexScopedSettings14.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings14.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings10.getScope();
        java.lang.String str12 = indexScopedSettings10.nodeName();
        boolean boolean14 = indexScopedSettings10.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings10.updateDynamicSettings(settings15, builder16, builder17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str19 = indexScopedSettings0.nodeName();
        java.lang.String str20 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate21 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings23 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings23.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property26 = indexScopedSettings23.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strPredicate21);
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings23);
        org.junit.Assert.assertNull(wildcardSetting25);
        org.junit.Assert.assertTrue("'" + property26 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property26.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings16.get("hi!");
        boolean boolean20 = indexScopedSettings16.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings0.updateSettings(settings10, builder11, builder12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings3.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings3.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings3.get("hi!");
        boolean boolean9 = indexScopedSettings3.hasDynamicSetting("archived.");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings3, indexMetaData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet25 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting27 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting29 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNotNull(wildcardSettingSet25);
        org.junit.Assert.assertNull(wildcardSetting27);
        org.junit.Assert.assertNull(wildcardSetting29);
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings6.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings6.getScope();
        java.lang.String str11 = indexScopedSettings6.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings6.get("");
        java.lang.String str15 = indexScopedSettings6.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings7.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings7.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass12 = indexScopedSettings7.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet17 = indexScopedSettings14.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings14.dryRun(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet17);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings5.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings5.applySettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings11.updateSettings(settings12, builder13, builder14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(indexScopedSettings11);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings9.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = indexScopedSettings9.updateDynamicSettings(settings14, builder15, builder16, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(indexScopedSettings8);
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean10 = indexScopedSettings5.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings5.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass14 = indexScopedSettings12.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
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
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate14 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean20 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean22 = indexScopedSettings0.isPrivateSetting("archived.");
        java.lang.String str23 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings0.diff(settings24, settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNotNull(indexScopedSettings18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings12.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings12.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings15.get("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings15, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean17 = indexScopedSettings15.isPrivateSetting("hi!");
        boolean boolean19 = indexScopedSettings15.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings14.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings14.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings16.validate(builder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings16);
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings10.get("hi!");
        boolean boolean16 = indexScopedSettings10.isPrivateSetting("archived.");
        java.lang.String str17 = indexScopedSettings10.nodeName();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings10.copy(settings18, indexMetaData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings5.getScope();
        boolean boolean11 = indexScopedSettings5.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings5.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings5.updateSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings6.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings6.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings6.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean6 = indexScopedSettings4.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings4.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings4.getScope();
        boolean boolean10 = indexScopedSettings4.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass18 = property17.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate15 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = indexScopedSettings0.updateDynamicSettings(settings20, builder21, builder22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings6.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings6.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str10 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings9.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings9.getScope();
        boolean boolean15 = indexScopedSettings9.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings9.get("");
        boolean boolean19 = indexScopedSettings9.isPrivateSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("hi!");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings2.getScope();
        org.elasticsearch.common.settings.Setting setting4 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings2.validateSettingKey(setting4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings5.diff(settings7, settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.applySettings(settings14);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings11.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet14 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.dryRun(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet14);
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet6 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings0.updateDynamicSettings(settings12, builder13, builder14, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean10 = indexScopedSettings8.isPrivateSetting("");
        boolean boolean12 = indexScopedSettings8.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings8.get("archived.");
        boolean boolean16 = indexScopedSettings8.hasDynamicSetting("archived.");
        java.lang.Class<?> wildcardClass17 = indexScopedSettings8.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = indexScopedSettings0.updateSettings(settings16, builder17, builder18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str9 = indexScopedSettings8.nodeName();
        boolean boolean11 = indexScopedSettings8.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings8.updateSettings(settings12, builder13, builder14, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting setting12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet11 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings9.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings9.isPrivateSetting("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings9.updateDynamicSettings(settings15, builder16, builder17, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertNotNull(wildcardSettingSet11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = indexScopedSettings9.updateDynamicSettings(settings10, builder11, builder12, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.Class<?> wildcardClass9 = strPredicate8.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings7);
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet13 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings20 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings20.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean23 = indexScopedSettings21.hasDynamicSetting("hi!");
        boolean boolean25 = indexScopedSettings21.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(wildcardSettingSet13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNotNull(indexScopedSettings20);
        org.junit.Assert.assertNotNull(indexScopedSettings21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(strPredicate9);
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("hi!");
        boolean boolean6 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings9.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str12 = indexScopedSettings9.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str10 = indexScopedSettings9.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings9.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings9.updateSettings(settings12, builder13, builder14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate10 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
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
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings7.get("hi!");
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings7, indexMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean9 = indexScopedSettings7.isPrivateSetting("archived.");
        boolean boolean11 = indexScopedSettings7.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings7.applySettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean21 = indexScopedSettings19.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings22 = indexScopedSettings19.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet23 = indexScopedSettings22.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings22.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings22);
        org.junit.Assert.assertNotNull(wildcardSettingSet23);
        org.junit.Assert.assertNull(wildcardSetting25);
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings10 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean12 = indexScopedSettings10.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings10.get("hi!");
        boolean boolean16 = indexScopedSettings10.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings10.getScope();
        java.lang.Class<?> wildcardClass18 = property17.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(indexScopedSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings3.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings6.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings7.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings7.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet12 = indexScopedSettings7.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings13 = indexScopedSettings7.getDEFAULT_SCOPED_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNotNull(wildcardSettingSet12);
        org.junit.Assert.assertNotNull(indexScopedSettings13);
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate5 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings.Builder builder10 = null;
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = indexScopedSettings0.updateDynamicSettings(settings9, builder10, builder11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings7 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validate(builder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(indexScopedSettings7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str4 = indexScopedSettings1.nodeName();
        boolean boolean6 = indexScopedSettings1.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings1.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("hi!");
        boolean boolean12 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings1.get("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings16 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate17 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings1, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
        org.junit.Assert.assertNotNull(indexScopedSettings16);
        org.junit.Assert.assertNotNull(strPredicate17);
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate2 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean4 = indexScopedSettings1.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet7 = indexScopedSettings1.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings1.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings1.get("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings12.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings12, indexMetaData14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(wildcardSettingSet7);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertNotNull(strPredicate13);
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean13 = indexScopedSettings11.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings11.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings11.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings11.validate(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting setting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings9.validateSettingKey(setting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.isPrivateSetting("");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate13 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings15 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertNotNull(indexScopedSettings15);
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings1 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings1.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings3 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings1.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings4.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean7 = indexScopedSettings5.isPrivateSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings5.get("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings5.isPrivateSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings5.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = new org.elasticsearch.common.settings.IndexScopedSettings(settings0, indexScopedSettings5, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings1);
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate6 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Settings settings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings5.validate(settings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(strPredicate6);
    }

    @Test
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.common.settings.Settings.Builder builder7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = indexScopedSettings0.updateDynamicSettings(settings6, builder7, builder8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet3 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings4 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings5.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate9 = indexScopedSettings8.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean11 = indexScopedSettings8.isPrivateSetting("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings12 = indexScopedSettings8.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean14 = indexScopedSettings8.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings8.validate(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet3);
        org.junit.Assert.assertNotNull(indexScopedSettings4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(indexScopedSettings12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings14 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean16 = indexScopedSettings14.isPrivateSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNotNull(indexScopedSettings14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate4 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet16 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
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
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet16);
        org.junit.Assert.assertNotNull(indexScopedSettings17);
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        boolean boolean11 = indexScopedSettings9.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings9.getINDEX_SETTINGS_KEY_PREDICATE();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.util.function.Predicate<java.lang.String> strPredicate1 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean3 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate7 = indexScopedSettings5.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings8 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings9 = indexScopedSettings5.getDEFAULT_SCOPED_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet10 = indexScopedSettings5.getBUILT_IN_INDEX_SETTINGS();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNotNull(strPredicate1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(indexScopedSettings5);
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertNotNull(indexScopedSettings8);
        org.junit.Assert.assertNotNull(indexScopedSettings9);
        org.junit.Assert.assertNotNull(wildcardSettingSet10);
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting setting10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validateSettingKey(setting10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean10 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.isPrivateSetting("hi!");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet18 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet18);
        org.junit.Assert.assertNotNull(indexScopedSettings19);
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean7 = indexScopedSettings0.isPrivateSetting("archived.");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet8 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean14 = indexScopedSettings0.isPrivateSetting("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet15 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate16 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.isPrivateSetting("");
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardSettingSet15);
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings2 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings6 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet9 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings11 = indexScopedSettings0.getDEFAULT_SCOPED_SETTINGS();
        java.util.function.Predicate<java.lang.String> strPredicate12 = indexScopedSettings11.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings11.get("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings11.updateDynamicSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(indexScopedSettings6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNotNull(wildcardSettingSet9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(indexScopedSettings11);
        org.junit.Assert.assertNotNull(strPredicate12);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet4 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet5 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.isPrivateSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        boolean boolean13 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardSettingSet4);
        org.junit.Assert.assertNotNull(wildcardSettingSet5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.util.Set<org.elasticsearch.common.settings.Setting<?>> wildcardSettingSet2 = indexScopedSettings0.getBUILT_IN_INDEX_SETTINGS();
        boolean boolean4 = indexScopedSettings0.isPrivateSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.util.function.Predicate<java.lang.String> strPredicate8 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.util.function.Predicate<java.lang.String> strPredicate11 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.dryRun(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardSettingSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        java.util.function.Predicate<java.lang.String> strPredicate3 = indexScopedSettings0.getINDEX_SETTINGS_KEY_PREDICATE();
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings.Builder builder8 = null;
        org.elasticsearch.common.settings.Settings.Builder builder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = indexScopedSettings0.updateSettings(settings7, builder8, builder9, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}

