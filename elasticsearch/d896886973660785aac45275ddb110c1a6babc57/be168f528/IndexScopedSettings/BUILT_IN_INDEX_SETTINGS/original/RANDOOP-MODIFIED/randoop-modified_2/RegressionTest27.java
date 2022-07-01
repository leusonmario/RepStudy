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
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("archived.");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        java.lang.String str26 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = indexScopedSettings0.updateDynamicSettings(settings12, builder13, builder14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings.Builder builder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        boolean boolean26 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting28 = indexScopedSettings0.get("hi!");
        boolean boolean30 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting32 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardSetting28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardSetting32);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
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
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("archived.");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting26 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property27 = indexScopedSettings0.getScope();
        java.lang.String str28 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertNull(wildcardSetting26);
        org.junit.Assert.assertTrue("'" + property27 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property27.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings18 = indexScopedSettings0.diff(settings16, settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        boolean boolean26 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.common.settings.Settings settings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings29 = indexScopedSettings0.diff(settings27, settings28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("archived.");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.dryRun(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        java.lang.Class<?> wildcardClass17 = indexScopedSettings0.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings.Builder builder18 = null;
        org.elasticsearch.common.settings.Settings.Builder builder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = indexScopedSettings0.updateSettings(settings17, builder18, builder19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("archived.");
        java.lang.String str24 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("hi!");
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        java.lang.String str25 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings.Builder builder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting9 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(wildcardSetting9);
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        boolean boolean23 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardSetting11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting6 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting6);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property3 = indexScopedSettings0.getScope();
        boolean boolean5 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings13 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + property3 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property3.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.common.settings.Settings.Builder builder14 = null;
        org.elasticsearch.common.settings.Settings.Builder builder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = indexScopedSettings0.updateDynamicSettings(settings13, builder14, builder15, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.common.settings.Settings.Builder builder26 = null;
        org.elasticsearch.common.settings.Settings.Builder builder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = indexScopedSettings0.updateSettings(settings25, builder26, builder27, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property14 = indexScopedSettings0.getScope();
        java.lang.String str15 = indexScopedSettings0.nodeName();
        java.lang.String str16 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        java.lang.String str18 = indexScopedSettings0.nodeName();
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings.Builder builder23 = null;
        org.elasticsearch.common.settings.Settings.Builder builder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = indexScopedSettings0.updateSettings(settings22, builder23, builder24, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + property14 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property14.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("hi!");
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings.Builder builder20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = indexScopedSettings0.updateSettings(settings19, builder20, builder21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("archived.");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        java.lang.String str25 = indexScopedSettings0.nodeName();
        boolean boolean27 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property28 = indexScopedSettings0.getScope();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + property28 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property28.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting15 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("archived.");
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting15);
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        java.lang.String str17 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str4 = indexScopedSettings0.nodeName();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("hi!", settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting21 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property23 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        boolean boolean26 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str27 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property28 = indexScopedSettings0.getScope();
        boolean boolean30 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str31 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property32 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property33 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property34 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings35 = null;
        org.elasticsearch.common.settings.Settings.Builder builder36 = null;
        org.elasticsearch.common.settings.Settings.Builder builder37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = indexScopedSettings0.updateDynamicSettings(settings35, builder36, builder37, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardSetting21);
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property23 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property23.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + property28 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property28.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + property32 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property32.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property33 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property33.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property34 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property34.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        java.lang.String str21 = indexScopedSettings0.nodeName();
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property23 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting25 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings.Builder builder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(builder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + property23 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property23.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting25);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        java.lang.String str8 = indexScopedSettings0.nodeName();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        boolean boolean17 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting23 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property24 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property25 = indexScopedSettings0.getScope();
        boolean boolean27 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(wildcardSetting23);
        org.junit.Assert.assertTrue("'" + property24 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property24.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property25 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property25.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean18 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str19 = indexScopedSettings0.nodeName();
        java.lang.String str20 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property21 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings24 = indexScopedSettings0.dryRun(settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + property21 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property21.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("hi!");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting19 = indexScopedSettings0.get("archived.");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Settings settings23 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate("archived.", settings23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown setting [archived.]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str15 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("");
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean21 = indexScopedSettings0.hasDynamicSetting("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(wildcardSetting17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting12 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        java.lang.Class<?> wildcardClass16 = property15.getClass();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardSetting12);
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting22 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property23 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings26 = indexScopedSettings0.copy(settings24, indexMetaData25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting22);
        org.junit.Assert.assertTrue("'" + property23 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property23.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("hi!");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(wildcardSetting14);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        java.lang.String str12 = indexScopedSettings0.nodeName();
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property16 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property18 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property19 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property16 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property16.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property18 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property18.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property19 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property19.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str13 = indexScopedSettings0.nodeName();
        java.lang.String str14 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting4 = indexScopedSettings0.get("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        boolean boolean7 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str8 = indexScopedSettings0.nodeName();
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
        org.junit.Assert.assertNull(wildcardSetting4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        java.lang.String str11 = indexScopedSettings0.nodeName();
        java.lang.String str12 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        boolean boolean13 = indexScopedSettings0.hasDynamicSetting("archived.");
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Settings settings11 = null;
        org.elasticsearch.common.settings.Settings.Builder builder12 = null;
        org.elasticsearch.common.settings.Settings.Builder builder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = indexScopedSettings0.updateSettings(settings11, builder12, builder13, "");
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
        org.junit.Assert.assertNull(wildcardSetting10);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        boolean boolean2 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.cluster.metadata.IndexMetaData indexMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings5 = indexScopedSettings0.copy(settings3, indexMetaData4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("");
        java.lang.String str9 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        boolean boolean15 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings17 = indexScopedSettings0.archiveUnknownOrBrokenSettings(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Settings settings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting13 = indexScopedSettings0.get("");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertNull(wildcardSetting13);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        java.lang.String str25 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property26 = indexScopedSettings0.getScope();
        java.lang.String str27 = indexScopedSettings0.nodeName();
        boolean boolean29 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Settings settings30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings31 = indexScopedSettings0.applySettings(settings30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + property26 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property26.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property2 = indexScopedSettings0.getScope();
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str5 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting7 = indexScopedSettings0.get("archived.");
        boolean boolean9 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting11 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("hi!");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + property2 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property2.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(wildcardSetting7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardSetting11);
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property7 = indexScopedSettings0.getScope();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + property7 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property7.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        org.elasticsearch.common.settings.Setting<?> wildcardSetting2 = indexScopedSettings0.get("");
        boolean boolean4 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property5 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property6 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("");
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
        org.junit.Assert.assertNull(wildcardSetting2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + property5 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property5.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property6 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property6.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        java.lang.String str9 = indexScopedSettings0.nodeName();
        boolean boolean11 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            indexScopedSettings0.validate(settings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting10 = indexScopedSettings0.get("hi!");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting.Property property15 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting17 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardSetting10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + property15 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property15.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting17);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property13 = indexScopedSettings0.getScope();
        java.lang.String str14 = indexScopedSettings0.nodeName();
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property13 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property13.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        org.elasticsearch.common.settings.Setting.Property property17 = indexScopedSettings0.getScope();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings.Builder builder21 = null;
        org.elasticsearch.common.settings.Settings.Builder builder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = indexScopedSettings0.updateDynamicSettings(settings20, builder21, builder22, "archived.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + property17 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property17.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting8 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property10 = indexScopedSettings0.getScope();
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardSetting8);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property10 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property10.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        java.lang.String str5 = indexScopedSettings0.nodeName();
        java.lang.String str6 = indexScopedSettings0.nodeName();
        java.lang.String str7 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property8 = indexScopedSettings0.getScope();
        boolean boolean10 = indexScopedSettings0.hasDynamicSetting("archived.");
        boolean boolean12 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean14 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting16 = indexScopedSettings0.get("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting20 = indexScopedSettings0.get("");
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
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + property8 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property8.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardSetting16);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertNull(wildcardSetting20);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting18 = indexScopedSettings0.get("");
        boolean boolean20 = indexScopedSettings0.hasDynamicSetting("hi!");
        boolean boolean22 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting24 = indexScopedSettings0.get("");
        boolean boolean26 = indexScopedSettings0.hasDynamicSetting("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardSetting18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardSetting24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str20 = indexScopedSettings0.nodeName();
        java.lang.String str21 = indexScopedSettings0.nodeName();
        java.lang.String str22 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property23 = indexScopedSettings0.getScope();
        boolean boolean25 = indexScopedSettings0.hasDynamicSetting("hi!");
        java.lang.String str26 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Settings settings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.settings.Settings settings28 = indexScopedSettings0.applySettings(settings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + property23 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property23.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        org.elasticsearch.common.settings.IndexScopedSettings indexScopedSettings0 = org.elasticsearch.common.settings.IndexScopedSettings.DEFAULT_SCOPED_SETTINGS;
        java.lang.String str1 = indexScopedSettings0.nodeName();
        boolean boolean3 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property4 = indexScopedSettings0.getScope();
        boolean boolean6 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean8 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property9 = indexScopedSettings0.getScope();
        java.lang.String str10 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property11 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting.Property property12 = indexScopedSettings0.getScope();
        org.elasticsearch.common.settings.Setting<?> wildcardSetting14 = indexScopedSettings0.get("archived.");
        boolean boolean16 = indexScopedSettings0.hasDynamicSetting("");
        java.lang.String str17 = indexScopedSettings0.nodeName();
        boolean boolean19 = indexScopedSettings0.hasDynamicSetting("hi!");
        org.elasticsearch.common.settings.Setting.Property property20 = indexScopedSettings0.getScope();
        java.lang.String str21 = indexScopedSettings0.nodeName();
        org.elasticsearch.common.settings.Setting.Property property22 = indexScopedSettings0.getScope();
        boolean boolean24 = indexScopedSettings0.hasDynamicSetting("");
        boolean boolean26 = indexScopedSettings0.hasDynamicSetting("archived.");
        org.elasticsearch.common.settings.Setting<?> wildcardSetting28 = indexScopedSettings0.get("archived.");
        org.junit.Assert.assertNotNull(indexScopedSettings0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + property4 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property4.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + property9 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property9.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + property11 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property11.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + property12 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property12.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertNull(wildcardSetting14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + property20 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property20.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + property22 + "' != '" + org.elasticsearch.common.settings.Setting.Property.IndexScope + "'", property22.equals(org.elasticsearch.common.settings.Setting.Property.IndexScope));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardSetting28);
    }
}

