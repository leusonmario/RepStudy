import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        boolean boolean15 = python2Target1.wantsBaseVisitor();
        java.lang.String str16 = python2Target1.getVersion();
        boolean boolean17 = python2Target1.wantsBaseVisitor();
        boolean boolean18 = python2Target1.templatesExist();
        boolean boolean19 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"Python2\"");
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("_tset_tset_tset0Contex");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str12, "\"\\\"Python2\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset_tset_tset_tset0Contex" + "'", str16, "_tset_tset_tset_tset0Contex");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\".5.2.\"");
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\".5.2.\"Context" + "'", str11, "\".5.2.\"Context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"@\\\"Context\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset\\\\\\\"@\\\\\\\"Context\\\"\"" + "'", str10, "\"\\\"_tset\\\\\\\"@\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"", false);
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"\\\"i\\\"Context\"Context");
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\\\"tset\\\\\\\"\\\\\\\"ython\\\\\\\"\\\"ContextContext", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"i\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"i\\\"Context\"ContextContext" + "'", str14, "\"\\\"i\\\"Context\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\\\\\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"ContextContext" + "'", str17, "\\\\\\\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"ContextContext");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_tset\"_\\\\\\\"\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\"\\\\\\\"\"", true);
        int int14 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"" + "'", str13, "\"_tset\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        boolean boolean13 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("__\"\\\"____tset\\\"\"", false);
        boolean boolean7 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\\\"\\\\\\\"____tset\\\\\\\"\\\"" + "'", str6, "__\\\"\\\\\\\"____tset\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset\\\"@\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getImplicitTokenLabel("\"tset_tset\\\"tset0Contex\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"@\\\"Context" + "'", str18, "_tset\\\"@\\\"Context");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\".5.2.\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\"\\\\\\\"@\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\".5.2.\\\"\"" + "'", str11, "_tset\"\\\".5.2.\\\"\"");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"Python2\"");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"");
        java.lang.String str16 = python2Target1.getListLabel("____tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"_tset_tset____tset\"", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str12, "\"\\\"Python2\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"" + "'", str14, "__\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "____tset" + "'", str16, "____tset");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset_tset____tset" + "'", str20, "_tset_tset____tset");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        java.lang.String str5 = python2Target1.getListLabel("_\"4.5.2.1ContextContex\"");
        java.lang.String str7 = python2Target1.getImplicitSetLabel("_tset_tset\"tset6\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str3, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_\"4.5.2.1ContextContex\"" + "'", str5, "_\"4.5.2.1ContextContex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset_tset\"tset6\"" + "'", str7, "_tset_tset_tset\"tset6\"");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("ytho", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset" + "'", str9, "_tset");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ytho\"" + "'", str13, "\"ytho\"");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_tset\"_tset_hi!Contex\"", false);
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tset\\\"_tset_hi!Contex" + "'", str11, "tset\\\"_tset_hi!Contex");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getLanguage();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("AContext");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python2" + "'", str2, "Python2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsetAContext" + "'", str4, "_tsetAContext");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_\"_tsethi!\"", false);
        java.lang.String str14 = python2Target1.getVersion();
        int int15 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@Context" + "'", str10, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"_tsethi!\\\"" + "'", str13, "_\\\"_tsethi!\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str9, "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("#");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("tset_tset0Contex");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromString("tset0", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset#" + "'", str7, "_tset#");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"tset_tset0Contex\"" + "'", str9, "\"tset_tset0Contex\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset0\"" + "'", str15, "\"tset0\"");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"", true);
        java.lang.String str15 = python2Target1.getListLabel("_\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"Context");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str13, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"Context" + "'", str15, "_\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"Context");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        boolean boolean13 = python2Target1.wantsBaseListener();
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("#");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset#" + "'", str6, "_tset#");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset\"@\"Context");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.supportsOverloadedMethods();
        boolean boolean14 = python2Target12.wantsBaseListener();
        boolean boolean15 = python2Target12.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target12.getTemplates();
        boolean boolean17 = python2Target12.templatesExist();
        java.lang.String str20 = python2Target12.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str22 = python2Target12.getAltLabelContextStructName("@");
        java.lang.String str24 = python2Target12.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target12.getTemplates();
        java.util.Set<java.lang.String> strSet26 = python2Target12.getBadWords();
        boolean boolean27 = python2Target12.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target12.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        boolean boolean36 = python2Target35.supportsOverloadedMethods();
        boolean boolean37 = python2Target35.wantsBaseListener();
        boolean boolean38 = python2Target35.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target35.getTemplates();
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        boolean boolean43 = python2Target42.supportsOverloadedMethods();
        boolean boolean44 = python2Target42.wantsBaseListener();
        boolean boolean45 = python2Target42.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python2Target42.getTokenTypesAsTargetLabels(grammar46, intArray47);
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python2Target42.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "hi!", true);
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        boolean boolean56 = python2Target55.supportsOverloadedMethods();
        boolean boolean57 = python2Target55.wantsBaseListener();
        boolean boolean58 = python2Target55.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar59 = null;
        int[] intArray60 = new int[] {};
        java.lang.String[] strArray61 = python2Target55.getTokenTypesAsTargetLabels(grammar59, intArray60);
        java.lang.String[] strArray62 = python2Target42.getTokenTypesAsTargetLabels(grammar53, intArray60);
        java.lang.String[] strArray63 = python2Target35.getTokenTypesAsTargetLabels(grammar40, intArray60);
        java.lang.String[] strArray64 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray60);
        java.lang.String[] strArray65 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray60);
        int int66 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset\"@\"Context" + "'", str9, "_tset_tset\"@\"Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str20, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "@Context" + "'", str22, "@Context");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "__tset_tset\\0Context" + "'", str24, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "tset0" + "'", str31, "tset0");
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"i\"" + "'", str52, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\0Context");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("__tset_hi!", false);
        java.lang.String str20 = python2Target1.getImplicitRuleLabel("\"_tset\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset_hi!" + "'", str18, "__tset_hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\"_tset\\\"hi!\\\"\"" + "'", str20, "_\"_tset\\\"hi!\\\"\"");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("____tset");
        int int14 = python2Target1.getInlineTestSetWordSize();
        boolean boolean15 = python2Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"____tset\"" + "'", str13, "\"____tset\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String str15 = python2Target13.getImplicitSetLabel("hi!");
        java.lang.String str17 = python2Target13.getListLabel("");
        java.util.Set<java.lang.String> strSet18 = python2Target13.getBadWords();
        boolean boolean19 = python2Target13.wantsBaseListener();
        boolean boolean20 = python2Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        boolean boolean24 = python2Target23.supportsOverloadedMethods();
        boolean boolean25 = python2Target23.templatesExist();
        java.util.Set<java.lang.String> strSet26 = python2Target23.getBadWords();
        java.lang.String str29 = python2Target23.getTargetStringLiteralFromString("", false);
        boolean boolean30 = python2Target23.templatesExist();
        java.lang.String str31 = python2Target23.getLanguage();
        java.lang.String str32 = python2Target23.getLanguage();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        java.lang.String str38 = python2Target35.getTargetStringLiteralFromString("", false);
        boolean boolean39 = python2Target35.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet40 = python2Target35.getBadWords();
        java.lang.String str41 = python2Target35.getVersion();
        int int42 = python2Target35.getInlineTestSetWordSize();
        java.lang.String str44 = python2Target35.getListLabel("Python2");
        java.lang.String str45 = python2Target35.getVersion();
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target35.getTemplates();
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target49 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator48);
        boolean boolean50 = python2Target49.supportsOverloadedMethods();
        boolean boolean51 = python2Target49.wantsBaseListener();
        boolean boolean52 = python2Target49.wantsBaseVisitor();
        java.lang.String str54 = python2Target49.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str56 = python2Target49.getListLabel("_tset_hi!");
        java.lang.String str58 = python2Target49.getListLabel("");
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target61 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator60);
        boolean boolean62 = python2Target61.supportsOverloadedMethods();
        boolean boolean63 = python2Target61.wantsBaseListener();
        boolean boolean64 = python2Target61.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar65 = null;
        int[] intArray66 = new int[] {};
        java.lang.String[] strArray67 = python2Target61.getTokenTypesAsTargetLabels(grammar65, intArray66);
        java.lang.String[] strArray68 = python2Target49.getTokenTypesAsTargetLabels(grammar59, intArray66);
        java.lang.String[] strArray69 = python2Target35.getTokenTypesAsTargetLabels(grammar47, intArray66);
        java.lang.String[] strArray70 = python2Target23.getTokenTypesAsTargetLabels(grammar33, intArray66);
        java.lang.String[] strArray71 = python2Target13.getTokenTypesAsTargetLabels(grammar21, intArray66);
        java.lang.String[] strArray72 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray66);
        java.lang.String str74 = python2Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1" + "'", str8, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Context" + "'", str10, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tsethi!" + "'", str15, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Python2" + "'", str31, "Python2");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Python2" + "'", str32, "Python2");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4.5.2.1" + "'", str41, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Python2" + "'", str44, "Python2");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_4.5.2.1" + "'", str54, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset_hi!" + "'", str56, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\\64" + "'", str74, "\\64");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"__tset\"");
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"__tset\"" + "'", str12, "_\"__tset\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_tset\\64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset\\64" + "'", str13, "_tset_tset\\64");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) '#');
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\"__tset_tsetPython2\"", false);
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\"__tset_tsetPython2\\\"" + "'", str6, "\\\"__tset_tsetPython2\\\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        java.lang.String str16 = python2Target13.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target13.getTemplates();
        int int18 = python2Target13.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        java.lang.String str23 = python2Target21.getAltLabelContextStructName("\\0");
        boolean boolean24 = python2Target21.wantsBaseListener();
        java.lang.String str26 = python2Target21.getImplicitRuleLabel("___tset");
        java.lang.String str28 = python2Target21.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet29 = python2Target21.getBadWords();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        boolean boolean33 = python2Target32.supportsOverloadedMethods();
        boolean boolean34 = python2Target32.wantsBaseListener();
        boolean boolean35 = python2Target32.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target32.getTemplates();
        boolean boolean37 = python2Target32.templatesExist();
        java.lang.String str39 = python2Target32.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python2Target32.getCodeGenerator();
        boolean boolean41 = python2Target32.templatesExist();
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        boolean boolean45 = python2Target44.supportsOverloadedMethods();
        boolean boolean46 = python2Target44.wantsBaseListener();
        boolean boolean47 = python2Target44.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target44.getTokenTypesAsTargetLabels(grammar48, intArray49);
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        java.lang.String str54 = python2Target44.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator51, "hi!", true);
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target57 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator56);
        boolean boolean58 = python2Target57.supportsOverloadedMethods();
        boolean boolean59 = python2Target57.wantsBaseListener();
        boolean boolean60 = python2Target57.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python2Target57.getTokenTypesAsTargetLabels(grammar61, intArray62);
        java.lang.String[] strArray64 = python2Target44.getTokenTypesAsTargetLabels(grammar55, intArray62);
        java.lang.String[] strArray65 = python2Target32.getTokenTypesAsTargetLabels(grammar42, intArray62);
        java.lang.String[] strArray66 = python2Target21.getTokenTypesAsTargetLabels(grammar30, intArray62);
        java.lang.String[] strArray67 = python2Target13.getTokenTypesAsTargetLabels(grammar19, intArray62);
        java.lang.String[] strArray68 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray62);
        java.lang.String str70 = python2Target1.getImplicitRuleLabel("\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0Context" + "'", str23, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "____tset" + "'", str26, "____tset");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"@\"" + "'", str28, "\"@\"");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"_tsetContext\"" + "'", str39, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"i\"" + "'", str54, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "_\".5.2.\"" + "'", str70, "_\".5.2.\"");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"_tset__tset\\\\\\\"@\\\\\\\"ContextContext\"Context", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__tset\\\\\\\"@\\\\\\\"ContextContext\\\"Contex" + "'", str8, "_tset__tset\\\\\\\"@\\\\\\\"ContextContext\\\"Contex");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet24 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target1.getCodeGenerator();
        java.lang.String str27 = python2Target1.getTargetStringLiteralFromString("\\0Context");
        java.lang.String str29 = python2Target1.getImplicitSetLabel("\"tset0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\\0Context\"" + "'", str27, "\"\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_tset\"tset0Contex\"" + "'", str29, "_tset\"tset0Contex\"");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"", false);
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"i\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_tset\\0Context");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        int int14 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("_tset\"tset6\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset\"tset6\"" + "'", str18, "__tset\"tset6\"");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        boolean boolean15 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet16 = python2Target1.getBadWords();
        java.lang.String str17 = python2Target1.getLanguage();
        java.lang.String str18 = python2Target1.getLanguage();
        boolean boolean19 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("__\"\\\"____tset\\\"\"");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("tsetPython");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"\\\"____tset\\\"\"Context" + "'", str8, "__\"\\\"____tset\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TsetPythonContext" + "'", str10, "TsetPythonContext");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        boolean boolean22 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet23 = python2Target1.getBadWords();
        boolean boolean24 = python2Target1.templatesExist();
        java.lang.String str26 = python2Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\0" + "'", str26, "\\0");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str9, "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_tset\"\\\" \\\"\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\64" + "'", str11, "\\64");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tset\\\"\\\" \\\"" + "'", str19, "tset\\\"\\\" \\\"");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset\"\\\".5.2.\\\"\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset\"\\\".5.2.\\\"\\\"Contex\"" + "'", str13, "__tset\"\\\".5.2.\\\"\\\"Contex\"");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        java.lang.String str11 = python2Target1.getListLabel("\\1");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("__\"_tsethi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\n" + "'", str13, "\\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "___\"_tsethi!\"" + "'", str15, "___\"_tsethi!\"");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) '#');
        int int14 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str15 = python2Target1.getVersion();
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("__tset_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "___tset_tset\\0Context" + "'", str17, "___tset_tset\\0Context");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_\"_tsethi!\"");
        java.lang.String str7 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"_tsethi!\"" + "'", str6, "__\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_tset4.5.2.1ContextContex");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getAltLabelContextStructName("\\0");
        int int18 = python2Target15.getSerializedATNSegmentLimit();
        java.lang.String str19 = python2Target15.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target15.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        java.lang.String str25 = python2Target23.getAltLabelContextStructName("\\0");
        boolean boolean26 = python2Target23.wantsBaseListener();
        java.lang.String str28 = python2Target23.getImplicitRuleLabel("___tset");
        java.lang.String str30 = python2Target23.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet31 = python2Target23.getBadWords();
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        boolean boolean35 = python2Target34.supportsOverloadedMethods();
        boolean boolean36 = python2Target34.wantsBaseListener();
        boolean boolean37 = python2Target34.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup38 = python2Target34.getTemplates();
        boolean boolean39 = python2Target34.templatesExist();
        java.lang.String str41 = python2Target34.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = python2Target34.getCodeGenerator();
        boolean boolean43 = python2Target34.templatesExist();
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        boolean boolean47 = python2Target46.supportsOverloadedMethods();
        boolean boolean48 = python2Target46.wantsBaseListener();
        boolean boolean49 = python2Target46.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar50 = null;
        int[] intArray51 = new int[] {};
        java.lang.String[] strArray52 = python2Target46.getTokenTypesAsTargetLabels(grammar50, intArray51);
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        java.lang.String str56 = python2Target46.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator53, "hi!", true);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        boolean boolean60 = python2Target59.supportsOverloadedMethods();
        boolean boolean61 = python2Target59.wantsBaseListener();
        boolean boolean62 = python2Target59.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar63 = null;
        int[] intArray64 = new int[] {};
        java.lang.String[] strArray65 = python2Target59.getTokenTypesAsTargetLabels(grammar63, intArray64);
        java.lang.String[] strArray66 = python2Target46.getTokenTypesAsTargetLabels(grammar57, intArray64);
        java.lang.String[] strArray67 = python2Target34.getTokenTypesAsTargetLabels(grammar44, intArray64);
        java.lang.String[] strArray68 = python2Target23.getTokenTypesAsTargetLabels(grammar32, intArray64);
        java.lang.String[] strArray69 = python2Target15.getTokenTypesAsTargetLabels(grammar21, intArray64);
        java.lang.String[] strArray70 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray64);
        java.lang.Class<?> wildcardClass71 = strArray70.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset4.5.2.1ContextContex" + "'", str12, "_tset_tset4.5.2.1ContextContex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\0Context" + "'", str17, "\\0Context");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\0Context" + "'", str25, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "____tset" + "'", str28, "____tset");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"@\"" + "'", str30, "\"@\"");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(sTGroup38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"_tsetContext\"" + "'", str41, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"i\"" + "'", str56, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"_tset_hi!\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"\\\"__\\\\\\\"_tset_hi!\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str11, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"__\\\\\\\"_tset_hi!\\\\\\\"\\\"\"Context" + "'", str14, "\"\\\"__\\\\\\\"_tset_hi!\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset_hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1ContextContexContext");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_#");
        java.lang.String str15 = python2Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_hi!" + "'", str10, "__tset_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset4.5.2.1ContextContexContext\"" + "'", str12, "\"_tset_tset4.5.2.1ContextContexContext\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_#" + "'", str14, "_tset_#");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python2" + "'", str15, "Python2");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\" \"", true);
        boolean boolean14 = python2Target1.templatesExist();
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_\"\\\\0Context\"");
        java.lang.String str18 = python2Target1.getListLabel("\"\\\\\\\"\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\"\\\\\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\" \"" + "'", str13, "\" \"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__\"\\\\0Context\"" + "'", str16, "__\"\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\\\\\"\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\"\\\\\\\"Context\"" + "'", str18, "\"\\\\\\\"\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\"\\\\\\\"Context\"");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("_\"\\\".5.2.\\\"\"", false);
        boolean boolean18 = python2Target1.supportsOverloadedMethods();
        java.lang.String str19 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python2Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\\"\\\\\\\".5.2.\\\\\\\"\\\"" + "'", str17, "_\\\"\\\\\\\".5.2.\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getLanguage();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        boolean boolean12 = python2Target11.supportsOverloadedMethods();
        boolean boolean13 = python2Target11.wantsBaseListener();
        boolean boolean14 = python2Target11.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python2Target11.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray16);
        boolean boolean19 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        boolean boolean8 = python2Target7.supportsOverloadedMethods();
        boolean boolean9 = python2Target7.wantsBaseListener();
        boolean boolean10 = python2Target7.wantsBaseVisitor();
        boolean boolean11 = python2Target7.supportsOverloadedMethods();
        java.lang.String str13 = python2Target7.encodeIntAsCharEscape((int) (short) 100);
        int int14 = python2Target7.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target7.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        boolean boolean20 = python2Target19.supportsOverloadedMethods();
        boolean boolean21 = python2Target19.wantsBaseListener();
        boolean boolean22 = python2Target19.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target19.getTemplates();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.wantsBaseListener();
        boolean boolean29 = python2Target26.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python2Target26.getTokenTypesAsTargetLabels(grammar30, intArray31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python2Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "hi!", true);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target39 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator38);
        boolean boolean40 = python2Target39.supportsOverloadedMethods();
        boolean boolean41 = python2Target39.wantsBaseListener();
        boolean boolean42 = python2Target39.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python2Target39.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python2Target26.getTokenTypesAsTargetLabels(grammar37, intArray44);
        java.lang.String[] strArray47 = python2Target19.getTokenTypesAsTargetLabels(grammar24, intArray44);
        java.lang.String[] strArray48 = python2Target7.getTokenTypesAsTargetLabels(grammar17, intArray44);
        java.lang.String[] strArray49 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray44);
        boolean boolean50 = python2Target1.wantsBaseVisitor();
        java.lang.String str53 = python2Target1.getTargetStringLiteralFromString("\"\\\".5.2.\\\"\\\"Contex\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d" + "'", str13, "d");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"i\"" + "'", str36, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\\"\\\\\\\".5.2.\\\\\\\"\\\\\\\"Contex\\\"" + "'", str53, "\\\"\\\\\\\".5.2.\\\\\\\"\\\\\\\"Contex\\\"");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getListLabel("_\\64");
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\64" + "'", str8, "_\\64");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape(64);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetConte");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsetConte\"" + "'", str9, "\"_tsetConte\"");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getListLabel("Python2");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"_tset_tset_hi!\"");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_4.5.2.1ContextContext");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"_tset_tset_hi!\\\"\"" + "'", str8, "\"\\\"_tset_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__4.5.2.1ContextContext" + "'", str10, "__4.5.2.1ContextContext");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("\"_tset_tset_hi!\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"_tset_tset_hi!\"" + "'", str10, "_\"_tset_tset_hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target1.getCodeGenerator();
        java.lang.String str23 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"Context");
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"_tset\\\\\\\"@\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tset0" + "'", str20, "tset0");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"_tset_hi!\\\"Context\"" + "'", str23, "\"\\\"_tset_hi!\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"_tset\\\\\\\"_tset\\\\\\\\\\\\\\\"@\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str25, "\"\\\"_tset\\\\\\\"_tset\\\\\\\\\\\\\\\"@\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_ython", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ytho" + "'", str12, "ytho");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("__tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_4.5.2.1ContextContext", false);
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.wantsBaseListener();
        boolean boolean12 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "___tset" + "'", str5, "___tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1ContextContex" + "'", str9, "4.5.2.1ContextContex");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset_tsetPython2", true);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_\\\"\\\\\\\".5.2.\\\\\\\"\\\"Context");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("_tset_tset_tset_tset0Contex");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset_tsetPython2\"" + "'", str7, "\"__tset_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_\\\"\\\\\\\".5.2.\\\\\\\"\\\"Context" + "'", str9, "_tset_\\\"\\\\\\\".5.2.\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__tset_tset_tset_tset0Contex" + "'", str11, "__tset_tset_tset_tset0Contex");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\\\"@\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset\"\\\"ython\\\"\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\\\\"@\\\\\\\"\"" + "'", str11, "\"\\\\\\\"@\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset\\\"\\\"ython\\\"\"" + "'", str15, "\"tset\\\"\\\"ython\\\"\"");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\"_tset_hi!\"");
        java.lang.String str13 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet14 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str10, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_hi!\"Context" + "'", str12, "\"_tset_hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset_hi!");
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1ContextContexContext");
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_#");
        boolean boolean15 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_hi!" + "'", str10, "__tset_hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset4.5.2.1ContextContexContext\"" + "'", str12, "\"_tset_tset4.5.2.1ContextContexContext\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_#" + "'", str14, "_tset_#");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Context" + "'", str10, "Hi!Context");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        java.lang.String str10 = python2Target1.getListLabel("\"_tset\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.getImplicitSetLabel("\"_\\\"\\\\\\\\0Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"" + "'", str10, "\"_tset\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"i\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset\"_\\\"\\\\\\\\0Context\\\"\"" + "'", str13, "_tset\"_\\\"\\\\\\\\0Context\\\"\"");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str12, "_\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\\nContext\"Context" + "'", str14, "\"\\\\nContext\"Context");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\\64");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("___tse");
        java.lang.String str14 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\\64" + "'", str11, "_\\64");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "___tseContext" + "'", str13, "___tseContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("_tset_tsetPython2");
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\\"\\\\\\\"i\\\\\\\"\\\"");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tsetPython2Context" + "'", str10, "_tset_tsetPython2Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\"\\\\\\\"i\\\\\\\"\\\"" + "'", str12, "_tset\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsethi!\"" + "'", str7, "\"_tsethi!\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        boolean boolean25 = python2Target24.supportsOverloadedMethods();
        boolean boolean26 = python2Target24.wantsBaseListener();
        boolean boolean27 = python2Target24.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target24.getTemplates();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        boolean boolean32 = python2Target31.supportsOverloadedMethods();
        boolean boolean33 = python2Target31.wantsBaseListener();
        boolean boolean34 = python2Target31.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar35 = null;
        int[] intArray36 = new int[] {};
        java.lang.String[] strArray37 = python2Target31.getTokenTypesAsTargetLabels(grammar35, intArray36);
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python2Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "hi!", true);
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        boolean boolean45 = python2Target44.supportsOverloadedMethods();
        boolean boolean46 = python2Target44.wantsBaseListener();
        boolean boolean47 = python2Target44.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python2Target44.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python2Target31.getTokenTypesAsTargetLabels(grammar42, intArray49);
        java.lang.String[] strArray52 = python2Target24.getTokenTypesAsTargetLabels(grammar29, intArray49);
        java.lang.String[] strArray53 = python2Target1.getTokenTypesAsTargetLabels(grammar22, intArray49);
        java.util.Set<java.lang.String> strSet54 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tset0" + "'", str20, "tset0");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"i\"" + "'", str41, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strSet54);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("_\\\"\\\\\\\".5.2.\\\\\\\"\\\"");
        int int14 = python2Target1.getInlineTestSetWordSize();
        boolean boolean15 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        boolean boolean19 = python2Target18.supportsOverloadedMethods();
        boolean boolean20 = python2Target18.templatesExist();
        java.util.Set<java.lang.String> strSet21 = python2Target18.getBadWords();
        java.lang.String str24 = python2Target18.getTargetStringLiteralFromString("", false);
        boolean boolean25 = python2Target18.templatesExist();
        java.lang.String str26 = python2Target18.getLanguage();
        java.lang.String str27 = python2Target18.getLanguage();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        java.lang.String str33 = python2Target30.getTargetStringLiteralFromString("", false);
        boolean boolean34 = python2Target30.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet35 = python2Target30.getBadWords();
        java.lang.String str36 = python2Target30.getVersion();
        int int37 = python2Target30.getInlineTestSetWordSize();
        java.lang.String str39 = python2Target30.getListLabel("Python2");
        java.lang.String str40 = python2Target30.getVersion();
        org.stringtemplate.v4.STGroup sTGroup41 = python2Target30.getTemplates();
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target44 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator43);
        boolean boolean45 = python2Target44.supportsOverloadedMethods();
        boolean boolean46 = python2Target44.wantsBaseListener();
        boolean boolean47 = python2Target44.wantsBaseVisitor();
        java.lang.String str49 = python2Target44.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str51 = python2Target44.getListLabel("_tset_hi!");
        java.lang.String str53 = python2Target44.getListLabel("");
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target56 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator55);
        boolean boolean57 = python2Target56.supportsOverloadedMethods();
        boolean boolean58 = python2Target56.wantsBaseListener();
        boolean boolean59 = python2Target56.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar60 = null;
        int[] intArray61 = new int[] {};
        java.lang.String[] strArray62 = python2Target56.getTokenTypesAsTargetLabels(grammar60, intArray61);
        java.lang.String[] strArray63 = python2Target44.getTokenTypesAsTargetLabels(grammar54, intArray61);
        java.lang.String[] strArray64 = python2Target30.getTokenTypesAsTargetLabels(grammar42, intArray61);
        java.lang.String[] strArray65 = python2Target18.getTokenTypesAsTargetLabels(grammar28, intArray61);
        java.lang.String[] strArray66 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"\\\\\\\".5.2.\\\\\\\"\\\"Context" + "'", str13, "_\\\"\\\\\\\".5.2.\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Python2" + "'", str39, "Python2");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "_4.5.2.1" + "'", str49, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "_tset_hi!" + "'", str51, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\"@Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\"@Context\"" + "'", str6, "_tset\"@Context\"");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getElementName("\\\"tset\\\\\\\"\\\\\\\"ython\\\\\\\"\\\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "@", false);
        java.lang.String str13 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getVersion();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset_tset__\"__tset\"");
        java.lang.String str14 = python2Target1.getListLabel("____tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset__\"__tset\"Context" + "'", str12, "_tset_tset__\"__tset\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "____tset_tset\\0Context" + "'", str14, "____tset_tset\\0Context");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("tset_tset0Contex");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsettset_tset0Contex" + "'", str9, "_tsettset_tset0Contex");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        boolean boolean9 = python2Target8.supportsOverloadedMethods();
        boolean boolean10 = python2Target8.wantsBaseListener();
        boolean boolean11 = python2Target8.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python2Target8.getTokenTypesAsTargetLabels(grammar12, intArray13);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "hi!", true);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.supportsOverloadedMethods();
        boolean boolean23 = python2Target21.wantsBaseListener();
        boolean boolean24 = python2Target21.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python2Target21.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python2Target8.getTokenTypesAsTargetLabels(grammar19, intArray26);
        java.lang.String[] strArray29 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"i\"" + "'", str18, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"__tset_hi!\"", false);
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\\\"__tset_hi!\\\"");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        boolean boolean17 = python2Target16.supportsOverloadedMethods();
        boolean boolean18 = python2Target16.wantsBaseListener();
        java.lang.String str20 = python2Target16.getTargetStringLiteralFromString("hi!");
        java.lang.String str21 = python2Target16.getLanguage();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        boolean boolean25 = python2Target24.supportsOverloadedMethods();
        boolean boolean26 = python2Target24.wantsBaseListener();
        boolean boolean27 = python2Target24.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar28 = null;
        int[] intArray29 = new int[] {};
        java.lang.String[] strArray30 = python2Target24.getTokenTypesAsTargetLabels(grammar28, intArray29);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "hi!", true);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        boolean boolean38 = python2Target37.supportsOverloadedMethods();
        boolean boolean39 = python2Target37.wantsBaseListener();
        boolean boolean40 = python2Target37.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar41 = null;
        int[] intArray42 = new int[] {};
        java.lang.String[] strArray43 = python2Target37.getTokenTypesAsTargetLabels(grammar41, intArray42);
        java.lang.String[] strArray44 = python2Target24.getTokenTypesAsTargetLabels(grammar35, intArray42);
        java.lang.String[] strArray45 = python2Target16.getTokenTypesAsTargetLabels(grammar22, intArray42);
        java.lang.String[] strArray46 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray42);
        java.lang.String str48 = python2Target1.getAltLabelContextStructName("_tset\"_tsetContext\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"__tset_hi!\\\"" + "'", str11, "\\\"__tset_hi!\\\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"__tset_hi!\\\"" + "'", str13, "_\\\"__tset_hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python2" + "'", str21, "Python2");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"i\"" + "'", str34, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "_tset\"_tsetContext\"Context" + "'", str48, "_tset\"_tsetContext\"Context");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("\"4.5.2.1ContextContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        java.lang.String str18 = python2Target14.getTargetStringLiteralFromString("hi!");
        java.lang.String str19 = python2Target14.getLanguage();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        boolean boolean23 = python2Target22.supportsOverloadedMethods();
        boolean boolean24 = python2Target22.wantsBaseListener();
        boolean boolean25 = python2Target22.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target22.getTokenTypesAsTargetLabels(grammar26, intArray27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python2Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "hi!", true);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        boolean boolean36 = python2Target35.supportsOverloadedMethods();
        boolean boolean37 = python2Target35.wantsBaseListener();
        boolean boolean38 = python2Target35.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python2Target35.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python2Target22.getTokenTypesAsTargetLabels(grammar33, intArray40);
        java.lang.String[] strArray43 = python2Target14.getTokenTypesAsTargetLabels(grammar20, intArray40);
        java.lang.String[] strArray44 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray40);
        java.lang.String str46 = python2Target1.getAltLabelContextStructName("_\"\\\"hi!\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"hi!\"" + "'", str18, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python2" + "'", str19, "Python2");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"i\"" + "'", str32, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_\"\\\"hi!\\\"Context\"Context" + "'", str46, "_\"\\\"hi!\\\"Context\"Context");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target10 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator9);
        boolean boolean11 = python2Target10.supportsOverloadedMethods();
        boolean boolean12 = python2Target10.wantsBaseListener();
        boolean boolean13 = python2Target10.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target10.getTemplates();
        boolean boolean15 = python2Target10.templatesExist();
        java.lang.String str18 = python2Target10.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str20 = python2Target10.getAltLabelContextStructName("@");
        java.lang.String str22 = python2Target10.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup23 = python2Target10.getTemplates();
        java.util.Set<java.lang.String> strSet24 = python2Target10.getBadWords();
        boolean boolean25 = python2Target10.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python2Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python2Target10.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        boolean boolean34 = python2Target33.supportsOverloadedMethods();
        boolean boolean35 = python2Target33.wantsBaseListener();
        boolean boolean36 = python2Target33.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup37 = python2Target33.getTemplates();
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        boolean boolean41 = python2Target40.supportsOverloadedMethods();
        boolean boolean42 = python2Target40.wantsBaseListener();
        boolean boolean43 = python2Target40.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python2Target40.getTokenTypesAsTargetLabels(grammar44, intArray45);
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        java.lang.String str50 = python2Target40.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator47, "hi!", true);
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        boolean boolean54 = python2Target53.supportsOverloadedMethods();
        boolean boolean55 = python2Target53.wantsBaseListener();
        boolean boolean56 = python2Target53.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar57 = null;
        int[] intArray58 = new int[] {};
        java.lang.String[] strArray59 = python2Target53.getTokenTypesAsTargetLabels(grammar57, intArray58);
        java.lang.String[] strArray60 = python2Target40.getTokenTypesAsTargetLabels(grammar51, intArray58);
        java.lang.String[] strArray61 = python2Target33.getTokenTypesAsTargetLabels(grammar38, intArray58);
        java.lang.String[] strArray62 = python2Target10.getTokenTypesAsTargetLabels(grammar31, intArray58);
        java.lang.String[] strArray63 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray58);
        int int64 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str18, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "@Context" + "'", str20, "@Context");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tset_tset\\0Context" + "'", str22, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "tset0" + "'", str29, "tset0");
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"i\"" + "'", str50, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 64 + "'", int64 == 64);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        int int14 = python2Target1.getInlineTestSetWordSize();
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tsetContext", true);
        boolean boolean15 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        boolean boolean18 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetContext\"" + "'", str14, "\"_tsetContext\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "__tset4.5.2.1" + "'", str17, "__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("_\"_tset\\\"@\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__\"_tset\\\"@\\\"Context\"" + "'", str16, "__\"_tset\\\"@\\\"Context\"");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet24 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python2Target1.getCodeGenerator();
        java.lang.String str27 = python2Target1.getTargetStringLiteralFromString("\\0Context");
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        boolean boolean32 = python2Target31.supportsOverloadedMethods();
        boolean boolean33 = python2Target31.wantsBaseListener();
        boolean boolean34 = python2Target31.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup35 = python2Target31.getTemplates();
        boolean boolean36 = python2Target31.templatesExist();
        boolean boolean37 = python2Target31.wantsBaseVisitor();
        java.lang.String str40 = python2Target31.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str41 = python2Target31.getLanguage();
        java.lang.String str43 = python2Target31.getTargetStringLiteralFromString("tset_tset0Contex");
        boolean boolean44 = python2Target31.wantsBaseListener();
        boolean boolean45 = python2Target31.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target48 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator47);
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = python2Target48.getCodeGenerator();
        boolean boolean50 = python2Target48.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        java.lang.String str54 = python2Target48.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator51, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = python2Target48.getCodeGenerator();
        java.util.Set<java.lang.String> strSet56 = python2Target48.getBadWords();
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target59 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator58);
        boolean boolean60 = python2Target59.supportsOverloadedMethods();
        boolean boolean61 = python2Target59.wantsBaseListener();
        boolean boolean62 = python2Target59.wantsBaseVisitor();
        boolean boolean63 = python2Target59.supportsOverloadedMethods();
        java.lang.String str65 = python2Target59.encodeIntAsCharEscape((int) (short) 100);
        int int66 = python2Target59.getInlineTestSetWordSize();
        java.lang.String str67 = python2Target59.getLanguage();
        int int68 = python2Target59.getInlineTestSetWordSize();
        java.lang.String str70 = python2Target59.getImplicitSetLabel("_tset\\0Context");
        boolean boolean71 = python2Target59.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar72 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator73 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target74 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator73);
        boolean boolean75 = python2Target74.supportsOverloadedMethods();
        boolean boolean76 = python2Target74.wantsBaseListener();
        boolean boolean77 = python2Target74.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar78 = null;
        int[] intArray79 = new int[] {};
        java.lang.String[] strArray80 = python2Target74.getTokenTypesAsTargetLabels(grammar78, intArray79);
        java.lang.String[] strArray81 = python2Target59.getTokenTypesAsTargetLabels(grammar72, intArray79);
        java.lang.String[] strArray82 = python2Target48.getTokenTypesAsTargetLabels(grammar57, intArray79);
        java.lang.String[] strArray83 = python2Target31.getTokenTypesAsTargetLabels(grammar46, intArray79);
        java.lang.String[] strArray84 = python2Target1.getTokenTypesAsTargetLabels(grammar29, intArray79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\\0Context\"" + "'", str27, "\"\\\\0Context\"");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str40, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Python2" + "'", str41, "Python2");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"tset_tset0Contex\"" + "'", str43, "\"tset_tset0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(codeGenerator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"_tsethi!\"" + "'", str54, "\"_tsethi!\"");
        org.junit.Assert.assertNull(codeGenerator55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "d" + "'", str65, "d");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 64 + "'", int66 == 64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Python2" + "'", str67, "Python2");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 64 + "'", int68 == 64);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "_tset_tset\\0Context" + "'", str70, "_tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\"_tset_hi!\"Context");
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"_tset_hi!\"Context" + "'", str8, "_tset\"_tset_hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"i\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"____tset\"", true);
        boolean boolean10 = python2Target1.templatesExist();
        boolean boolean11 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tset#", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"i\"Context" + "'", str5, "\"i\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"____tset\\\"\"" + "'", str9, "\"\\\"____tset\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset#" + "'", str14, "_tset#");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        boolean boolean10 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        boolean boolean14 = python2Target13.supportsOverloadedMethods();
        boolean boolean15 = python2Target13.wantsBaseListener();
        boolean boolean16 = python2Target13.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray18 = new int[] {};
        java.lang.String[] strArray19 = python2Target13.getTokenTypesAsTargetLabels(grammar17, intArray18);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python2Target13.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "hi!", true);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.wantsBaseListener();
        boolean boolean29 = python2Target26.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python2Target26.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python2Target13.getTokenTypesAsTargetLabels(grammar24, intArray31);
        java.lang.String[] strArray34 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray31);
        java.util.Set<java.lang.String> strSet35 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target1.getImplicitTokenLabel("\"ython\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"i\"" + "'", str23, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("_hi!");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        boolean boolean18 = python2Target14.supportsOverloadedMethods();
        java.lang.String str20 = python2Target14.encodeIntAsCharEscape((int) (short) 100);
        int int21 = python2Target14.getInlineTestSetWordSize();
        java.lang.String str23 = python2Target14.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.wantsBaseListener();
        boolean boolean29 = python2Target26.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target26.getTemplates();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        boolean boolean34 = python2Target33.supportsOverloadedMethods();
        boolean boolean35 = python2Target33.wantsBaseListener();
        boolean boolean36 = python2Target33.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python2Target33.getTokenTypesAsTargetLabels(grammar37, intArray38);
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "hi!", true);
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        boolean boolean47 = python2Target46.supportsOverloadedMethods();
        boolean boolean48 = python2Target46.wantsBaseListener();
        boolean boolean49 = python2Target46.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar50 = null;
        int[] intArray51 = new int[] {};
        java.lang.String[] strArray52 = python2Target46.getTokenTypesAsTargetLabels(grammar50, intArray51);
        java.lang.String[] strArray53 = python2Target33.getTokenTypesAsTargetLabels(grammar44, intArray51);
        java.lang.String[] strArray54 = python2Target26.getTokenTypesAsTargetLabels(grammar31, intArray51);
        java.lang.String[] strArray55 = python2Target14.getTokenTypesAsTargetLabels(grammar24, intArray51);
        java.lang.String[] strArray56 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray51);
        boolean boolean57 = python2Target1.templatesExist();
        java.lang.String str58 = python2Target1.getVersion();
        boolean boolean59 = python2Target1.templatesExist();
        java.lang.String str61 = python2Target1.getListLabel("_tset___tsetContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\n" + "'", str23, "\\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"i\"" + "'", str43, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "_tset___tsetContext" + "'", str61, "_tset___tsetContext");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
        int int15 = python2Target1.getInlineTestSetWordSize();
        boolean boolean16 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_4.5.2.1Context" + "'", str11, "_4.5.2.1Context");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.String str11 = python2Target1.getListLabel("_\\\" \\\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\\\" \\\"" + "'", str11, "_\\\" \\\"");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String str10 = python2Target8.getAltLabelContextStructName("\\0");
        boolean boolean11 = python2Target8.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target8.getCodeGenerator();
        java.lang.String str13 = python2Target8.getLanguage();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        java.lang.String str19 = python2Target16.getTargetStringLiteralFromString("", false);
        boolean boolean20 = python2Target16.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target23.getCodeGenerator();
        int int25 = python2Target23.getSerializedATNSegmentLimit();
        java.lang.String str26 = python2Target23.getLanguage();
        java.lang.String str28 = python2Target23.getTargetStringLiteralFromString("_tsetPython2");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        java.lang.String str33 = python2Target31.getAltLabelContextStructName("\\0");
        boolean boolean34 = python2Target31.wantsBaseListener();
        java.lang.String str36 = python2Target31.getImplicitRuleLabel("___tset");
        java.lang.String str38 = python2Target31.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet39 = python2Target31.getBadWords();
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        boolean boolean43 = python2Target42.supportsOverloadedMethods();
        boolean boolean44 = python2Target42.wantsBaseListener();
        boolean boolean45 = python2Target42.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup46 = python2Target42.getTemplates();
        boolean boolean47 = python2Target42.templatesExist();
        java.lang.String str49 = python2Target42.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python2Target42.getCodeGenerator();
        boolean boolean51 = python2Target42.templatesExist();
        org.antlr.v4.tool.Grammar grammar52 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target54 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator53);
        boolean boolean55 = python2Target54.supportsOverloadedMethods();
        boolean boolean56 = python2Target54.wantsBaseListener();
        boolean boolean57 = python2Target54.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python2Target54.getTokenTypesAsTargetLabels(grammar58, intArray59);
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        java.lang.String str64 = python2Target54.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator61, "hi!", true);
        org.antlr.v4.tool.Grammar grammar65 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator66 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target67 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator66);
        boolean boolean68 = python2Target67.supportsOverloadedMethods();
        boolean boolean69 = python2Target67.wantsBaseListener();
        boolean boolean70 = python2Target67.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar71 = null;
        int[] intArray72 = new int[] {};
        java.lang.String[] strArray73 = python2Target67.getTokenTypesAsTargetLabels(grammar71, intArray72);
        java.lang.String[] strArray74 = python2Target54.getTokenTypesAsTargetLabels(grammar65, intArray72);
        java.lang.String[] strArray75 = python2Target42.getTokenTypesAsTargetLabels(grammar52, intArray72);
        java.lang.String[] strArray76 = python2Target31.getTokenTypesAsTargetLabels(grammar40, intArray72);
        java.lang.String[] strArray77 = python2Target23.getTokenTypesAsTargetLabels(grammar29, intArray72);
        java.lang.String[] strArray78 = python2Target16.getTokenTypesAsTargetLabels(grammar21, intArray72);
        java.lang.String[] strArray79 = python2Target8.getTokenTypesAsTargetLabels(grammar14, intArray72);
        java.lang.String[] strArray80 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray72);
        java.lang.Class<?> wildcardClass81 = intArray72.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0Context" + "'", str10, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python2" + "'", str13, "Python2");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Python2" + "'", str26, "Python2");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"_tsetPython2\"" + "'", str28, "\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\0Context" + "'", str33, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "____tset" + "'", str36, "____tset");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"@\"" + "'", str38, "\"@\"");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(sTGroup46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"_tsetContext\"" + "'", str49, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"i\"" + "'", str64, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[]");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        java.lang.String str25 = python2Target1.getAltLabelContextStructName("\\1Context");
        boolean boolean26 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\1ContextContext" + "'", str25, "\\1ContextContext");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.wantsBaseListener();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("__tsetContex", true);
        java.lang.String str21 = python2Target1.encodeIntAsCharEscape(1);
        boolean boolean22 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"__tsetContex\"" + "'", str19, "\"__tsetContex\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\1" + "'", str21, "\\1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"i\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"____tset\"", true);
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"i\"Context" + "'", str5, "\"i\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"____tset\\\"\"" + "'", str9, "\"\\\"____tset\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\"__tset_tsetPython2\"", false);
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str13 = python2Target11.getAltLabelContextStructName("\\0");
        boolean boolean14 = python2Target11.wantsBaseListener();
        java.lang.String str16 = python2Target11.getImplicitRuleLabel("___tset");
        java.lang.String str18 = python2Target11.getTargetStringLiteralFromString("@");
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target11.getTemplates();
        int int20 = python2Target11.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target23 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator22);
        boolean boolean24 = python2Target23.supportsOverloadedMethods();
        boolean boolean25 = python2Target23.wantsBaseListener();
        boolean boolean26 = python2Target23.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup27 = python2Target23.getTemplates();
        boolean boolean28 = python2Target23.templatesExist();
        boolean boolean29 = python2Target23.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        boolean boolean33 = python2Target32.supportsOverloadedMethods();
        boolean boolean34 = python2Target32.wantsBaseListener();
        boolean boolean35 = python2Target32.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup36 = python2Target32.getTemplates();
        boolean boolean37 = python2Target32.templatesExist();
        java.lang.String str40 = python2Target32.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str42 = python2Target32.getAltLabelContextStructName("@");
        java.lang.String str44 = python2Target32.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup45 = python2Target32.getTemplates();
        java.util.Set<java.lang.String> strSet46 = python2Target32.getBadWords();
        boolean boolean47 = python2Target32.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        java.lang.String str51 = python2Target32.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator48, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python2Target32.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        boolean boolean56 = python2Target55.supportsOverloadedMethods();
        boolean boolean57 = python2Target55.wantsBaseListener();
        boolean boolean58 = python2Target55.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup59 = python2Target55.getTemplates();
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target62 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator61);
        boolean boolean63 = python2Target62.supportsOverloadedMethods();
        boolean boolean64 = python2Target62.wantsBaseListener();
        boolean boolean65 = python2Target62.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python2Target62.getTokenTypesAsTargetLabels(grammar66, intArray67);
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        java.lang.String str72 = python2Target62.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator69, "hi!", true);
        org.antlr.v4.tool.Grammar grammar73 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator74 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target75 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator74);
        boolean boolean76 = python2Target75.supportsOverloadedMethods();
        boolean boolean77 = python2Target75.wantsBaseListener();
        boolean boolean78 = python2Target75.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar79 = null;
        int[] intArray80 = new int[] {};
        java.lang.String[] strArray81 = python2Target75.getTokenTypesAsTargetLabels(grammar79, intArray80);
        java.lang.String[] strArray82 = python2Target62.getTokenTypesAsTargetLabels(grammar73, intArray80);
        java.lang.String[] strArray83 = python2Target55.getTokenTypesAsTargetLabels(grammar60, intArray80);
        java.lang.String[] strArray84 = python2Target32.getTokenTypesAsTargetLabels(grammar53, intArray80);
        java.lang.String[] strArray85 = python2Target23.getTokenTypesAsTargetLabels(grammar30, intArray80);
        java.lang.String[] strArray86 = python2Target11.getTokenTypesAsTargetLabels(grammar21, intArray80);
        java.lang.String[] strArray87 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\"__tset_tsetPython2\\\"" + "'", str6, "\\\"__tset_tsetPython2\\\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0Context" + "'", str13, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "____tset" + "'", str16, "____tset");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"@\"" + "'", str18, "\"@\"");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str40, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "@Context" + "'", str42, "@Context");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "__tset_tset\\0Context" + "'", str44, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "tset0" + "'", str51, "tset0");
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(sTGroup59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"i\"" + "'", str72, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        boolean boolean15 = python2Target1.templatesExist();
        java.lang.String str17 = python2Target1.getImplicitSetLabel("___\"\\\"____tset\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("\"\\\\\\\"_tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset___\"\\\"____tset\\\"\"" + "'", str17, "_tset___\"\\\"____tset\\\"\"");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"Python2\\\\\\\"\\\"\"", true);
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python2\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str14, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python2\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\"_tsetPython2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"Context" + "'", str12, "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"Context");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\0Context");
        boolean boolean13 = python2Target1.templatesExist();
        boolean boolean14 = python2Target1.templatesExist();
        java.lang.String str16 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("_tset_tset\"_tsetContext\"", false);
        java.util.Set<java.lang.String> strSet20 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_" + "'", str16, "_");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset\\\"_tsetContext\\\"" + "'", str19, "_tset_tset\\\"_tsetContext\\\"");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        int int10 = python2Target1.getInlineTestSetWordSize();
        boolean boolean11 = python2Target1.templatesExist();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.supportsOverloadedMethods();
        boolean boolean17 = python2Target15.wantsBaseListener();
        boolean boolean18 = python2Target15.wantsBaseVisitor();
        boolean boolean19 = python2Target15.supportsOverloadedMethods();
        java.lang.String str21 = python2Target15.encodeIntAsCharEscape((int) (short) 100);
        int int22 = python2Target15.getInlineTestSetWordSize();
        java.lang.String str23 = python2Target15.getLanguage();
        int int24 = python2Target15.getInlineTestSetWordSize();
        java.lang.String str26 = python2Target15.getImplicitSetLabel("_tset\\0Context");
        boolean boolean27 = python2Target15.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target30 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator29);
        boolean boolean31 = python2Target30.supportsOverloadedMethods();
        boolean boolean32 = python2Target30.wantsBaseListener();
        boolean boolean33 = python2Target30.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python2Target30.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python2Target15.getTokenTypesAsTargetLabels(grammar28, intArray35);
        java.lang.String[] strArray38 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray35);
        int int39 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str41 = python2Target1.getImplicitRuleLabel("___tset_tset\\0Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = python2Target1.getElementListName("___tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset_tset\\0Context" + "'", str26, "_tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "____tset_tset\\0Context" + "'", str41, "____tset_tset\\0Context");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\\\"@\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_tset_hi!", false);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\\\"@\\\"" + "'", str6, "_tset\\\"@\\\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tset_tset_hi" + "'", str10, "tset_tset_hi");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("____tset");
        int int14 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"____tset\"" + "'", str13, "\"____tset\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        java.lang.String str11 = python2Target1.getListLabel("\\1");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\n" + "'", str13, "\\n");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getLanguage();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("__tset\"4.5.2.1\"");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("@");
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset\"4.5.2.1\"Context" + "'", str12, "__tset\"4.5.2.1\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"@\"" + "'", str14, "\"@\"");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        boolean boolean8 = python2Target1.wantsBaseListener();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getListLabel("hi!");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_\"__tset_hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getLanguage();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getListLabel("_tset\\\"@\\\"Context");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"i\"");
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\\"@\\\"Context" + "'", str8, "_tset\\\"@\\\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"i\"Context" + "'", str10, "\"i\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getListLabel("\"_tsethi!\"Context");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target13 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator12);
        boolean boolean14 = python2Target13.supportsOverloadedMethods();
        boolean boolean15 = python2Target13.wantsBaseListener();
        boolean boolean16 = python2Target13.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target13.getTemplates();
        boolean boolean18 = python2Target13.templatesExist();
        java.lang.String str20 = python2Target13.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python2Target13.getCodeGenerator();
        boolean boolean22 = python2Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target25 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator24);
        boolean boolean26 = python2Target25.supportsOverloadedMethods();
        boolean boolean27 = python2Target25.wantsBaseListener();
        boolean boolean28 = python2Target25.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python2Target25.getTokenTypesAsTargetLabels(grammar29, intArray30);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        java.lang.String str35 = python2Target25.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator32, "hi!", true);
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        boolean boolean39 = python2Target38.supportsOverloadedMethods();
        boolean boolean40 = python2Target38.wantsBaseListener();
        boolean boolean41 = python2Target38.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python2Target38.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python2Target25.getTokenTypesAsTargetLabels(grammar36, intArray43);
        java.lang.String[] strArray46 = python2Target13.getTokenTypesAsTargetLabels(grammar23, intArray43);
        java.lang.String[] strArray47 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray43);
        int int48 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsethi!\"Context" + "'", str10, "\"_tsethi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_tsetContext\"" + "'", str20, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"i\"" + "'", str35, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        boolean boolean13 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.getListLabel("_tset_hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_hi!" + "'", str8, "_tset_hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target8 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator7);
        java.lang.String str11 = python2Target8.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target8.getTemplates();
        java.lang.String str14 = python2Target8.getImplicitSetLabel("hi!");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        boolean boolean18 = python2Target17.supportsOverloadedMethods();
        boolean boolean19 = python2Target17.wantsBaseListener();
        boolean boolean20 = python2Target17.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup21 = python2Target17.getTemplates();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        boolean boolean25 = python2Target24.supportsOverloadedMethods();
        boolean boolean26 = python2Target24.wantsBaseListener();
        boolean boolean27 = python2Target24.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar28 = null;
        int[] intArray29 = new int[] {};
        java.lang.String[] strArray30 = python2Target24.getTokenTypesAsTargetLabels(grammar28, intArray29);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        java.lang.String str34 = python2Target24.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator31, "hi!", true);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target37 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator36);
        boolean boolean38 = python2Target37.supportsOverloadedMethods();
        boolean boolean39 = python2Target37.wantsBaseListener();
        boolean boolean40 = python2Target37.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar41 = null;
        int[] intArray42 = new int[] {};
        java.lang.String[] strArray43 = python2Target37.getTokenTypesAsTargetLabels(grammar41, intArray42);
        java.lang.String[] strArray44 = python2Target24.getTokenTypesAsTargetLabels(grammar35, intArray42);
        java.lang.String[] strArray45 = python2Target17.getTokenTypesAsTargetLabels(grammar22, intArray42);
        java.lang.String[] strArray46 = python2Target8.getTokenTypesAsTargetLabels(grammar15, intArray42);
        java.lang.String[] strArray47 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray42);
        java.lang.String str48 = python2Target1.getLanguage();
        int int49 = python2Target1.getInlineTestSetWordSize();
        boolean boolean50 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tsethi!" + "'", str14, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"i\"" + "'", str34, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Python2" + "'", str48, "Python2");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 0);
        java.lang.String str6 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"_tsethi!\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsethi!\"Context" + "'", str7, "\"_tsethi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        int int24 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str26 = python2Target1.getListLabel("\"_Tset_tset_hiContext\"");
        java.lang.String str27 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"_Tset_tset_hiContext\"" + "'", str26, "\"_Tset_tset_hiContext\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\0Context");
        boolean boolean13 = python2Target1.wantsBaseListener();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\n" + "'", str15, "\\n");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_tset\"_tsetContext\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\\\"_tsetContext\\\"\"" + "'", str13, "\"_tset\\\"_tsetContext\\\"\"");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("_4.5.2.1Context");
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("__\"_tset_hi!\"");
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_4.5.2.1ContextContext" + "'", str9, "_4.5.2.1ContextContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__\"_tset_hi!\"Context" + "'", str11, "__\"_tset_hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\0Context");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str14 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"_tset\\\"@\\\"Context\"");
        int int12 = python2Target1.getInlineTestSetWordSize();
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"_tset\\\"@\\\"Context\"" + "'", str11, "_tset\"_tset\\\"@\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\0ContextContext");
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\\0ContextContext\"" + "'", str12, "\"\\\\0ContextContext\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"_tset\\\"@\\\"Context\"");
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"_tset\\\"@\\\"Context\"" + "'", str11, "_tset\"_tset\\\"@\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("__\"__tset\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\"Python2\"Context");
        java.lang.String str14 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset__\"__tset\"" + "'", str11, "_tset__\"__tset\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python2\"ContextContext" + "'", str13, "\"Python2\"ContextContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        boolean boolean14 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context", true);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.supportsOverloadedMethods();
        boolean boolean14 = python2Target12.wantsBaseListener();
        boolean boolean15 = python2Target12.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target12.getTemplates();
        boolean boolean17 = python2Target12.templatesExist();
        java.lang.String str20 = python2Target12.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str22 = python2Target12.getAltLabelContextStructName("@");
        java.lang.String str24 = python2Target12.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target12.getTemplates();
        java.util.Set<java.lang.String> strSet26 = python2Target12.getBadWords();
        boolean boolean27 = python2Target12.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python2Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target12.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target35 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator34);
        boolean boolean36 = python2Target35.supportsOverloadedMethods();
        boolean boolean37 = python2Target35.wantsBaseListener();
        boolean boolean38 = python2Target35.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup39 = python2Target35.getTemplates();
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target42 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator41);
        boolean boolean43 = python2Target42.supportsOverloadedMethods();
        boolean boolean44 = python2Target42.wantsBaseListener();
        boolean boolean45 = python2Target42.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python2Target42.getTokenTypesAsTargetLabels(grammar46, intArray47);
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python2Target42.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "hi!", true);
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        boolean boolean56 = python2Target55.supportsOverloadedMethods();
        boolean boolean57 = python2Target55.wantsBaseListener();
        boolean boolean58 = python2Target55.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar59 = null;
        int[] intArray60 = new int[] {};
        java.lang.String[] strArray61 = python2Target55.getTokenTypesAsTargetLabels(grammar59, intArray60);
        java.lang.String[] strArray62 = python2Target42.getTokenTypesAsTargetLabels(grammar53, intArray60);
        java.lang.String[] strArray63 = python2Target35.getTokenTypesAsTargetLabels(grammar40, intArray60);
        java.lang.String[] strArray64 = python2Target12.getTokenTypesAsTargetLabels(grammar33, intArray60);
        java.lang.String[] strArray65 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray60);
        org.antlr.v4.tool.ast.GrammarAST grammarAST66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = python2Target1.getLoopCounter(grammarAST66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str9, "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str20, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "@Context" + "'", str22, "@Context");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "__tset_tset\\0Context" + "'", str24, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "tset0" + "'", str31, "tset0");
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"i\"" + "'", str52, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        boolean boolean4 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"_tset_hi!\\\"\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\\0Context");
        java.lang.String str14 = python2Target1.getLanguage();
        java.lang.String str16 = python2Target1.getImplicitSetLabel("\"i\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str11, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0ContextContext" + "'", str13, "\\0ContextContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"i\"ContextContext" + "'", str16, "_tset\"i\"ContextContext");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        int int12 = python2Target1.getInlineTestSetWordSize();
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("4.5.2.1ContextContex");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"4.5.2.1ContextContex\"" + "'", str9, "\"4.5.2.1ContextContex\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("__hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "___hi!" + "'", str9, "___hi!");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context", false);
        java.util.Set<java.lang.String> strSet27 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\\\"Contex" + "'", str26, "_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\\\"Contex");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target15.getCodeGenerator();
        int int17 = python2Target15.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target15.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target15.getTemplates();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        java.lang.String str25 = python2Target22.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup26 = python2Target22.getTemplates();
        java.lang.String str28 = python2Target22.getImplicitSetLabel("hi!");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target31 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator30);
        boolean boolean32 = python2Target31.supportsOverloadedMethods();
        boolean boolean33 = python2Target31.wantsBaseListener();
        boolean boolean34 = python2Target31.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup35 = python2Target31.getTemplates();
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        boolean boolean39 = python2Target38.supportsOverloadedMethods();
        boolean boolean40 = python2Target38.wantsBaseListener();
        boolean boolean41 = python2Target38.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python2Target38.getTokenTypesAsTargetLabels(grammar42, intArray43);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        java.lang.String str48 = python2Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator45, "hi!", true);
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        boolean boolean52 = python2Target51.supportsOverloadedMethods();
        boolean boolean53 = python2Target51.wantsBaseListener();
        boolean boolean54 = python2Target51.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar55 = null;
        int[] intArray56 = new int[] {};
        java.lang.String[] strArray57 = python2Target51.getTokenTypesAsTargetLabels(grammar55, intArray56);
        java.lang.String[] strArray58 = python2Target38.getTokenTypesAsTargetLabels(grammar49, intArray56);
        java.lang.String[] strArray59 = python2Target31.getTokenTypesAsTargetLabels(grammar36, intArray56);
        java.lang.String[] strArray60 = python2Target22.getTokenTypesAsTargetLabels(grammar29, intArray56);
        java.lang.String[] strArray61 = python2Target15.getTokenTypesAsTargetLabels(grammar20, intArray56);
        java.lang.String[] strArray62 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray56);
        boolean boolean63 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python2" + "'", str18, "Python2");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tsethi!" + "'", str28, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"i\"" + "'", str48, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getListLabel("___tsetContext");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "___tsetContext" + "'", str13, "___tsetContext");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getLanguage();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\"4.5.2.1ContextContex\\\"\"");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"4.5.2.1ContextContex\\\"\"Context" + "'", str10, "\"\\\"4.5.2.1ContextContex\\\"\"Context");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"hi!\"Context");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"_tset_hi!\"");
        boolean boolean11 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"hi!\\\"Context\"" + "'", str8, "\"\\\"hi!\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"Context" + "'", str10, "\"_tset_hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_\\\"_tset\\\\\\\"@\\\\\\\"Context\\\"\"");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_\\\" \\\"", false);
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_\\\\\\\"_tset\\\\\\\\\\\\\\\"@\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str10, "\"\\\"_\\\\\\\"_tset\\\\\\\\\\\\\\\"@\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\\\\\" \\\\\\\"" + "'", str13, "_\\\\\\\" \\\\\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"i\"");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "___d", false);
        boolean boolean12 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"i\"Context" + "'", str5, "\"i\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__" + "'", str11, "__");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tset\\0", false);
        org.antlr.v4.tool.Grammar grammar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getTokenTypeAsTargetLabel(grammar21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tset0" + "'", str20, "tset0");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.templatesExist();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(64);
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.String str14 = python2Target1.getListLabel("\\0");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        boolean boolean10 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str12 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        boolean boolean22 = python2Target1.wantsBaseVisitor();
        java.lang.String str25 = python2Target1.getTargetStringLiteralFromString("\"ython\"", true);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.supportsOverloadedMethods();
        boolean boolean30 = python2Target28.wantsBaseListener();
        boolean boolean31 = python2Target28.wantsBaseVisitor();
        java.lang.String str33 = python2Target28.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str35 = python2Target28.getListLabel("_tset_hi!");
        java.lang.String str37 = python2Target28.getListLabel("");
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target40 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator39);
        boolean boolean41 = python2Target40.supportsOverloadedMethods();
        boolean boolean42 = python2Target40.wantsBaseListener();
        boolean boolean43 = python2Target40.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar44 = null;
        int[] intArray45 = new int[] {};
        java.lang.String[] strArray46 = python2Target40.getTokenTypesAsTargetLabels(grammar44, intArray45);
        java.lang.String[] strArray47 = python2Target28.getTokenTypesAsTargetLabels(grammar38, intArray45);
        java.lang.String[] strArray48 = python2Target1.getTokenTypesAsTargetLabels(grammar26, intArray45);
        java.lang.Class<?> wildcardClass49 = intArray45.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"ython\\\"\"" + "'", str25, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_4.5.2.1" + "'", str33, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_tset_hi!" + "'", str35, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\".5.2.\"");
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str3, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\".5.2.\"Context" + "'", str6, "\".5.2.\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        int int12 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"i\"");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("Python2Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"i\"Context" + "'", str5, "\"i\"Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2ContexContext" + "'", str8, "Python2ContexContext");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str9 = python2Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.supportsOverloadedMethods();
        boolean boolean14 = python2Target12.wantsBaseListener();
        boolean boolean15 = python2Target12.wantsBaseVisitor();
        boolean boolean16 = python2Target12.supportsOverloadedMethods();
        java.lang.String str18 = python2Target12.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean19 = python2Target12.supportsOverloadedMethods();
        java.lang.String str20 = python2Target12.getVersion();
        int int21 = python2Target12.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        java.lang.String str27 = python2Target24.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup28 = python2Target24.getTemplates();
        int int29 = python2Target24.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        java.lang.String str34 = python2Target32.getAltLabelContextStructName("\\0");
        boolean boolean35 = python2Target32.wantsBaseListener();
        java.lang.String str37 = python2Target32.getImplicitRuleLabel("___tset");
        java.lang.String str39 = python2Target32.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet40 = python2Target32.getBadWords();
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target43 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator42);
        boolean boolean44 = python2Target43.supportsOverloadedMethods();
        boolean boolean45 = python2Target43.wantsBaseListener();
        boolean boolean46 = python2Target43.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup47 = python2Target43.getTemplates();
        boolean boolean48 = python2Target43.templatesExist();
        java.lang.String str50 = python2Target43.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = python2Target43.getCodeGenerator();
        boolean boolean52 = python2Target43.templatesExist();
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target55 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator54);
        boolean boolean56 = python2Target55.supportsOverloadedMethods();
        boolean boolean57 = python2Target55.wantsBaseListener();
        boolean boolean58 = python2Target55.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar59 = null;
        int[] intArray60 = new int[] {};
        java.lang.String[] strArray61 = python2Target55.getTokenTypesAsTargetLabels(grammar59, intArray60);
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        java.lang.String str65 = python2Target55.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator62, "hi!", true);
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target68 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator67);
        boolean boolean69 = python2Target68.supportsOverloadedMethods();
        boolean boolean70 = python2Target68.wantsBaseListener();
        boolean boolean71 = python2Target68.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar72 = null;
        int[] intArray73 = new int[] {};
        java.lang.String[] strArray74 = python2Target68.getTokenTypesAsTargetLabels(grammar72, intArray73);
        java.lang.String[] strArray75 = python2Target55.getTokenTypesAsTargetLabels(grammar66, intArray73);
        java.lang.String[] strArray76 = python2Target43.getTokenTypesAsTargetLabels(grammar53, intArray73);
        java.lang.String[] strArray77 = python2Target32.getTokenTypesAsTargetLabels(grammar41, intArray73);
        java.lang.String[] strArray78 = python2Target24.getTokenTypesAsTargetLabels(grammar30, intArray73);
        java.lang.String[] strArray79 = python2Target12.getTokenTypesAsTargetLabels(grammar22, intArray73);
        java.lang.String[] strArray80 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray73);
        java.lang.String str83 = python2Target1.getTargetStringLiteralFromString("\"_tset#\"", true);
        java.lang.String str85 = python2Target1.getImplicitRuleLabel("\"\\\"Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\0Context" + "'", str34, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "____tset" + "'", str37, "____tset");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"@\"" + "'", str39, "\"@\"");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(sTGroup47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"_tsetContext\"" + "'", str50, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"i\"" + "'", str65, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[]");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\"\\\"_tset#\\\"\"" + "'", str83, "\"\\\"_tset#\\\"\"");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "_\"\\\"Contex\\\"\"" + "'", str85, "_\"\\\"Contex\\\"\"");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("_hi!");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        boolean boolean18 = python2Target14.supportsOverloadedMethods();
        java.lang.String str20 = python2Target14.encodeIntAsCharEscape((int) (short) 100);
        int int21 = python2Target14.getInlineTestSetWordSize();
        java.lang.String str23 = python2Target14.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.wantsBaseListener();
        boolean boolean29 = python2Target26.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target26.getTemplates();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target33 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator32);
        boolean boolean34 = python2Target33.supportsOverloadedMethods();
        boolean boolean35 = python2Target33.wantsBaseListener();
        boolean boolean36 = python2Target33.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python2Target33.getTokenTypesAsTargetLabels(grammar37, intArray38);
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python2Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "hi!", true);
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        boolean boolean47 = python2Target46.supportsOverloadedMethods();
        boolean boolean48 = python2Target46.wantsBaseListener();
        boolean boolean49 = python2Target46.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar50 = null;
        int[] intArray51 = new int[] {};
        java.lang.String[] strArray52 = python2Target46.getTokenTypesAsTargetLabels(grammar50, intArray51);
        java.lang.String[] strArray53 = python2Target33.getTokenTypesAsTargetLabels(grammar44, intArray51);
        java.lang.String[] strArray54 = python2Target26.getTokenTypesAsTargetLabels(grammar31, intArray51);
        java.lang.String[] strArray55 = python2Target14.getTokenTypesAsTargetLabels(grammar24, intArray51);
        java.lang.String[] strArray56 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray51);
        boolean boolean57 = python2Target1.templatesExist();
        java.lang.String str58 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup59 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\n" + "'", str23, "\\n");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"i\"" + "'", str43, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup59);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str9 = python2Target1.getListLabel("_tset_hi!");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str14 = python2Target1.getListLabel("__\"\\\"____tset\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_hi!" + "'", str9, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"4.5.2.1\"" + "'", str11, "_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__\"\\\"____tset\\\"\"Context" + "'", str14, "__\"\\\"____tset\\\"\"Context");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"_tset\\\"@\\\"Context\"");
        java.lang.String str11 = python2Target1.getListLabel("_tset_tset_tset_tset\"tset0Contex\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"_tset\\\"@\\\"Context\"" + "'", str9, "_\"_tset\\\"@\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset_tset_tset\"tset0Contex\"" + "'", str11, "_tset_tset_tset_tset\"tset0Contex\"");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("_\"_tset_hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"ython2ContexContex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__\"_tset_hi!\"" + "'", str9, "__\"_tset_hi!\"");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        boolean boolean10 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"\\\\0Context\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"", true);
        java.lang.String str15 = python2Target1.getAltLabelContextStructName("___tset");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str13, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "___tsetContext" + "'", str15, "___tsetContext");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getLanguage();
        boolean boolean12 = python2Target1.wantsBaseListener();
        int int13 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str10, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.wantsBaseListener();
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromString("__tsetContex", true);
        java.lang.String str21 = python2Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"__tsetContex\"" + "'", str19, "\"__tsetContex\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\1" + "'", str21, "\\1");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("\\0Context");
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.supportsOverloadedMethods();
        boolean boolean23 = python2Target21.wantsBaseListener();
        boolean boolean24 = python2Target21.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup25 = python2Target21.getTemplates();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.supportsOverloadedMethods();
        boolean boolean30 = python2Target28.wantsBaseListener();
        boolean boolean31 = python2Target28.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar32 = null;
        int[] intArray33 = new int[] {};
        java.lang.String[] strArray34 = python2Target28.getTokenTypesAsTargetLabels(grammar32, intArray33);
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python2Target28.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "hi!", true);
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target41 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator40);
        boolean boolean42 = python2Target41.supportsOverloadedMethods();
        boolean boolean43 = python2Target41.wantsBaseListener();
        boolean boolean44 = python2Target41.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar45 = null;
        int[] intArray46 = new int[] {};
        java.lang.String[] strArray47 = python2Target41.getTokenTypesAsTargetLabels(grammar45, intArray46);
        java.lang.String[] strArray48 = python2Target28.getTokenTypesAsTargetLabels(grammar39, intArray46);
        java.lang.String[] strArray49 = python2Target21.getTokenTypesAsTargetLabels(grammar26, intArray46);
        java.lang.String[] strArray50 = python2Target1.getTokenTypesAsTargetLabels(grammar19, intArray46);
        java.lang.String str52 = python2Target1.encodeIntAsCharEscape(64);
        int int53 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"i\"" + "'", str38, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "@" + "'", str52, "@");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"_tset\\\"@\\\"Context\"");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("__tset\"4.5.2.1\"Context");
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"_tset\\\"@\\\"Context\"" + "'", str9, "_\"_tset\\\"@\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "___tset\"4.5.2.1\"Context" + "'", str11, "___tset\"4.5.2.1\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("@");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.stringtemplate.v4.STGroup sTGroup17 = python2Target1.getTemplates();
        java.lang.String str19 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str20 = python2Target1.getVersion();
        java.lang.String str22 = python2Target1.getTargetStringLiteralFromString("\"\"");
        java.lang.String str23 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@Context" + "'", str11, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset\\0Context" + "'", str13, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_" + "'", str19, "_");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"\\\"\"" + "'", str22, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python2" + "'", str23, "Python2");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        java.lang.String str26 = python2Target1.getTargetStringLiteralFromString("_\"Contex\"", false);
        java.lang.String str27 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_\\\"Contex\\\"" + "'", str26, "_\\\"Contex\\\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Python2" + "'", str27, "Python2");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"__tset\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"__tset\"" + "'", str9, "_\"__tset\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tsethi!\"" + "'", str12, "\"_tsethi!\"");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"__tsetContex\"");
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str12, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"__tsetContex\\\"\"" + "'", str14, "\"\\\"__tsetContex\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python2Target1.getImplicitSetLabel("_hi!");
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("d");
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target1.getAltLabelContextStructName("_tset\\\"@\\\"");
        boolean boolean19 = python2Target1.supportsOverloadedMethods();
        int int20 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"@\\\"Context" + "'", str18, "_tset\\\"@\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("__tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_4.5.2.1ContextContext", false);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("__\"__tset\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "___tset" + "'", str5, "___tset");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1ContextContex" + "'", str9, "4.5.2.1ContextContex");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__\\\"__tset\\\"" + "'", str12, "__\\\"__tset\\\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_tset\"@\"");
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"@\"Context" + "'", str11, "_tset\"@\"Context");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("_tset\\\"@\\\"Context");
        java.lang.String str10 = python2Target1.getLanguage();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python2Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tset\\\"@\\\"Context" + "'", str9, "__tset\\\"@\\\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        boolean boolean12 = python2Target1.templatesExist();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tset\"4.5.2.1ContextContex\"");
        java.lang.String str16 = python2Target1.getImplicitSetLabel("__hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1" + "'", str8, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Context" + "'", str10, "Hi!Context");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset\\\"4.5.2.1ContextContex\\\"\"" + "'", str14, "\"_tset\\\"4.5.2.1ContextContex\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset__hi!" + "'", str16, "_tset__hi!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape((int) '#');
        int int14 = python2Target1.getInlineTestSetWordSize();
        int int15 = python2Target1.getSerializedATNSegmentLimit();
        int int16 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target19 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator18);
        boolean boolean20 = python2Target19.supportsOverloadedMethods();
        boolean boolean21 = python2Target19.wantsBaseListener();
        boolean boolean22 = python2Target19.wantsBaseListener();
        java.lang.String str24 = python2Target19.getImplicitSetLabel("\\\"@\\\"");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.supportsOverloadedMethods();
        boolean boolean29 = python2Target27.wantsBaseListener();
        boolean boolean30 = python2Target27.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup31 = python2Target27.getTemplates();
        boolean boolean32 = python2Target27.templatesExist();
        java.lang.String str35 = python2Target27.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str37 = python2Target27.getAltLabelContextStructName("@");
        java.lang.String str39 = python2Target27.getImplicitRuleLabel("_tset_tset\\0Context");
        org.stringtemplate.v4.STGroup sTGroup40 = python2Target27.getTemplates();
        java.util.Set<java.lang.String> strSet41 = python2Target27.getBadWords();
        boolean boolean42 = python2Target27.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        java.lang.String str46 = python2Target27.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator43, "_tset\\0", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python2Target27.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target50 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator49);
        boolean boolean51 = python2Target50.supportsOverloadedMethods();
        boolean boolean52 = python2Target50.wantsBaseListener();
        boolean boolean53 = python2Target50.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup54 = python2Target50.getTemplates();
        org.antlr.v4.tool.Grammar grammar55 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target57 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator56);
        boolean boolean58 = python2Target57.supportsOverloadedMethods();
        boolean boolean59 = python2Target57.wantsBaseListener();
        boolean boolean60 = python2Target57.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python2Target57.getTokenTypesAsTargetLabels(grammar61, intArray62);
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        java.lang.String str67 = python2Target57.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator64, "hi!", true);
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target70 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator69);
        boolean boolean71 = python2Target70.supportsOverloadedMethods();
        boolean boolean72 = python2Target70.wantsBaseListener();
        boolean boolean73 = python2Target70.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar74 = null;
        int[] intArray75 = new int[] {};
        java.lang.String[] strArray76 = python2Target70.getTokenTypesAsTargetLabels(grammar74, intArray75);
        java.lang.String[] strArray77 = python2Target57.getTokenTypesAsTargetLabels(grammar68, intArray75);
        java.lang.String[] strArray78 = python2Target50.getTokenTypesAsTargetLabels(grammar55, intArray75);
        java.lang.String[] strArray79 = python2Target27.getTokenTypesAsTargetLabels(grammar48, intArray75);
        java.lang.String[] strArray80 = python2Target19.getTokenTypesAsTargetLabels(grammar25, intArray75);
        java.lang.String[] strArray81 = python2Target1.getTokenTypesAsTargetLabels(grammar17, intArray75);
        boolean boolean82 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset\\\"@\\\"" + "'", str24, "_tset\\\"@\\\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str35, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "@Context" + "'", str37, "@Context");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "__tset_tset\\0Context" + "'", str39, "__tset_tset\\0Context");
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "tset0" + "'", str46, "tset0");
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"i\"" + "'", str67, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("");
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset" + "'", str7, "_tset");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getListLabel("Python2");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset_tset0Contex");
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset_tset0Contex" + "'", str9, "_tset_tset_tset0Contex");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "hi!", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.supportsOverloadedMethods();
        boolean boolean16 = python2Target14.wantsBaseListener();
        boolean boolean17 = python2Target14.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target14.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
        java.lang.String str22 = python2Target1.getVersion();
        boolean boolean23 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet25 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getImplicitTokenLabel("\"tset\\\"_tset_hi!\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str9 = python2Target1.getListLabel("_tset_hi!");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str14 = python2Target1.getListLabel("_tset___\"\\\"____tset\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_hi!" + "'", str9, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"4.5.2.1\"" + "'", str11, "_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset___\"\\\"____tset\\\"\"" + "'", str14, "_tset___\"\\\"____tset\\\"\"");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("tset_tset0Contex");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tset_tset0ContexContext" + "'", str8, "Tset_tset0ContexContext");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("#");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("tset_tset0Contex");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("_\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset#" + "'", str7, "_tset#");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"tset_tset0Contex\"" + "'", str9, "\"tset_tset0Contex\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_d", false);
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\\n");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("#");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("tset_tset0Contex");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean13 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset#" + "'", str7, "_tset#");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"tset_tset0Contex\"" + "'", str9, "\"tset_tset0Contex\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getLanguage();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("__tset\\0Context");
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("_tset__\"\\\"____tset\\\"\"");
        java.lang.String str13 = python2Target1.getVersion();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset__tset\\0Context" + "'", str10, "_tset__tset\\0Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset__\"\\\"____tset\\\"\"Context" + "'", str12, "_tset__\"\\\"____tset\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_tset\"@\"");
        java.lang.String str13 = python2Target1.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("_\"\\\"____tset\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"@\"Context" + "'", str11, "_tset\"@\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\1" + "'", str13, "\\1");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getListLabel("_\\64");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        boolean boolean10 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\64" + "'", str8, "_\\64");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(0);
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

