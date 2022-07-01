import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass21 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.applySettings(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str21 = indexScopedSettings0.nodeName();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean25 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property26 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings28 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + property26 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property26.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        java.lang.String str10 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings0.applySettings(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardSetting22);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        java.lang.String str20 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings27 = indexScopedSettings0.applySettings(settings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = indexScopedSettings0.updateDynamicSettings(settings18, builder19, builder20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings0.copy(settings19, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardSetting6);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.copy(settings17, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings6 = indexScopedSettings0.dryRun(settings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        java.lang.String str26 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.common.settings.Settings.Builder builder28 = null;
        org.elasticsearch.common.settings.Settings.Builder builder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = indexScopedSettings0.updateSettings(settings27, builder28, builder29, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.dryRun(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.lang.String str18 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertNull(wildcardSetting23);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.applySettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass19 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.dryRun(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(wildcardSetting19);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings0.applySettings(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardSetting23);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = indexScopedSettings0.updateSettings(settings19, builder20, builder21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings25 = indexScopedSettings0.diff(settings23, settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings0.dryRun(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.lang.String str18 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardSetting20);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str24 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNull(wildcardSetting26);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.applySettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.dryRun(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass18 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings21 = indexScopedSettings0.dryRun(settings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.diff(settings9, settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateSettings(settings13, builder14, builder15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings0.updateDynamicSettings(settings17, builder18, builder19, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        java.lang.String str21 = indexScopedSettings0.nodeName();
        java.lang.String str22 = indexScopedSettings0.nodeName();
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings0.dryRun(settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings0.updateSettings(settings17, builder18, builder19, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        java.lang.String str20 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("");
        java.lang.Class<?> wildcardClass23 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.dryRun(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateDynamicSettings(settings13, builder14, builder15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        java.lang.String str2 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings14 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        java.lang.String str26 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property27 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + property27 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property27.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings18 = indexScopedSettings0.copy(settings16, indexMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateSettings(settings13, builder14, builder15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.dryRun(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property26 = indexScopedSettings0.getScope();
        java.lang.String str27 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting29 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings31 = indexScopedSettings0.dryRun(settings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + property26 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property26.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(wildcardSetting29);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.common.settings.Settings.Builder builder26 = null;
        org.elasticsearch.common.settings.Settings.Builder builder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = indexScopedSettings0.updateSettings(settings25, builder26, builder27, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNull(wildcardSetting24);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings0.applySettings(settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNull(wildcardSetting22);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings24 = indexScopedSettings0.copy(settings22, indexMetaData23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings25 = indexScopedSettings0.diff(settings23, settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings19 = indexScopedSettings0.dryRun(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings25 = indexScopedSettings0.diff(settings23, settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNull(wildcardSetting22);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.applySettings(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("archived.");
        java.lang.String str23 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings16 = indexScopedSettings0.dryRun(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings15 = indexScopedSettings0.dryRun(settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.copy(settings15, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.Class<?> wildcardClass14 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("");
        java.lang.String str23 = indexScopedSettings0.nodeName();
        java.lang.String str24 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings0.applySettings(settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.dryRun(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.Class<?> wildcardClass15 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        java.lang.String str19 = indexScopedSettings0.nodeName();
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str13 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings0.updateSettings(settings12, builder13, builder14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings0.updateSettings(settings15, builder16, builder17, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings12 = indexScopedSettings0.applySettings(settings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings11 = indexScopedSettings0.diff(settings9, settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings9 = indexScopedSettings0.dryRun(settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings21 = indexScopedSettings0.copy(settings19, indexMetaData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str3 = indexScopedSettings0.nodeName();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings0.updateDynamicSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings10 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings22 = indexScopedSettings0.applySettings(settings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings25 = indexScopedSettings0.dryRun(settings24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("hi!");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings19 = indexScopedSettings0.copy(settings17, indexMetaData18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting.Property property1 = indexScopedSettings0.getScope();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + property1 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property1.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("");
        java.lang.String str23 = indexScopedSettings0.nodeName();
        java.lang.String str24 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings26 = indexScopedSettings0.dryRun(settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass19 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings23 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property23 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings25 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("", settings25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting []");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertTrue("'" + property23 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property23.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        java.lang.String str18 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings17 = indexScopedSettings0.copy(settings15, indexMetaData16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings20 = indexScopedSettings0.dryRun(settings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(wildcardSetting18);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings26 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass11 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        boolean boolean27 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property28 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings30 = indexScopedSettings0.dryRun(settings29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + property28 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property28.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings.Builder builder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings.Builder builder16 = null;
        org.elasticsearch.common.settings.Settings.Builder builder17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = indexScopedSettings0.updateSettings(settings15, builder16, builder17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting5 = indexScopedSettings0.get("archived.");
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.lang.String str17 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass18 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardSetting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.Class<?> wildcardClass12 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass10 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("hi!");
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("archived.");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass23 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting3 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(wildcardSetting3);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertNull(wildcardSetting24);
    }
}

