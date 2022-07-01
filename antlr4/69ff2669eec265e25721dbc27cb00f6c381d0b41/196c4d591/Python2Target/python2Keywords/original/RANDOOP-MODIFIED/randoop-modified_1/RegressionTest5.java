import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset\"\\\"_tsetPython2\\\"\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("__tsetContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"ContextContext" + "'", str8, "_tset\"\\\"_tsetPython2\\\"\"ContextContext");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        java.lang.String str13 = python2Target1.getVersion();
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"_tsetPython2Context\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        boolean boolean8 = python2Target7.wantsBaseListener();
        java.lang.String str10 = python2Target7.getListLabel("");
        java.lang.String str12 = python2Target7.getTargetStringLiteralFromString("");
        java.lang.String str14 = python2Target7.getListLabel("_tset4.5.2.1");
        java.lang.String str15 = python2Target7.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target7.getCodeGenerator();
        java.lang.String str18 = python2Target7.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = new int[] {};
        java.lang.String[] strArray25 = python2Target21.getTokenTypesAsTargetLabels(grammar23, intArray24);
        java.lang.String[] strArray26 = python2Target7.getTokenTypesAsTargetLabels(grammar19, intArray24);
        java.lang.String[] strArray27 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray24);
        java.lang.String str29 = python2Target1.getAltLabelContextStructName("\"\\\"_tset_tset4.5.2.1\\\"\"");
        java.lang.String str31 = python2Target1.encodeIntAsCharEscape((int) 'a');
        boolean boolean32 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset4.5.2.1" + "'", str14, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"ython\\\"\"" + "'", str18, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_tset_tset4.5.2.1\\\"\"Context" + "'", str29, "\"\\\"_tset_tset4.5.2.1\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "a" + "'", str31, "a");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.getVersion();
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromString("\"_tset_\\\"\\\\\\\\n\\\"Context\"");
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("tset\\\\");
        java.lang.String str21 = python2Target1.getTargetStringLiteralFromString("\"\\\"ython\\\"\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"Context\\\"\"" + "'", str16, "\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\\n\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Tset\\\\Context" + "'", str18, "Tset\\\\Context");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\"\\\\\\\"ython\\\\\\\"\\\"" + "'", str21, "\\\"\\\\\\\"ython\\\\\\\"\\\"");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_tsethi!\"");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.lang.String str15 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\64", false);
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        boolean boolean17 = python2Target16.wantsBaseListener();
        java.lang.String str19 = python2Target16.getListLabel("");
        java.lang.String str21 = python2Target16.getTargetStringLiteralFromString("");
        boolean boolean22 = python2Target16.templatesExist();
        java.lang.String str24 = python2Target16.getImplicitSetLabel("hi");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.wantsBaseListener();
        java.lang.String str30 = python2Target27.getListLabel("");
        java.lang.String str32 = python2Target27.getTargetStringLiteralFromString("");
        java.lang.String str34 = python2Target27.getListLabel("_tset4.5.2.1");
        java.lang.String str35 = python2Target27.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python2Target27.getCodeGenerator();
        java.lang.String str38 = python2Target27.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        boolean boolean42 = python2Target41.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python2Target41.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python2Target27.getTokenTypesAsTargetLabels(grammar39, intArray44);
        java.lang.String[] strArray47 = python2Target16.getTokenTypesAsTargetLabels(grammar25, intArray44);
        java.lang.String[] strArray48 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python2\"" + "'", str13, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tsethi" + "'", str24, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset4.5.2.1" + "'", str34, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"ython\\\"\"" + "'", str38, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getListLabel("\"_tset_tsethi!ContextContextContext\"");
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset_tsethi!ContextContextContext\"" + "'", str9, "\"_tset_tsethi!ContextContextContext\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str13 = python2Target1.getVersion();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getImplicitTokenLabel("\\\"__hi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"" + "'", str11, "_\"\\\"ython\\\"\"");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python2Target1.getListLabel("\"\\\"_tsetPython2\\\"\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_4.5.2.1" + "'", str12, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str15, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        boolean boolean10 = python2Target9.supportsOverloadedMethods();
        boolean boolean11 = python2Target9.supportsOverloadedMethods();
        boolean boolean12 = python2Target9.supportsOverloadedMethods();
        java.lang.String str14 = python2Target9.getImplicitRuleLabel("");
        java.lang.String str16 = python2Target9.getListLabel("_\\1");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        java.lang.String str21 = python2Target19.getTargetStringLiteralFromString("");
        java.lang.String str23 = python2Target19.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean24 = python2Target19.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target19.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.wantsBaseListener();
        java.lang.String str31 = python2Target28.getListLabel("");
        java.lang.String str33 = python2Target28.getTargetStringLiteralFromString("");
        java.lang.String str35 = python2Target28.getListLabel("_tset4.5.2.1");
        java.lang.String str36 = python2Target28.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python2Target28.getCodeGenerator();
        java.lang.String str39 = python2Target28.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        boolean boolean43 = python2Target42.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python2Target42.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python2Target28.getTokenTypesAsTargetLabels(grammar40, intArray45);
        java.lang.String[] strArray48 = python2Target19.getTokenTypesAsTargetLabels(grammar26, intArray45);
        java.lang.String[] strArray49 = python2Target9.getTokenTypesAsTargetLabels(grammar17, intArray45);
        java.lang.String[] strArray50 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\1" + "'", str16, "_\\1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str23, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"" + "'", str33, "\"\"");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_tset4.5.2.1" + "'", str35, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Python2" + "'", str36, "Python2");
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\\\"ython\\\"\"" + "'", str39, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_tsethi!\"");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetPython2Context", true);
        java.lang.String str16 = python2Target1.getAltLabelContextStructName("_tset_\"\\\\n\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        java.lang.String str18 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetPython2Context\"" + "'", str14, "\"_tsetPython2Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset_\"\\\\n\"ContextContextContext" + "'", str16, "_tset_\"\\\\n\"ContextContextContext");
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_\\1", false);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target12.getCodeGenerator();
        int int15 = python2Target12.getInlineTestSetWordSize();
        boolean boolean16 = python2Target12.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target12.getTemplates();
        java.lang.String str20 = python2Target12.getTargetStringLiteralFromString("6Context", false);
        java.lang.String str22 = python2Target12.getImplicitRuleLabel("\\\"\\\\\\\\n\\\"Context");
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        boolean boolean26 = python2Target25.wantsBaseListener();
        int int27 = python2Target25.getInlineTestSetWordSize();
        java.lang.String str29 = python2Target25.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str30 = python2Target25.getVersion();
        java.lang.String str33 = python2Target25.getTargetStringLiteralFromString("\"_tsetPython2\"", false);
        boolean boolean34 = python2Target25.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        boolean boolean38 = python2Target37.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python2Target37.getCodeGenerator();
        java.lang.String str41 = python2Target37.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python2Target37.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python2Target25.getTokenTypesAsTargetLabels(grammar35, intArray43);
        java.lang.String[] strArray46 = python2Target12.getTokenTypesAsTargetLabels(grammar23, intArray43);
        java.lang.String[] strArray47 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray43);
        java.util.Set<java.lang.String> strSet48 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\\\\1" + "'", str9, "_\\\\1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "6Context" + "'", str20, "6Context");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_\\\"\\\\\\\\n\\\"Context" + "'", str22, "_\\\"\\\\\\\\n\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\\"_tsetPython2\\\"" + "'", str33, "\\\"_tsetPython2\\\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\\1\"" + "'", str41, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strSet48);
    }
}

